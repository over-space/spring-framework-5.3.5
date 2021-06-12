package com.learning.spring.debug.custom;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.FactoryBean;

public class BFactoryBean implements FactoryBean<B> {

    private static final Logger logger = LogManager.getLogger(BFactoryBean.class);


    @Override
    public B getObject() throws Exception {
        logger.info("通过FactoryBean自定义创建Bean");
        return new B();
    }

    @Override
    public Class<?> getObjectType() {
        return B.class;
    }

    @Override
    public boolean isSingleton() {
        // 设置B是否为singleton, 如果是就将getObject创建的bean放入factoryBeanObjectCache中。
        return true;
    }
}
