package com.learning.spring.debug.test;

import com.learning.spring.debug.BaseTest;
import com.learning.spring.debug.custom.bean.definition.registry.post.processor.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration("classpath:spring-custom-bean-post-processor.xml")
public class SpringDebugBeanPostProcessorTest extends BaseTest {


    @Test
    public void testBeanPostProcessor(){

        Student bean = applicationContext.getBean(Student.class);

        Assertions.assertNotNull(bean);

        logger.info("student : {}", bean);
    }


}
