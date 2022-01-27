package com.learning.spring.debug.custom.aop;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author lifang
 * @since 2022/1/27
 */
public class LoggerAspectHandler {

    private static final Logger logger = LogManager.getLogger(LoggerAspectHandler.class);


    public void before(JoinPoint joinpoint) {
        logger.info("执行LoggerAspectHandler#before...");
    }

    public void after(JoinPoint joinpoint) {
        logger.info("执行LoggerAspectHandler#after...");
    }

    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        logger.info("执行LoggerAspectHandler#around开始...");
        Object result = null;
        try {
            result = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            logger.info(e.getMessage());
        }
        logger.info("执行LoggerAspectHandler#around结束...");
        return result;
    }

    public void afterThrowing(JoinPoint joinPoint) {
        logger.info("执行LoggerAspectHandler#afterThrowing...");
    }

    public void afterReturning(JoinPoint joinPoint) {
        logger.info("执行LoggerAspectHandler#afterReturning...");
    }
}
