package com.learning.spring.debug.custom.factory_bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author lifang
 * @since 2022/1/24
 */
public class BirdFactoryBean implements FactoryBean<Bird> {

    @Override
    public Bird getObject() throws Exception {
        return new Bird();
    }

    @Override
    public Class<?> getObjectType() {
        return Bird.class;
    }

    @Override
    public boolean isSingleton() {
        // 是否为单例
        return true;
    }
}
