package com.learning.spring.debug.custom.event;

import org.springframework.context.ApplicationEvent;

public class CustomApplicationEvent extends ApplicationEvent {

    public CustomApplicationEvent(Object source) {
        super(source);
    }
}
