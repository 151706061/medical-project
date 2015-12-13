package com.medicalproj.common.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.medicalproj.common.dao.MedicalCaseMapper;
import com.medicalproj.common.dao.MedicalCaseViewMapper;
import com.medicalproj.common.domain.Instance;
import com.medicalproj.common.domain.MedicalCase;
import com.medicalproj.common.domain.MedicalCaseView;
import com.medicalproj.common.domain.MedicalCaseViewExample;
import com.medicalproj.common.domain.Series;
import com.medicalproj.common.domain.Study;
import com.medicalproj.common.domain.UploadFile;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.IFileUploadService;
import com.medicalproj.common.service.IInstanceService;
import com.medicalproj.common.service.IMedicalCaseService;
import com.medicalproj.common.service.IMedicalCaseViewService;
import com.medicalproj.common.service.ISeriesService;
import com.medicalproj.common.service.IStudyService;
import com.medicalproj.common.util.FileUtil;
import com.medicalproj.common.util.FtpUtil;
import com.medicalproj.common.util.PagerHelper;
import com.medicalproj.common.util.UUIDUtil;
import com.medicalproj.web.dto.view.ListMedicalCaseParam;
import com.medicalproj.web.util.Constants;

import eden.dicomparser.DicomParser;
import eden.dicomparser.data.DicomData;

@Service
public class MedicalCaseServiceImpl implements IMedicalCaseService {
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private MedicalCaseMapper medicalCaseMapper;
	
	@Autowired
	private IStudyService studyService;
	
	@Autowired
	private ISeriesService seriesService;
	
	@Autowired
	private IInstanceService instanceService;
	
	@Autowired
	private IFileUploadService fileUploadServcie;
	
	@Autowired
	private IMedicalCaseViewService medicalCaseViewService;
	
	@Autowired 
	private MedicalCaseViewMapper medicalCaseViewMapper;
	
	@Override
	public MedicalCase initNewMedicalCase(Integer creatorUserId) throws ServiceException {
		try {
			MedicalCase medicalCase = new MedicalCase();
			medicalCase.setCreateTime(new Date());
			medicalCase.setCreatorUserId(creatorUserId);
			medicalCase.setStatus(Constants.MEDICAL_CASE_STATUS_OPEN);
			
			saveOrUpdate(medicalCase);
			return medicalCase;
		} catch (Exception e) {
			logger.error(e);
			throw new ServiceException(e);
		}
	}

	/*@Override
	public void doComplete(Integer medicalCaseId) throws ServiceException {
		try {
			if( medicalCaseId == null ){
				throw new ServiceException("病例ID不可为null");
			}
			
			MedicalCase medicalCase = this.getById(medicalCaseId);
			if( medicalCase == null ){
				throw new ServiceException("病例不存在");
			}
			
			if( medicalCase.getIsUploadComplete() == null ){
				throw new ServiceException("病例完成状态异常");
			}
			
			if( medicalCase.getIsUploadComplete().equals(Constants.MEDICAL_CASE_IS_UPLOAD_COMPLETE_TRUE)){
				throw new ServiceException("病例已经上传完成,不可继续上传");
			}
			
			medicalCase.setIsUploadComplete(Constants.MEDICAL_CASE_IS_UPLOAD_COMPLETE_TRUE);
			this.saveOrUpdate(medicalCase);
		} catch (Exception e) {
			logger.error(e);
			throw new ServiceException(e);
		}
		
		
	}*/

	@Override
	public List<MedicalCaseView> listAllMedicalCaseViewByOwnerId(Integer ownerId)
			throws ServiceException {
		return medicalCaseViewService.listAllByOwnerId(ownerId);
	}

