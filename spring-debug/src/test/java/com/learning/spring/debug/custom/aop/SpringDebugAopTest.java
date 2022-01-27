package com.learning.spring.debug.custom.aop;

import com.learning.spring.debug.SpringBaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;

/**
 * @author lifang
 * @since 2022/1/27
 */
@ContextConfiguration("classpath:spring-custom-aop.xml")
public class SpringDebugAopTest extends SpringBaseTest {

    private static final Logger logger = LogManager.getLogger(SpringDebugAopTest.class);

    @Test
    public void test(){

        UserService userService = applicationContext.getBean(UserService.class);

        logger.info("userService: {}", userService);

        userService.doSomeThing();
    }

}
