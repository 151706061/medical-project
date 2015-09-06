package com.medicalproj.web.controller;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.medicalproj.web.dto.session.User;
import com.medicalproj.web.util.Constants;

public class WebBaseController {
	protected Logger logger = Logger.getLogger(this.getClass());
	
	protected User getLoginUserId(HttpSession session){
		Object obj = session.getAttribute(Constants.SESSION_KEY_LOGIN_USER_ID);
		if( obj != null ){
			return (User)obj;
		}
		return null;
	}
}