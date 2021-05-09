package com.learning.spring.debug.custom.bean.definition.registry.post.processor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Student {

    private static final Logger logger = LogManager.getLogger(Student.class);


    private String name;

    public Student() {
        logger.info("实例化student对象：{}", Student.class.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
