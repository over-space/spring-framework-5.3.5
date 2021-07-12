package com.learning.spring.debug.design.chain;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Husband extends Handler{

    private static final Logger logger = LogManager.getLogger(Husband.class);

    public Husband() {
        super(2);
    }

    @Override
    public void response(People people) {
        logger.info("--------------------------------------------");
        logger.info("妻子的请示：{}, {}", people.getRequest(), people.getType());
        logger.info("丈夫的答复：{}\n", "同意");
    }
}
