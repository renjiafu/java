package com.rjf.exception;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log {

    private static final Logger logger =  LoggerFactory.getLogger(Log.class);
    public static void main(String[] args){
        logger.debug("debug");
        logger.warn("warm");
        logger.error("error");
    }
}
