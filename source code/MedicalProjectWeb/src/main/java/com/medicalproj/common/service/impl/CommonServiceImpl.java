package com.medicalproj.common.service.impl;

import java.io.IOException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalproj.common.domain.User;
import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.ICommonService;
import com.medicalproj.common.service.IUserService;
import com.medicalproj.common.util.DateUtil;
import com.medicalproj.common.util.RadomNumberUtil;
import com.medicalproj.common.util.SMSUtil;
import com.medicalproj.common.util.TemplateUtil;

@Service
public class CommonServiceImpl implements ICommonService {
	@Autowired
	private IUserService userService;
	
	@Override
	public View<Boolean> getVerifyCode(String mobile) throws ServiceException {
		View<Boolean> view = new View<Boolean>();
		try {
			if( mobile == null ){
				throw new ServiceException("请输入手机号");
			}
			
			User user = userService.getByMobile(mobile);
			if( user == null ){
				//初次获取，初始化数据
				user = userService.initUserByMobile(mobile);
			}
			
			Date now = new Date();
			if( user != null && user.getVerifyCodeUpdateTime() != null ){
				//判断是否过于频繁
				long secondDiff = DateUtil.secondDiff(user.getVerifyCodeUpdateTime(), now);
				if( secondDiff < 60 ){
					throw new ServiceException("1分钟内只能获取一次验证码，请稍候再试");
				}
			}
			
			// 更新注册码、注册码最后更新时间
			String verifyCode = String.valueOf(RadomNumberUtil.get6BitRadomNumber());
			user.setVerifyCode(verifyCode);
			user.setVerifyCodeUpdateTime(now);
			userService.saveOrUpdate(user);

			// 发送验证码短信
			String content = TemplateUtil.replace(TemplateUtil.TMPL_MOBILE_VERIFY_CODE ,1,verifyCode);
			SMSUtil.sendSms(mobile, content);
			
			view.setData(true);
			return view;
		} catch (IOException e) {
			view.setMsg(e.getMessage());
			view.setData(false);
			return view;
		}
	}
	
	

}