	@Override
	public void addDicomToMedicalCase(Integer medicalCaseId, MultipartFile dicomFile,
			Integer userId) throws ServiceException {
		try {
			if( medicalCaseId == null || dicomFile == null || userId == null ){
				throw new ServiceException("参数错误");
			}
			
			MedicalCase mcase = this.getById(medicalCaseId);
			if( mcase == null ){
				throw new ServiceException("病例不存在");
			}
			
			// upload dicom file to ftp server
			FtpUtil.UploadResult res = FtpUtil.upload(dicomFile.getInputStream(),FileUtil.getSuffix(dicomFile.getOriginalFilename()));
			Integer uploadDicomFileId = null;
			Integer uploadJpgFileId = null;
			if( res == null ){
				throw new ServiceException("上传失败");
			}else{
				// save upload dicom file
				uploadDicomFileId = fileUploadServcie.save(res.getFileName(), res.getRelativePath(), dicomFile.getSize(), Constants.UPLOAD_FILE_TYPE_DICOM, userId);
				
				FileInputStream jpgFileIn = null;
				File jpgFile = null;
				File dcmFile = null;
				try{
					/* convert to jpg and save */
					// convert dcm to jpg
					String tmpdir = System.getProperty("java.io.tmpdir");
					
					String jpgFilePath = tmpdir + UUIDUtil.getUUID() + ".jpg";
					logger.info("创建图片临时文件:" + jpgFilePath);
					
					String dcmSuffix = FileUtil.getSuffix(dicomFile.getName());
					String dcmFilePath = tmpdir + UUIDUtil.getUUID() + dcmSuffix;
					dcmFile = new File(dcmFilePath);
					FileUtil.copy(dicomFile.getInputStream(),dcmFile);
					DicomParser.getInstance().dcm2jpg(dcmFilePath, jpgFilePath);
					
					// upload and save jpg to db
					jpgFile = new File(jpgFilePath);
					jpgFileIn = new FileInputStream(jpgFile);
	
					FtpUtil.UploadResult jpgRes = FtpUtil.upload(jpgFileIn,Constants.FILE_SUFFIX_JPG);
					uploadJpgFileId = fileUploadServcie.save(jpgRes.getFileName(), jpgRes.getRelativePath(), jpgFile.length(), Constants.UPLOAD_FILE_TYPE_DICOM, userId);
				}catch(Exception e){
					logger.error(e);
					throw new ServiceException(e.getMessage(),e);
				}finally{
					if( jpgFileIn != null ){
						try {
							jpgFileIn.close();
						} catch (Exception e) {
							logger.error(e);
							e.printStackTrace();
						}
						try {
							jpgFile.delete();
							dcmFile.delete();
						} catch (Exception e) {
							logger.error(e);
							e.printStackTrace();
						}
					}
				}
			}
			
			DicomData dicom = DicomParser.getInstance().read(dicomFile.getInputStream());
			// create study
			Study study = studyService.createStydyIfNotExists(medicalCaseId ,dicom);
			
			if( study != null ){
				Integer studyDomainId = study.getId();
				
				Series series = seriesService.createSeriesIfNotExists(studyDomainId,dicom);
				
				if( series != null ){
					Integer seriesDomainId = series.getId();
					
					Instance instance = instanceService.createInstanceIfNotExists(seriesDomainId, dicom, uploadDicomFileId,uploadJpgFileId);
				}
			}
		} catch (Exception e) {
			logger.error(e);
			throw new ServiceException(e);
		}
	}
	
