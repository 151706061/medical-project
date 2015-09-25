package com.medicalproj.common.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.log4j.Logger;

import com.medicalproj.web.util.Constants;

public class FtpUtil {
	private static Logger logger = Logger.getLogger(FtpUtil.class);
	public final static String FTP_URL = "127.0.0.1";
	public final static int FTP_PORT = 21;
	public final static String FTP_USER_NAME = "ftpuser";
	public final static String FTP_PASSWORD = "ftpuser";
	
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
            
            System.out.println("Start uploading first file");
            ftpClient.makeDirectory(path);
            
            boolean done = ftpClient.storeFile(path+"/" + fileName, fileInputStream);
        	fileInputStream.close();
        	if (done) {
        		logger.info("The file is uploaded successfully.");
        		UploadResult res = new UploadResult();
        		res.setFileName(fileName);
        		res.setRelativePath(path+"/" + fileName);
        		return res;
        	}
        	return null;
        } catch (Exception ex) {
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
		if( suffix==null ){
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
