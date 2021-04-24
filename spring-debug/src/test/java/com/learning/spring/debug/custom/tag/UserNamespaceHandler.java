package com.learning.spring.debug.custom.tag;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class UserNamespaceHandler extends NamespaceHandlerSupport {

    private static final Logger logger = LogManager.getLogger(UserNamespaceHandler.class);


    @Override
    public void init() {
        logger.info("初始化自定义标签解析类！");
        registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
    }
}
