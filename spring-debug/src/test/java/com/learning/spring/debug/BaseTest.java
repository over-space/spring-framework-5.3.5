package com.learning.spring.debug;

import com.learning.spring.debug.custom.MyClassPathXmlApplicationContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;

public abstract class BaseTest {

    protected static final Logger logger = LogManager.getLogger(BaseTest.class);

    protected ApplicationContext applicationContext;

    @BeforeAll
    public static void beforeAll() {
        logger.info("================================================================================================");
        logger.info("-------------------------------------开始执行测试方法---------------------------------------------");
        logger.info("");
    }

    @AfterAll
    public static void afterAll() {
        logger.info("");
        logger.info("-------------------------------------测试方法执行完成---------------------------------------------");
        logger.info("================================================================================================");
    }

    @BeforeEach
    public void initApplicationContext() {
        ContextConfiguration annotation = this.getClass().getDeclaredAnnotation(ContextConfiguration.class);

        Assertions.assertNotNull(annotation, "请使用@ContextConfiguration注解指定spring配置文件。");

        String[] locations = annotation.value();

        Assertions.assertNotNull(locations);

        Assertions.assertNotNull(annotation, "请使用@ContextConfiguration注解指定spring xml配置文件。");

        logger.info("spring locations : {}\n", locations);

        applicationContext = new MyClassPathXmlApplicationContext(locations[0]);
    }
}
