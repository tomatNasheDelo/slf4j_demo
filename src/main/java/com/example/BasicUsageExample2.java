package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicUsageExample2 {


    private static final Logger logger = LoggerFactory.getLogger(BasicUsageExample2.class);

    public static void main(String[] args) {

        
        logger.info("This is an info message");
        logger.debug("This is a debug message");
        logger.warn("This is a warning message");
        logger.error("This is an error message");
    }
}