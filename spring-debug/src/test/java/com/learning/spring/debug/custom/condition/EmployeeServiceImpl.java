package com.learning.spring.debug.custom.condition;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan(value = "com.learning.spring.debug.custom.condition")
public class EmployeeServiceImpl {


    @ComponentScan(value = "com.learning.spring.debug.custom.condition")
    class UserServiceImpl{

    }

}
