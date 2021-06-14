package com.learning.spring.debug.custom.lookup.method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Apple implements Fruit{

    private static final Logger logger = LogManager.getLogger(Apple.class);


    @Override
    public void getName() {

        logger.info("I'm is fresh Apple");

    }
}
