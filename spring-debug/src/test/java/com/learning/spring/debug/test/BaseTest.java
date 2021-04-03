package com.learning.spring.debug.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseTest {

    protected static final Logger logger = LoggerFactory.getLogger(BaseTest.class);


    @BeforeAll
    public static void beforeAll(){
        logger.info("================================================================================================");
        logger.info("-------------------------------------开始执行测试方法---------------------------------------------\n");
    }

    @AfterAll
    public static void afterAll(){
        logger.info("-------------------------------------测试方法执行完成---------------------------------------------\n");
        logger.info("================================================================================================");
    }

}
