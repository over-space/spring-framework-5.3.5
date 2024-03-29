package com.learning.spring.debug.custom.tag;

import com.learning.spring.debug.SpringBaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;

/**
 * 自定义标签测试类
 */
@ContextConfiguration("classpath:spring-custom-tag.xml")
public class SpringDebugCustomTagTest extends SpringBaseTest {

    private static final Logger logger = LogManager.getLogger(SpringDebugCustomTagTest.class);

    @Test
    public void testCustomTag() {
        User user = applicationContext.getBean(User.class);
        logger.info("user: {}", user);
    }
}
