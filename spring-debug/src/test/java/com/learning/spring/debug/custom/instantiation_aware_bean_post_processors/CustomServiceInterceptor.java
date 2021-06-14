package com.learning.spring.debug.custom.instantiation_aware_bean_post_processors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CustomServiceInterceptor implements MethodInterceptor {

    private static final Logger logger = LogManager.getLogger(CustomServiceInterceptor.class);


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        logger.info("目标方法执行之前：{}", method);

        Object obj = methodProxy.invokeSuper(o, objects);

        logger.info("目标方法执行之后：{}", method);

        return obj;
    }
}
