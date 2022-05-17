package com.mj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestSLF4J_Log4j1 {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(TestSLF4J_Log4j1.class);
        logger.error("错误_ERROR");
        logger.warn("警告_WARN");
        logger.info("信息_INFO");
        logger.debug("调试_DEBUG");
        logger.trace("痕迹_TRACE");
    }
}
