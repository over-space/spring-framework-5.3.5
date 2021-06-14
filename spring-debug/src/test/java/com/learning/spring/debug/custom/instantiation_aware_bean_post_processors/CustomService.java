package com.learning.spring.debug.custom.instantiation_aware_bean_post_processors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomService {

    private static final Logger logger = LogManager.getLogger(CustomService.class);

    public void doSomeThing(){

        logger.info("执行CustomService#doSomeThing方法。");

    }

}
