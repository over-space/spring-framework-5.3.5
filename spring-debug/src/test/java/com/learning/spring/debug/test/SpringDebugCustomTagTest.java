package com.learning.spring.debug.test;

import com.learning.spring.debug.BaseTest;
import com.learning.spring.debug.custom.MyClassPathXmlApplicationContext;
import com.learning.spring.debug.custom.tag.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 自定义标签测试类
 */
public class SpringDebugCustomTagTest extends BaseTest {

    private static final Logger logger = LogManager.getLogger(SpringDebugCustomTagTest.class);


    @BeforeEach
    public void initApplicationContext() {
        applicationContext = new MyClassPathXmlApplicationContext("spring-custom-tag.xml");
    }

    @Test
    public void testCustomTag(){
        User user = applicationContext.getBean(User.class);
        logger.info("user: {}", user);
    }
}
