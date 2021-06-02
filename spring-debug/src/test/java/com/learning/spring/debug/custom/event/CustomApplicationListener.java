package com.learning.spring.debug.custom.event;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CustomApplicationListener implements ApplicationListener {

    private static final Logger logger = LogManager.getLogger(CustomApplicationListener.class);

    @Override
    public void onApplicationEvent(ApplicationEvent event) {

        logger.info("执行自定义事件CustomApplicationListener#onApplicationEvent，{}", event.getSource());

    }
}
