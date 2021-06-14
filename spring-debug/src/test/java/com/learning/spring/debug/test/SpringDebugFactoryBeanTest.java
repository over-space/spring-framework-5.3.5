package com.learning.spring.debug.test;

import com.learning.spring.debug.custom.B;
import com.learning.spring.debug.custom.BFactoryBean;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration("classpath:spring-custom-factory-bean.xml")
public class SpringDebugFactoryBeanTest extends SpringDebugTest{


    @Test
    public void testFactoryBean() {
        // 测试通过FactoryBean创建Bean的过程

        B bean1 = (B) applicationContext.getBean("bFactoryBean");
        B bean2 = (B) applicationContext.getBean("bFactoryBean");
        BFactoryBean bean3 = (BFactoryBean) applicationContext.getBean("&bFactoryBean");

        Assertions.assertTrue(bean1 == bean2);
    }


}
