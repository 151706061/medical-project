package com.medicalproj.common.util;

public class TemplateUtil {
	public static final String TMPL_MOBILE_VERIFY_CODE = "您的证码为:{{1}}";
	
	public static String replace(String template,int i, String holderValue) {
		return template.replace("{{" + i + "}}", holderValue);
	}

}
