package com.revature.aspects;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

	/**
	 * Common QC Questions:
	 * 1. All terminology. 
	 * 2. What are the different kinds of advice?
	 * 3. In Around advice, how do I call the join point method?
	 * 4. What is the format for a pointcut?
	 */
	
	Logger log = Logger.getRootLogger();
	
	// @Before is the advice
	@Around("execution(public * *(..))")
	public void logging(ProceedingJoinPoint pjp) throws Throwable {
		log.trace("Method being called: " + pjp.getSignature());
		pjp.proceed();
	}
	
	@Around("execution(public int *(..))")
	public int manipulate(ProceedingJoinPoint pjp) throws Throwable {
		int x = (Integer) pjp.proceed();
		return x+1;
	}
	           // V pointcut
	@Around("execution(public int *(..))")
	public int manipulate2(ProceedingJoinPoint pjp) throws Throwable {
		int x = (Integer) pjp.proceed();
		return x+1;
	}
}
