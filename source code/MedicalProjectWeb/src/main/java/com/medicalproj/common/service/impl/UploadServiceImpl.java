package com.medicalproj.common.service.impl;

import java.io.IOException;
import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.medicalproj.common.domain.UploadFile;
import com.medicalproj.common.domain.UploadFileExample;
import com.medicalproj.common.dto.view.FileView;
import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.IFileUploadService;
import com.medicalproj.common.service.IUploadService;
import com.medicalproj.common.util.FileUtil;
import com.medicalproj.common.util.FtpUtil;
import com.medicalproj.web.util.Constants;

@Service
public class UploadServiceImpl implements IUploadService {
	private Logger logger = Logger.getLogger(this.getClass());
	@Autowired
	private IFileUploadService fileUploadService;
	
	@Override
	public View<FileView> upload(MultipartFile file,Integer uploadUserId) throws ServiceException {
		View<FileView> view = new View<FileView>();
		try {
			if (file == null) {
				throw new ServiceException("文件上传出错");
			}

			//Date now = new Date();
			//int year = DateUtil.getYear(now);
			//int month = DateUtil.getMonth(now);
			long fileSize = file.getSize();
			
			
			if( !FileUtil.isFileSupport(file.getContentType()) ){
				throw new ServiceException("文件格式不支持.");
			}
			
			//String fileName = UUIDUtil.getUUID() + "." + suffix;
			FtpUtil.UploadResult res = null;
			try {
				res = FtpUtil.upload(file.getInputStream(),FileUtil.getSuffix(file.getOriginalFilename()));
				if( res == null ){
					throw new ServiceException("上传失败");
				}
			} catch (Exception e) {
				throw new ServiceException("上传文件失败",e);
			}

			// 保存文件
			String imageRelativePath = res.getRelativePath();
			int fileType = FileUtil.getType(file.getContentType());
			Integer imageId = fileUploadService.save(res.getFileName(),imageRelativePath,fileSize,fileType,uploadUserId);

			FileView fileView = new FileView();
			fileView.setPath(FtpUtil.getAbsPath(imageRelativePath));
			fileView.setId(imageId);
			
			view.setData(fileView);
			return view;
		} catch (ServiceException e) {
			view.setData(null);
			view.setMsg(e.getMessage());
			return view;
		}
	}

	@Override
	public View<FileView> upload(MultipartFile file, Integer uploadUserId, String uploadNo) throws ServiceException {
		View<FileView> view = new View<FileView>();
		try {
			if (file == null) {
				throw new ServiceException("文件上传出错");
			}

			//Date now = new Date();
			//int year = DateUtil.getYear(now);
			//int month = DateUtil.getMonth(now);
			long fileSize = file.getSize();
			
			if( !FileUtil.isFileSupport(file.getContentType()) ){
				throw new ServiceException("文件格式不支持.");
			}
			
			//String fileName = UUIDUtil.getUUID() + "." + suffix;
			FtpUtil.UploadResult res = null;
			try {
				res = FtpUtil.upload(file.getInputStream(),FileUtil.getSuffix(file.getOriginalFilename()));
				if( res == null ){
					throw new ServiceException("上传失败");
				}
			} catch (Exception e) {
				throw new ServiceException("上传文件失败",e);
			}

			// 保存文件
			String md5 = null;
			try {
				md5 = DigestUtils.md5Hex(file.getInputStream());
			} catch (IOException e) {
				throw new ServiceException("文件MD5计算失败");
			}
			String imageRelativePath = res.getRelativePath();
			int fileType = FileUtil.getType(file.getContentType());
			Integer imageId = fileUploadService.save(res.getFileName(),imageRelativePath,fileSize,fileType,uploadUserId,uploadNo,md5);

			FileView fileView = new FileView();
			fileView.setPath(FtpUtil.getAbsPath(imageRelativePath));
			fileView.setId(imageId);
			
			view.setData(fileView);
			return view;
		} catch (ServiceException e) {
			view.setData(null);
			view.setMsg(e.getMessage());
			return view;
		}
	}

	private boolean isJpgOrJpeg(MultipartFile file) {
		String contentType = file.getContentType();
		if( contentType.equals(Constants.CONTENT_TYPE_JPG_JPEG )){
			return true;
		}else if( file.getOriginalFilename().toUpperCase().endsWith(".JPG") || file.getOriginalFilename().toUpperCase().endsWith(".JPEG")){
			return true;
		}
		return false;
	}

}
