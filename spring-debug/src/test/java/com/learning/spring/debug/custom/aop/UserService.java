package com.learning.spring.debug.custom.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author lifang
 * @since 2022/1/27
 */
public class UserService {

    private static final Logger logger = LogManager.getLogger(UserService.class);


    public String doSomeThing(){
        logger.info("执行UserService#doSomeThing方法...");
        // int i = 10 / 0;
        return "hello aop";
    }

}
