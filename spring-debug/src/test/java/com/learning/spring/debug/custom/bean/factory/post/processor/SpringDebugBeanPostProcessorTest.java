package com.learning.spring.debug.custom.bean.factory.post.processor;

import com.learning.spring.debug.BaseTest;
import com.learning.spring.debug.SpringBaseTest;
import com.learning.spring.debug.custom.bean.definition.registry.post.processor.Student;
import com.learning.spring.debug.custom.bean.factory.post.processor.condition.SystemService;
import com.learning.spring.debug.custom.bean.factory.post.processor.condition.UserServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration("classpath:spring-custom-bean-post-processor.xml")
public class SpringDebugBeanPostProcessorTest extends SpringBaseTest {


    @Test
    public void testBeanPostProcessor() {

        Student bean = applicationContext.getBean(Student.class);

        Assertions.assertNotNull(bean);

        logger.info("student : {}", bean);
    }


    @Test
    public void testCustomCondition() {
        SystemService systemService = applicationContext.getBean(SystemService.class);
        UserServiceImpl.DepartmentServiceImpl departmentService = applicationContext.getBean(UserServiceImpl.DepartmentServiceImpl.class);

        Assertions.assertNotNull(systemService);
        Assertions.assertNotNull(departmentService);

        systemService.start();
    }
}
