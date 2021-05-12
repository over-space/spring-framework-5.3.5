package com.learning.spring.debug.custom.condition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;

@Service
@Conditional(LinuxCondition.class)
public class LinuxServiceImpl implements SystemService{

    private static final Logger logger = LogManager.getLogger(LinuxServiceImpl.class);


    @Override
    public void start() {
        logger.info("Linux系统正在启动...");
    }
}
