package com.learning.spring.debug.custom.bean.factory.post.processor.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class WindowCondition implements Condition {

    private static String OS = System.getProperty("os.name").toLowerCase();

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return isWindow();
    }

    private boolean isWindow(){
        return OS.contains("win");
    }
}
