package com.medicalproj.common.util;

import java.util.HashMap;
import java.util.Map;

import com.medicalproj.web.util.Constants;

public class FileUtil {
	private static Map<String,Integer> fileContentTypeAndDbTypeMap;
	
	static{
		fileContentTypeAndDbTypeMap = new HashMap<String,Integer>();
		fileContentTypeAndDbTypeMap.put("image/jpeg", Constants.UPLOAD_FILE_TYPE_JPEG);
		fileContentTypeAndDbTypeMap.put("image/png", Constants.UPLOAD_FILE_TYPE_PNG);
		fileContentTypeAndDbTypeMap.put("application/dicom", Constants.UPLOAD_FILE_TYPE_DICOM);
		
	}
	public static String getSuffix(String fileName) {
		if( fileName == null ){
			return null;
		}
		if( fileName.contains(".") ){
			return fileName.substring(fileName.lastIndexOf(".")+1);
		}else{
			return null;
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

}
