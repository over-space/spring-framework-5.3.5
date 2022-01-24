package com.learning.spring.debug.custom.circular.reference;

import com.learning.spring.debug.test.SpringDebugTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;

/**
 * @author lifang
 * @since 2022/1/24
 */
@ContextConfiguration("classpath:spring-custom-circular-reference.xml")
public class SpringDebugCircularReferenceTest extends SpringDebugTest {

    private static final Logger logger = LogManager.getLogger(SpringDebugCircularReferenceTest.class);

    @Test
    public void testCircularReference(){
        X xBean = this.applicationContext.getBean(X.class);
        Y yBean = this.applicationContext.getBean(Y.class);
        logger.info("x : {}", xBean);
        logger.info("x.y : {}", xBean.getY());
        logger.info("y : {}", yBean);
        logger.info("y.x : {}", yBean.getX());
    }

}
