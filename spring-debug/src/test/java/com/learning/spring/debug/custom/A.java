package com.learning.spring.debug.custom;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class A implements ApplicationContextAware, BeanFactoryAware, BeanPostProcessor {

    private static final Logger logger = LogManager.getLogger(A.class);

    private String name;

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

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        logger.info("执行BeanPostProcessor#postProcessBeforeInitialization");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        logger.info("执行BeanPostProcessor#postProcessAfterInitialization");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        logger.info("{}: say hello", name);
    }
}
