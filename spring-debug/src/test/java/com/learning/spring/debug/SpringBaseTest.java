package com.learning.spring.debug;

import com.learning.spring.debug.custom.MyClassPathXmlApplicationContext;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;

public abstract class SpringBaseTest extends BaseTest{

    protected ApplicationContext applicationContext;

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
