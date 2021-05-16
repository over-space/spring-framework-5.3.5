package com.learning.spring.debug.custom.bean.factory.post.processor.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl {

    @Bean
    public DepartmentServiceImpl departmentService(){
        return new DepartmentServiceImpl();
    }

    public class DepartmentServiceImpl{

    }

}
