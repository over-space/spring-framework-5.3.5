package com.learning.spring.debug.custom.supplier;

public class SpacecraftFactory {

    public static Spacecraft create(){
        return new Spacecraft(2, "长征十二号");
    }

    public Spacecraft build(){
        return new Spacecraft(1, "长征十一号");
    }

}
