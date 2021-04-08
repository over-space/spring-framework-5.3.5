package com.learning.spring.debug.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDebugTest extends BaseTest {

    private static final Logger logger = LogManager.getLogger(SpringDebugTest.class);


    private ApplicationContext applicationContext;

    @BeforeEach
    public void initApplicationContext() {
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testBeanAware() {
        // 测试Aware接口

        A bean = applicationContext.getBean(A.class);

        bean.sayHello();
    }

    @Test
    public void testFactoryBean() {
        // 测试通过FactoryBean创建Bean的过程

        B bean1 = (B) applicationContext.getBean("bFactoryBean");
        B bean2 = (B) applicationContext.getBean("bFactoryBean");

        Assertions.assertTrue(bean1 == bean2);
    }

}
