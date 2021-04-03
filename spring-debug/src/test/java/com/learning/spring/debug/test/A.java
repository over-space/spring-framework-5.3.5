package com.learning.spring.debug.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class A implements ApplicationContextAware, BeanFactoryAware {

    private static final Logger logger = LoggerFactory.getLogger(A.class);


    public void initMethod(){
        logger.info("执行A#init-method方法");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        logger.info("通过继承BeanFactoryAware获取beanFactory");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        logger.info("通过继承ApplicationContextAware获取applicationContext");
    }
}