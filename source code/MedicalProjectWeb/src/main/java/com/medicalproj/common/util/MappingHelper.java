package com.medicalproj.common.util;

import java.util.HashMap;
import java.util.Map;

public class MappingHelper {
	private static Map<Integer , String> userTypeMap ;
	
	static {
		userTypeMap = new HashMap<Integer, String>();
		userTypeMap.put(1, "普通用户");
		userTypeMap.put(2, "医师");
		userTypeMap.put(3, "专家");
		userTypeMap.put(4, "企业用户");
	}

	public static String getUserTypeValueByCode(Integer code) {
		return userTypeMap.get(code);
	}
	
	
}
