package com.medicalproj.common.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Date;

import org.apache.commons.io.IOUtils;
import org.apache.commons.net.PrintCommandListener;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.log4j.Logger;

import com.medicalproj.web.util.Constants;

public class FtpUtil {
	private static Logger logger = Logger.getLogger(FtpUtil.class);
	public final static String FTP_URL = "127.0.0.1";
	public final static int FTP_PORT = 21;
	public final static String FTP_USER_NAME = "ftpuser";
	public final static String FTP_PASSWORD = "ftpuser";
	
	
	public static BufferedInputStream readFile(String ftpPath, String fileName) throws Exception {  
		FTPClient ftpClient = null;
		FileOutputStream fos = null;
		File dcmTmpFile = null;
        try {
			InputStream in = null;  
			ftpClient = new FTPClient();
			
			ftpClient.addProtocolCommandListener(new PrintCommandListener(new PrintWriter(System.out)));
	        int reply;
	        ftpClient.connect(FTP_URL,FTP_PORT);
	        reply = ftpClient.getReplyCode();
	        if (!FTPReply.isPositiveCompletion(reply)) {
	        	ftpClient.disconnect();
	            throw new Exception("Exception in connecting to FTP Server");
	        }
	        ftpClient.login(FTP_USER_NAME, FTP_PASSWORD);
	        ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
	        ftpClient.enterLocalPassiveMode();
			//ftpClient.setControlEncoding("UTF-8"); // 中文支持  
			ftpClient.changeWorkingDirectory(ftpPath);  
			in = ftpClient.retrieveFileStream(fileName);  
			
			// save to tmp directory tmpdir
			String tmpdir = System.getProperty("java.io.tmpdir");
			
			String dcmTmpPath = tmpdir + UUIDUtil.getUUID();
			dcmTmpFile = new File(dcmTmpPath);
			fos = new FileOutputStream(dcmTmpFile);
			IOUtils.copy(in, fos);
			
			return new BufferedInputStream(new FileInputStream(dcmTmpPath));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally{
			if (ftpClient.isConnected()) {
                try {
                	ftpClient.logout();
                	ftpClient.disconnect();
                } catch (IOException f) {
                    // do nothing as file is already downloaded from FTP server
                }
            }
			
			if( fos != null ){
				fos.close();
			}
			
			if( dcmTmpFile != null && dcmTmpFile.exists()){
				dcmTmpFile.delete();
			}
		}
	}
	
	public static UploadResult upload(InputStream fileInputStream,String suffix)throws Exception{
		
		Date now = new Date();
		int year = DateUtil.getYear(now);
		int month = DateUtil.getMonth(now);
		//String suffix = FileUtil.getSuffix(file.getOriginalFilename());
		//long fileSize = fileInputStream
		
		String fileName = generateFileName(suffix);
		String path = year + "/" + month;
		
		
		FTPClient ftpClient = new FTPClient();
        try {
 
            ftpClient.connect(FTP_URL, FTP_PORT);
            boolean isLoginSuccess = ftpClient.login(FTP_USER_NAME, FTP_PASSWORD);
            if( !isLoginSuccess ){
            	throw new Exception("ftp login failure.");
            }
            ftpClient.enterLocalPassiveMode();
 
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
            ftpClient.setControlEncoding("UTF-8");
            
            System.out.println("uploading file..." + path+"/" + fileName);
            ftpClient.makeDirectory(path);
            
            boolean done = ftpClient.storeFile(path+"/" + fileName, fileInputStream);
            System.out.println("uploading file..." + done + ",replyCode:" + ftpClient.getReplyCode());
        	fileInputStream.close();
        	if (done) {
        		System.out.println("The file is uploaded successfully.");
        		UploadResult res = new UploadResult();
        		res.setFileName(fileName);
        		res.setRelativePath(path+"/" + fileName);
        		return res;
        	}
        	return null;
        } catch (Exception ex) {
        	ex.printStackTrace();
            logger.error("Error: " + ex.getMessage(),ex);
            return null;
        } finally {
            try {
                if (ftpClient.isConnected()) {
                    ftpClient.logout();
                    ftpClient.disconnect();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
	}

	private static String generateFileName(String suffix) {
		if( suffix==null || suffix.trim().equals("") ){
			return UUIDUtil.getUUID();
		}else{
			return UUIDUtil.getUUID() + "." + suffix;
		}
	}

	public static String getAbsPath(String relativePath) {
		return Constants.FTP_HTTP_BASE_URL + relativePath;
	}
	
	public static class UploadResult{
		private String fileName;
		private String relativePath;
		public String getFileName() {
			return fileName;
		}
		public void setFileName(String fileName) {
			this.fileName = fileName;
		}
		public String getRelativePath() {
			return relativePath;
		}
		public void setRelativePath(String relativePath) {
			this.relativePath = relativePath;
		}
	}
	
	
}
