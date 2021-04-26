package com.learning.spring.debug.test;

import com.learning.spring.debug.BaseTest;
import com.learning.spring.debug.custom.A;
import com.learning.spring.debug.custom.B;
import com.learning.spring.debug.custom.C1;
import com.learning.spring.debug.custom.MyClassPathXmlApplicationContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SpringDebugTest extends BaseTest {

    private static final Logger logger = LogManager.getLogger(SpringDebugTest.class);


    @BeforeEach
    public void initApplicationContext() {
        // applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        applicationContext = new MyClassPathXmlApplicationContext("applicationContext.xml");
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

    @Test
    public void testCircularReferences() {

        C1 c1 = applicationContext.getBean(C1.class);

        logger.info("c1:{},c2：{}", c1, c1.getC2());
    }
}
