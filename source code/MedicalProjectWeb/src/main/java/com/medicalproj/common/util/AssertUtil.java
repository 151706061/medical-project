package com.medicalproj.common.util;

import java.util.List;

public class AssertUtil {

	public static boolean isNotEmpty(Object obj) {
		if( obj != null && obj.toString().length() != 0 ){
			return true;
		}
		return false;
	}

	public static boolean listIsNotEmpty(List list) {
		if( list != null && list.size() >0 ){
			return true;
		}
		return false;
	}

}
