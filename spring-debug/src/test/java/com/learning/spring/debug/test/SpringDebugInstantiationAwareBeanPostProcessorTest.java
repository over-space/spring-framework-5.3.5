package com.learning.spring.debug.test;

import com.learning.spring.debug.SpringBaseTest;
import com.learning.spring.debug.custom.instantiation_aware_bean_post_processors.CustomService;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;


@ContextConfiguration("classpath:spring-custom-instantiation-aware-bpp.xml")
public class SpringDebugInstantiationAwareBeanPostProcessorTest extends SpringBaseTest {

    @Test
    public void testInstantiationAwareBeanPostProcessor(){

        CustomService customService = applicationContext.getBean(CustomService.class);

        customService.doSomeThing();
    }

}
