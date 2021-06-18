package com.learning.spring.debug.custom.supplier;

public class AstronautFactory {

    public static Astronaut build(){
        return new Astronaut(1, "杨利伟");
    }

}
