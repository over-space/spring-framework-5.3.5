package com.learning.spring.debug.custom.instantiation_aware_bean_post_processors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.cglib.proxy.Enhancer;

public class CustomInstantiationAwareBeanPostProcessors implements InstantiationAwareBeanPostProcessor {

    private static final Logger logger = LogManager.getLogger(CustomInstantiationAwareBeanPostProcessors.class);


    /**
     * Bean初始化前置处理方法
     * @param bean the new bean instance
     * @param beanName the name of the bean
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        logger.info("执行CustomInstantiationAwareBeanPostProcessors#postProcessBeforeInitialization");
        return InstantiationAwareBeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    /**
     * Bean初始化后置处理方法
     * @param bean the new bean instance
     * @param beanName the name of the bean
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        logger.info("执行CustomInstantiationAwareBeanPostProcessors#postProcessAfterInitialization");
        return InstantiationAwareBeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

    /**
     * Bean实例化前置处理方法
     * @param beanClass the class of the bean to be instantiated
     * @param beanName the name of the bean
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        logger.info("执行CustomInstantiationAwareBeanPostProcessors#postProcessBeforeInstantiation");

        if(beanClass == CustomService.class){
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(CustomService.class);
            enhancer.setCallback(new CustomServiceInterceptor());
            return enhancer.create();
        }
        return null;
    }

    /**
     * Bean实例化后置处理方法
     * @param bean the bean instance created, with properties not having been set yet
     * @param beanName the name of the bean
     * @return
     * @throws BeansException
     */
    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        logger.info("执行CustomInstantiationAwareBeanPostProcessors#postProcessAfterInstantiation");

        // *可以在这里进行bean的初始化操作，在这里会执行org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean
        // *通过返回值控制是否需要执行后续初始化过程，false：不进行后续处理，true: 继续执行后续处理，属性值可能会被覆盖。

        return InstantiationAwareBeanPostProcessor.super.postProcessAfterInstantiation(bean, beanName);
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        logger.info("执行CustomInstantiationAwareBeanPostProcessors#postProcessProperties");

        return InstantiationAwareBeanPostProcessor.super.postProcessProperties(pvs, bean, beanName);
    }
}
