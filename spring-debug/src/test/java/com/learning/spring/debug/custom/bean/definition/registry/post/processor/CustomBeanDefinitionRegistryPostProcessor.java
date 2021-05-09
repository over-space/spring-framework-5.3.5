package com.learning.spring.debug.custom.bean.definition.registry.post.processor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;

public class CustomBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    private static final Logger logger = LogManager.getLogger(CustomBeanDefinitionRegistryPostProcessor.class);


    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        logger.info("执行CustomBeanDefinitionRegistryPostProcessor#postProcessBeanFactory");
    }

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        logger.info("执行CustomBeanDefinitionRegistryPostProcessor#postProcessBeanDefinitionRegistry");

        // 第一种方式
        // registry.registerBeanDefinition("student", new RootBeanDefinition(Student.class));

        // 第二种方式
        registry.registerBeanDefinition("student", BeanDefinitionBuilder.rootBeanDefinition(Student.class)
                .addPropertyValue("name", "lisi")
                .getBeanDefinition());

        // 注册一个BeanFactoryPostProcessor
        registry.registerBeanDefinition(MyBeanFactoryPostProcessor01.class.getSimpleName(), new RootBeanDefinition(MyBeanFactoryPostProcessor01.class));
        registry.registerBeanDefinition(MyBeanFactoryPostProcessor02.class.getSimpleName(), new RootBeanDefinition(MyBeanFactoryPostProcessor02.class));
    }
}
