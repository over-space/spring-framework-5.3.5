package com.learning.spring.debug.custom.tag;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    private static final Logger logger = LogManager.getLogger(UserBeanDefinitionParser.class);


    @Override
    protected Class<?> getBeanClass(Element element) {
        return User.class;
    }


    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        logger.info("自定义标签，自定义属性解析。");

        String username = element.getAttribute("username");
        if (StringUtils.hasText(username)) {
            builder.addPropertyValue("username", username);
        }

        String password = element.getAttribute("password");
        if (StringUtils.hasText(username)) {
            builder.addPropertyValue("password", password);
        }

        String email = element.getAttribute("email");
        if (StringUtils.hasText(username)) {
            builder.addPropertyValue("email", email);
        }

        String age = element.getAttribute("age");
        if (StringUtils.hasText(age)) {
            builder.addPropertyValue("age", age);
        }
    }
}
