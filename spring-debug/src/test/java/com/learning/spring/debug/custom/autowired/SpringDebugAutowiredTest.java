package com.learning.spring.debug.custom.autowired;

import com.learning.spring.debug.test.SpringDebugTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration("classpath:spring-custom-autowired.xml")
public class SpringDebugAutowiredTest extends SpringDebugTest {

    private static final Logger logger = LogManager.getLogger(SpringDebugAutowiredTest.class);


    @Test
    void testEvent(){
        D1 d1 = applicationContext.getBean(D1.class);

        D2 d2 = applicationContext.getBean(D2.class);

        logger.info("d1 : {}", d1);
        logger.info("d2 : {}", d2);
        logger.info("d2.d1 : {}", d2.getD1());
    }

}
