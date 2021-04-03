package com.learning.spring.debug.test;

import org.springframework.beans.factory.FactoryBean;

public class BFactoryBean implements FactoryBean<B> {

    @Override
    public B getObject() throws Exception {
        return new B();
    }

    @Override
    public Class<?> getObjectType() {
        return B.class;
    }

    @Override
    public boolean isSingleton() {
        // 设置B是否为singleton, 如果是就将getObject创建的bean放入factoryBeanObjectCache中。
        return FactoryBean.super.isSingleton();
    }
}
