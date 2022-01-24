package com.learning.spring.debug.custom.bean.definition.registry.post.processor;

import com.learning.spring.debug.test.SpringDebugTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;

/**
 * @author lifang
 * @since 2022/1/24
 */
@ContextConfiguration("classpath:spring-custom-definition-registry-post-processor.xml")
public class SpringDebugDefinitionRegistryPostProcessorTest extends SpringDebugTest {

    private static final Logger logger = LogManager.getLogger(SpringDebugDefinitionRegistryPostProcessorTest.class);

    @Test
    public void test(){
        Student bean = applicationContext.getBean(Student.class);

        Assertions.assertNotNull(bean);

        logger.info("student : {}", bean);
    }

}
