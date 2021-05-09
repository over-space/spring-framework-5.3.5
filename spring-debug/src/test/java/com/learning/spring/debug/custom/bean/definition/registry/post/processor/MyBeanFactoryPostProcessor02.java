package com.learning.spring.debug.custom.bean.definition.registry.post.processor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;

public class MyBeanFactoryPostProcessor02 implements BeanFactoryPostProcessor, Ordered {

    private static final Logger logger = LogManager.getLogger(MyBeanFactoryPostProcessor02.class);


    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        logger.info("通过实现CustomBeanDefinitionRegistryPostProcessor#postProcessBeanDefinitionRegistry注册BeanFactoryPostProcessor类");
    }

    @Override
    public int getOrder() {
        return 5;
    }
}
