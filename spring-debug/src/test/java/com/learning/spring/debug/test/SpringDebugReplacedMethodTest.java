package com.learning.spring.debug.test;

import com.learning.spring.debug.custom.lookup.method.Fruit;
import com.learning.spring.debug.custom.lookup.method.FruitPlate;
import com.learning.spring.debug.custom.replaced.method.OriginalDog;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration("classpath:spring-custom-replaced-method.xml")
public class SpringDebugReplacedMethodTest extends SpringDebugTest{

    private static final Logger logger = LogManager.getLogger(SpringDebugReplacedMethodTest.class);

    @Test
    public void testFactoryBean() {
        /**
         * @see CglibSubclassingInstantiationStrategy.ReplaceOverrideMethodInterceptor
         */

        OriginalDog originalDog = (OriginalDog) applicationContext.getBean("originalDog");
        originalDog.sayHello("jack");
    }


}
