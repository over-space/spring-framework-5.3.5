package com.learning.spring.debug.custom.supplier;

import com.learning.spring.debug.test.SpringDebugTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration("classpath:spring-custom-supplier.xml")
public class SpringDebugSupplierTest extends SpringDebugTest {

    private static final Logger logger = LogManager.getLogger(SpringDebugSupplierTest.class);

    @Test
    void testSupplier() {
        Astronaut astronaut = applicationContext.getBean(Astronaut.class);
        logger.info("astronaut:{}", astronaut);
    }

    @Test
    void testStaticFactoryCreateBean() {
        Spacecraft spacecraft01 = applicationContext.getBean("spacecraft01", Spacecraft.class);
        logger.info("spacecraft01:{}", spacecraft01);

        Spacecraft spacecraft02 = applicationContext.getBean("spacecraft02", Spacecraft.class);
        logger.info("spacecraft02:{}", spacecraft02);
    }
}
