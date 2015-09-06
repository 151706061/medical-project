package com.medicalproj.common.util;

public class FileUtil {

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

}
