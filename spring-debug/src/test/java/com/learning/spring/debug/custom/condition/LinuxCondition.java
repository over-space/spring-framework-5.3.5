package com.learning.spring.debug.custom.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class LinuxCondition implements Condition {

    private static String OS = System.getProperty("os.name").toLowerCase();

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return isLinux();
    }

    private boolean isLinux(){
        return (OS.contains("nix") || OS.contains("nux") || OS.contains("aix"));
    }
}
