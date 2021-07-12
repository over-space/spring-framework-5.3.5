package com.learning.spring.debug.design.chain;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Father extends Handler{

    private static final Logger logger = LogManager.getLogger(Father.class);

    public Father() {
        super(1);
    }

    @Override
    public void response(People people) {
        logger.info("--------------------------------------------");
        logger.info("女儿的请示：{}, {}", people.getRequest(), people.getType());
        logger.info("父亲的答复：{}\n", "同意");
    }
}
