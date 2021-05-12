package com.learning.spring.debug.custom.condition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;

@Service
@Conditional(WindowCondition.class)
public class WindowServiceImpl implements SystemService{

    private static final Logger logger = LogManager.getLogger(WindowServiceImpl.class);


    @Override
    public void start() {
        logger.info("Windows系统正在启动...");
    }

}
