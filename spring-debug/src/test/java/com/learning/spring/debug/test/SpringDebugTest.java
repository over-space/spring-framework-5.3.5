package com.learning.spring.debug.test;

import com.learning.spring.debug.SpringBaseTest;
import com.learning.spring.debug.custom.A;
import com.learning.spring.debug.custom.C1;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDebugTest extends SpringBaseTest {

    private static final Logger logger = LogManager.getLogger(SpringDebugTest.class);


    @Test
    public void testBeanAware() {
        // 测试Aware接口

        A bean = applicationContext.getBean(A.class);

        bean.sayHello();
    }


    @Test
    public void testCircularReferences() {

        C1 c1 = applicationContext.getBean(C1.class);

        logger.info("c1:{},c2：{}", c1, c1.getC2());
    }
}
