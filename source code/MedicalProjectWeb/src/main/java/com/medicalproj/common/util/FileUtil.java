package com.medicalproj.common.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.medicalproj.web.util.Constants;

public class FileUtil {
	private static Logger logger = Logger.getLogger(FileUtil.class);
	private static Map<String,Integer> fileContentTypeAndDbTypeMap;
	
	static{
		fileContentTypeAndDbTypeMap = new HashMap<String,Integer>();
		fileContentTypeAndDbTypeMap.put(Constants.CONTENT_TYPE_JPG_JPEG, Constants.UPLOAD_FILE_TYPE_JPEG);
		fileContentTypeAndDbTypeMap.put(Constants.CONTENT_TYPE_PNG, Constants.UPLOAD_FILE_TYPE_PNG);
		fileContentTypeAndDbTypeMap.put(Constants.CONTENT_TYPE_DICOM, Constants.UPLOAD_FILE_TYPE_DICOM);
		
	}
	public static String getSuffix(String fileName) {
		if( fileName == null ){
			return null;
		}
		if( fileName.contains(".") ){
			return fileName.substring(fileName.lastIndexOf(".")+1);
		}else{
			return "";
		}
	}

	/*public static int getTypeBySuffix(String suffix) {
		if( suffix != null ){
			if(suffix.toUpperCase().equals("JPG") ){
				return Constants.UPLOAD_FILE_TYPE_JPG;
			}else if(suffix.toUpperCase().equals("JPEG") ){
				return Constants.UPLOAD_FILE_TYPE_JPEG;
			}else if(suffix.toUpperCase().equals("PNG") ){
				return Constants.UPLOAD_FILE_TYPE_PNG;
			}
		}
		return 0;
	}*/

	public static int getType(String contentType) {
		return fileContentTypeAndDbTypeMap.get(contentType);
	}

	public static boolean isFileSupport(String contentType) {
		if( fileContentTypeAndDbTypeMap.containsKey(contentType) ){
			return true;
		}
		return false;
	}

	public static boolean isDicomFile(String contentType) {
		if( contentType != null && (contentType.equals(Constants.CONTENT_TYPE_DICOM) || contentType.equals(Constants.CONTENT_TYPE_OCTET_STREAM))){
			return true;
		}
		return false;
	}

	public static void copy(InputStream inputStream, File dcmFile) throws IOException {
		if( inputStream != null ){
			if( !dcmFile.exists() ){
				dcmFile.createNewFile();
			}
			FileOutputStream fout = null;
			try{
				fout = new FileOutputStream(dcmFile);
				byte[] buffer = new byte[1024];
				while( inputStream.read(buffer) != -1 ){
					fout.write(buffer);
				}
				fout.flush();
			}catch(Exception e){
				logger.error(e);
				return;
			}finally{
				if( fout != null ){
					try {
						fout.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			
		}
		
	}

}
