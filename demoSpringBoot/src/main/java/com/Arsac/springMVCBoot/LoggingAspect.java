package com.Arsac.springMVCBoot;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect

public class LoggingAspect {
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);
	@Before("execution(public * com.Arsac.springMVCBoot.AlienControlller.getAliens())")
	public void logBefore() {
		LOGGER.info("Execution of getMethod Initialised......");
	}
	
	
	@After("execution(public * com.Arsac.springMVCBoot.AlienControlller.getAliens())")
	public void logAfter() {
		LOGGER.info("Execution of getMethod is completed......");
	}// by default this @After is After(finally) wrt spring aop doc 
}
