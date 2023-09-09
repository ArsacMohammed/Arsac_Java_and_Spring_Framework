package com.Arsac.springMVCBoot;

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
	public void log() {
		LOGGER.info("Execution of getMethod Initialised......");
	}
}
