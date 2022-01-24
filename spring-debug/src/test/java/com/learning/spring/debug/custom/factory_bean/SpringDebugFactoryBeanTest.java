package com.learning.spring.debug.custom.factory_bean;

import com.learning.spring.debug.SpringBaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;

/**
 * @author lifang
 * @since 2022/1/24
 */
@ContextConfiguration("classpath:spring-custom-factory-bean.xml")
public class SpringDebugFactoryBeanTest extends SpringBaseTest {

    private static final Logger logger = LogManager.getLogger(SpringDebugFactoryBeanTest.class);

    @Test
    public void test(){
        Object obj = applicationContext.getBean("&bird");
        Bird bean1 = applicationContext.getBean(Bird.class);
        Bird bean2 = applicationContext.getBean(Bird.class);

        logger.info("bean : {}, {}", bean1, bean1 == bean2);
        logger.info("obj : {}", obj);
    }

}
