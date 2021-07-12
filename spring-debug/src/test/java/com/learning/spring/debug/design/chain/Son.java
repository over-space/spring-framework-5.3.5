package com.learning.spring.debug.design.chain;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Son extends Handler{

    private static final Logger logger = LogManager.getLogger(Son.class);

    public Son() {
        super(3);
    }

    @Override
    public void response(People people) {
        logger.info("--------------------------------------------");
        logger.info("母亲的请示：{}, {}", people.getRequest(), people.getType());
        logger.info("儿子的答复：{}\n", "同意");
    }
}
