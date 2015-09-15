package com.medicalproj.test;

import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = 
	{ 
		"classpath:com/medicalproj/resource/application-context.xml", 
		"classpath:com/medicalproj/resource/spring-dispatcher.xml"
	}) 
public class BaseTestUtil {
	protected static final Logger logger = Logger.getLogger(BaseTestUtil.class);  
	
}
