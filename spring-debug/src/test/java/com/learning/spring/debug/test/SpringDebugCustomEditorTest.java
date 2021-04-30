package com.learning.spring.debug.test;

import com.learning.spring.debug.BaseTest;
import com.learning.spring.debug.custom.editor.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration("classpath:spring-custom-editor.xml")
public class SpringDebugCustomEditorTest extends BaseTest {



    @Test
    public void testCustomEditor(){
        Customer bean = applicationContext.getBean(Customer.class);
        Assertions.assertNotNull(bean);
        logger.info("customer : {}", bean);
    }
}