	@Override
	public Integer createMedicalCaseForPatient(List<UploadFile> dcmUploadFileList, Integer processUserId)
			throws ServiceException {
		try {
			if( dcmUploadFileList == null || processUserId == null ){
				throw new ServiceException("参数错误");
			}
			
			MedicalCase mcase = this.initNewMedicalCase(processUserId);
			if( mcase == null ){
				throw new ServiceException("病例创建失败");
			}
				
			for(UploadFile file: dcmUploadFileList){
				Integer uploadJpgFileId = null;
				InputStream in = null;
				// convert to jpg, upload to ftp and save to db
				FileInputStream jpgFileIn = null;
				File jpgFile = null;
				File dcmFile = null;
				String jpgFilePath = null;
				FileOutputStream dcmFileOutputStream = null;
				try{
					String filePath = file.getPath().substring(0, file.getPath().lastIndexOf("/"));
					String fileName = file.getPath().substring(file.getPath().lastIndexOf("/")+1);
					in = FtpUtil.readFile(filePath, fileName);
					in.mark( in.available() + 1);
					
					/* convert to jpg and save */
					// convert dcm to jpg
					String tmpdir = System.getProperty("java.io.tmpdir");
					
					jpgFilePath = tmpdir + UUIDUtil.getUUID() + ".jpg";
					logger.info("创建图片临时文件:" + jpgFilePath);
					
					String dcmFilePath = tmpdir + file.getFileName();
					dcmFileOutputStream = new FileOutputStream(dcmFilePath);
					IOUtils.copy(in, dcmFileOutputStream);
					DicomParser.getInstance().dcm2jpg(dcmFilePath, jpgFilePath);
					
					// upload and save jpg to db
					jpgFile = new File(jpgFilePath);
					jpgFileIn = new FileInputStream(jpgFile);
	
					FtpUtil.UploadResult jpgRes = FtpUtil.upload(jpgFileIn,Constants.FILE_SUFFIX_JPG);
					uploadJpgFileId = fileUploadServcie.save(jpgRes.getFileName(), jpgRes.getRelativePath(), jpgFile.length(), Constants.UPLOAD_FILE_TYPE_DICOM, processUserId);
				
					/* create study ,series , instance */
					in.reset();
					DicomData dicom = DicomParser.getInstance().read(in);
					
					//update medical case
					this.update(mcase,dicom);
					
					// create study
					Study study = studyService.createStydyIfNotExists(mcase.getId() ,dicom);
					
					if( study != null ){
						Integer studyDomainId = study.getId();
						
						Series series = seriesService.createSeriesIfNotExists(studyDomainId,dicom);
						
						if( series != null ){
							Integer seriesDomainId = series.getId();
							
							Instance instance = instanceService.createInstanceIfNotExists(seriesDomainId, dicom, file.getId(),uploadJpgFileId);
						}
					}
					
				}catch(Exception e){
					logger.error(e);
					throw new ServiceException(e.getMessage(),e);
				}finally{
					if( jpgFileIn != null ){
						try {
							jpgFileIn.close();
						} catch (Exception e) {
							logger.error(e);
							e.printStackTrace();
						}
						try {
							if( dcmFile != null ){
								dcmFile.delete();
							}
							if( jpgFile != null ){
								jpgFile.delete();
							}

						} catch (Exception e) {
							logger.error(e);
							e.printStackTrace();
						}
					}
					
					if( dcmFileOutputStream != null ){
						try {
							dcmFileOutputStream.close();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					
					if( in != null ){
						try {
							in.close();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			}
			return mcase.getId();
		} catch (Exception e) {
			logger.error(e);
			throw new ServiceException(e);
		}
	}

	private void update(MedicalCase mcase, DicomData dicom) {
		if( mcase != null ){
			mcase.setPatientBirthday(dicom.getPatientBirthDate());
			mcase.setPatientId(dicom.getPatientId());
			mcase.setPatientName(dicom.getPatientName());
			mcase.setPatientSex(dicom.getPatientSex());
			mcase.setPatientWeight(dicom.getPatientWeight());
			this.saveOrUpdate(mcase);
		}
		
	}

	@Override
	public MedicalCaseView getMedicalCaseViewById(Integer medicalCaseId)
			throws ServiceException {
		return medicalCaseViewService.getById(medicalCaseId);
	}

	@Override
	public List<MedicalCaseView> listMedicalCaseViewByCond(ListMedicalCaseParam param) throws ServiceException {
		MedicalCaseViewExample example = trans2MedicalCaseViewExample(param);
		
		int start = PagerHelper.getStart(param.getPage(), param.getPageSize());
		RowBounds bounds = new RowBounds(start, param.getPageSize());
		return medicalCaseViewMapper.selectByExampleWithRowbounds(example, bounds);
	}

	private MedicalCaseViewExample trans2MedicalCaseViewExample(ListMedicalCaseParam param) {
		if( param == null ){
			return new MedicalCaseViewExample();
		}
		MedicalCaseViewExample example = new MedicalCaseViewExample();
		MedicalCaseViewExample.Criteria c = example.createCriteria();
		c.andCreatorUserIdEqualTo(param.getOwnerUserId());
		
		example.setOrderByClause("CREATE_TIME DESC");
		return example;
	}

	@Override
	public int countMedicalCaseViewByCond(ListMedicalCaseParam param) throws ServiceException {
		MedicalCaseViewExample example = trans2MedicalCaseViewExample(param);
		return medicalCaseViewMapper.countByExample(example);
	}

	@Override
	public MedicalCase getById(Integer medicalCaseId) throws ServiceException {
		return medicalCaseMapper.selectByPrimaryKey(medicalCaseId);
	}

	@Override
	public void saveOrUpdate(MedicalCase domain) throws ServiceException {
		if( domain != null ){
			if( domain.getId() == null ){
				medicalCaseMapper.insertSelective(domain);
			}else{
				medicalCaseMapper.updateByPrimaryKeySelective(domain);
			}
		}
		
	}

	@Override
	public void delMedicalCase(Integer medicalCaseId) throws ServiceException {
		List<Study> studyList = studyService.listAllStudyByMedicalCaseId(medicalCaseId);
		
		for(Study study : studyList ) {
			List<Series> seriesList = seriesService.listAllSeriesByStudyId(study.getId());
			
			for(Series series : seriesList ){
				List<Instance> instanceList = instanceService.listAllInstanceBySeriesId(series.getId());
				
				instanceService.delete(instanceList);
			}
			
			seriesService.delete(seriesList);
		}
		
		studyService.delete(studyList);
		
		this.deleteById(medicalCaseId);
	}

	private void deleteById(Integer medicalCaseId) {
		medicalCaseMapper.deleteByPrimaryKey(medicalCaseId);
	}
	
}
