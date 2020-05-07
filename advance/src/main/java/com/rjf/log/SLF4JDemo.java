package com.rjf.log;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

public class SLF4JDemo {

    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger(SLF4JDemo.class);

        logger.warn("warming illegal args");
    }
}
