package com.learning.spring.debug.custom.converter;

import com.learning.spring.debug.custom.event.CustomApplicationEvent;
import com.learning.spring.debug.test.SpringDebugTest;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration("classpath:spring-custom-converter.xml")
public class SpringDebugConverterTest extends SpringDebugTest {

    @Test
    void testEvent(){
        applicationContext.publishEvent(new CustomApplicationEvent("自定义事件"));
    }

}
