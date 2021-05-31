package com.learning.spring.debug.design.observer01;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Goodman02Observer implements Observer{
    private static final Logger logger = LogManager.getLogger(Goodman02Observer.class);


    @Override
    public void notify(String message) {
        logger.info("Goodman02: {}", message);
    }
}
