package com.medicalproj.common.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.log4j.Logger;

public class FtpUtil {
	private static Logger logger = Logger.getLogger(FtpUtil.class);
	public final static String FTP_HTTP_BASE_URL = "http://localhost:8080/ftp";
	public final static String FTP_URL = "127.0.0.1";
	public final static int FTP_PORT = 1212;
	public final static String FTP_USER_NAME = "test";
	public final static String FTP_PASSWORD = "test";
	
	public static void upload(InputStream fileInputStream,String path,String fileName)throws Exception{
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
        	}
 
        } catch (Exception ex) {
            logger.error("Error: " + ex.getMessage(),ex);
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

}
