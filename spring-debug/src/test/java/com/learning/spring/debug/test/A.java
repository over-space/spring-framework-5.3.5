package com.learning.spring.debug.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class A {

    private static final Logger logger = LoggerFactory.getLogger(A.class);


    public void initMethod(){

        logger.info("执行A#init-method方法");

    }

}
