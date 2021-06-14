package com.learning.spring.debug.custom.replaced.method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OriginalDog {

    private static final Logger logger = LogManager.getLogger(OriginalDog.class);


    public void sayHello() {
        logger.info("Hello,I am a black dog...");
    }

    public void sayHello(String name) {
        logger.info("Hello,I am a black dog, my name is {}", name);
    }

}
