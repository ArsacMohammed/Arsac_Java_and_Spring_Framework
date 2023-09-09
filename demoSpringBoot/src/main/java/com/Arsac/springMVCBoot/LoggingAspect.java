package com.Arsac.springMVCBoot;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect

public class LoggingAspect {
	@Before("execution(public * com.Arsac.springMVCBoot.AlienControlller.getAliens())")
	public void log() {
		System.out.println("Execution of getMethod Initialised......");
	}
}
///// refer the spring aop doc for further details...... 
/*

1. **Aspect Class**: A class that defines special actions to be taken in response to certain events or conditions in your application.
2. **Advice Methods**: Methods within an aspect class that specify what actions to take in response to specific events or conditions.
3. **Pointcut Expressions**: Expressions that determine when and where advice methods should be applied in your code.
4. **AspectJ Integration**: Integration of AspectJ, a powerful aspect-oriented programming framework, into Spring Boot for defining aspects and pointcuts.
5. **Cross-Cutting Concerns**: Cross-cutting concerns are aspects of your application that affect multiple parts, such as logging, security, and transaction management.
6. **Join Points**: Specific points in your application's execution where advice methods can be triggered, such as method invocations or exception handling.
7. **AOP Framework**: Aspect-Oriented Programming framework, which provides tools and mechanisms to define and apply aspects.
8. **Annotations**: Special labels or markers used in Spring Boot to indicate the roles of classes or methods, such as `@Aspect` for aspect classes.
9. **Component**: A class or module in your application that performs a specific function, often managed by Spring Boot when marked with `@Component`.
*/