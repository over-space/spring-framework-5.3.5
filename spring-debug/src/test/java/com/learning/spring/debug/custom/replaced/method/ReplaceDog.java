package com.learning.spring.debug.custom.replaced.method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;
import java.util.Arrays;

public class ReplaceDog implements MethodReplacer {

    private static final Logger logger = LogManager.getLogger(ReplaceDog.class);


    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {

        logger.info("Hello, I am a white dog...");

        Arrays.stream(args).forEach(str -> logger.info("参数: {}", str));
        return obj;
    }
}
