package com.learning.spring.debug.test;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDebugTest extends BaseTest{

    private static final Logger logger = LoggerFactory.getLogger(SpringDebugTest.class);



    @Test
    void testDebug(){

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        A bean = applicationContext.getBean(A.class);

    }

}
