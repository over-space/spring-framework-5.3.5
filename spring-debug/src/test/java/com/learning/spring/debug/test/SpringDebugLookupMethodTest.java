package com.learning.spring.debug.test;

import com.learning.spring.debug.custom.lookup.method.Fruit;
import com.learning.spring.debug.custom.lookup.method.FruitPlate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.support.CglibSubclassingInstantiationStrategy;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration("classpath:spring-custom-lookup-method.xml")
public class SpringDebugLookupMethodTest extends SpringDebugTest{

    private static final Logger logger = LogManager.getLogger(SpringDebugLookupMethodTest.class);

    @Test
    public void testFactoryBean() {

        /**
         * @see CglibSubclassingInstantiationStrategy.LookupOverrideMethodInterceptor
         */

        FruitPlate fruitPlate01 = (FruitPlate) applicationContext.getBean("fruitPlate01");
        FruitPlate fruitPlate02 = (FruitPlate) applicationContext.getBean("fruitPlate02");

        Fruit fruit01 = fruitPlate01.getFruit();
        Fruit fruit02 = fruitPlate01.getFruit();


        logger.info("fruit01:{}, fruit02：{}", fruit01, fruit02);
    }


}
