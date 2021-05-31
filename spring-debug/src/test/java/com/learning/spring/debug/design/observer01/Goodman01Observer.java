package com.learning.spring.debug.design.observer01;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Goodman01Observer implements Observer{
    private static final Logger logger = LogManager.getLogger(Goodman01Observer.class);


    @Override
    public void notify(String message) {

        logger.info("Goodman01: {}", message);
    }
}
