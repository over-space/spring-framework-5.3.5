package com.learning.spring.debug.custom.converter;

import org.springframework.core.convert.converter.Converter;

public class StudentConverter implements Converter<String, Student> {

    @Override
    public Student convert(String source) {
        String[] s = source.split("_");
        Student student = new Student();
        student.setId(s[0]);
        student.setName(s[1]);
        student.setAge(Integer.parseInt(s[2]));
        return student;
    }
}
