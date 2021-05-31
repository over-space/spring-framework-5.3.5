package com.learning.spring.debug.design.observer01;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BadmanObservable implements Observable{

    private static final Logger logger = LogManager.getLogger(BadmanObservable.class);


    public void run(){

        logger.info("罪犯开始行动....");

        notify("开始实施抓捕。");

    }

}
