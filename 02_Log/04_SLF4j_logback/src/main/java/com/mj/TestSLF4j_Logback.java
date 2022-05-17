package com.mj;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class TestSLF4j_Logback {

    public static void main(String[] args) {
//        Logger log = LoggerFactory.getLogger(TestSLF4j_Logback.class);
        for (int i = 0; i < 500; i++) {
            log.error("错误_ERROR");
            log.warn("警告_WARN");
            log.info("信息_INFO");
            log.debug("调试_DEBUG");
            log.trace("痕迹_TRACE");
        }

        for (int i = 0; i < 100; i++) {
            System.out.println("6666666666");
        }
    }
}
