package com.learning.spring.debug.custom.supplier;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

public class SupplierBeanFactoryPostProcessors implements BeanFactoryPostProcessor {

    private static final Logger logger = LogManager.getLogger(SupplierBeanFactoryPostProcessors.class);


    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        logger.info("执行SupplierBeanFactoryPostProcessors#postProcessBeanFactory，设置BeanDefinition#instanceSupplier,通过supplier方式创建bean对象。");

        GenericBeanDefinition beanDefinition = (GenericBeanDefinition) beanFactory.getBeanDefinition("astronaut");

        beanDefinition.setInstanceSupplier(AstronautFactory::build);

    }
}
