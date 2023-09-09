package com.Arsac.springMVCBoot;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
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
	
	
	@AfterReturning("execution(public * com.Arsac.springMVCBoot.AlienControlller.getAliens())")
	public void logAfterReturning() {
		LOGGER.info("Execution successfull....");
	}// by default this @AfterReturning  show only after successul execution.
	
	@AfterThrowing("execution(public * com.Arsac.springMVCBoot.AlienControlller.getAliens())")
	public void logAfterException() {
		LOGGER.info("issue....");
	}// this will show when issue or exception arises
}

