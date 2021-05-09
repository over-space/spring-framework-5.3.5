package com.learning.spring.debug.custom.bean.factory.post.processor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @see org.springframework.context.support.PostProcessorRegistrationDelegate#160
 */
public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    private static final Logger logger = LogManager.getLogger(CustomBeanFactoryPostProcessor.class);


    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        logger.info("执行自定义实现BeanFactoryPostProcessor#postProcessBeanFactory方法。");
    }
}
