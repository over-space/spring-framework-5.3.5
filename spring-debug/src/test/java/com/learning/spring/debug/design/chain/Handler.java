package com.learning.spring.debug.design.chain;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Handler {

    private static final Logger logger = LogManager.getLogger(Handler.class);


    private int level;

    private Handler nextHandler;

    public Handler(int level){
        this.level = level;
    }

    public final void handler(People people){
        if(people.getType() == this.level){
            // 自己直接处理
            this.response(people);
        }else if(this.nextHandler != null){
            // 委托下一个处理类进行处理
            this.nextHandler.handler(people);
        }else{
            logger.warn("没有后续处理类，不在进行处理！");
        }
    }

    public void setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
    }

    public abstract void response(People people);
}
