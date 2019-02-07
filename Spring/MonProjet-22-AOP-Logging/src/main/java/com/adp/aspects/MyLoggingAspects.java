package com.adp.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspects {
	
	private Logger logger = LoggerFactory.getLogger(MyLoggingAspects.class);
	
	@Around("execution(* com.adp.domain.Calcul.*(..)) ")
	public void doLog(ProceedingJoinPoint pjp) {
		  logger.error(">>>>> DEBUT    LOG by AOP >>>>>>>");
		try {
			pjp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		logger.error(">>>>> FIN    LOG by AOP >>>>>>>");
	}

}
