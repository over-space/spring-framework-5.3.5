package com.learning.spring.debug.custom.bean.factory.post.processor.condition.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "com.learning.spring.debug.custom.bean.factory.post.processor.condition")
public class MyComponentScan {

    @Configuration
    @ComponentScan(value = "com.learning.spring.debug.custom.bean.factory.post.processor.condition")
    class MyComponentScanInnerClass{

    }
}
