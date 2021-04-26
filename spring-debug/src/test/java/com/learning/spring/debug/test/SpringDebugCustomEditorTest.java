package com.learning.spring.debug.test;

import com.learning.spring.debug.BaseTest;
import com.learning.spring.debug.custom.MyClassPathXmlApplicationContext;
import com.learning.spring.debug.custom.editor.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SpringDebugCustomEditorTest extends BaseTest {


    @BeforeEach
    public void initApplicationContext() {
        applicationContext = new MyClassPathXmlApplicationContext("spring-custom-editor.xml");
    }


    @Test
    public void testCustomEditor(){
        Customer bean = applicationContext.getBean(Customer.class);
        logger.info("customer : {}", bean);
    }
}
