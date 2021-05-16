package com.learning.spring.debug.custom.bean.factory.post.processor.condition.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "spring.properties", encoding = "UTF-8")
public class MyPropertySource {

    @Value("${application.name}")
    public String applicationName;

}
