package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedMessagesExample {
    
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedMessagesExample.class);

    public static void main(String[] args) {
        String user = "Bob";
        int age = 100;

        logger.info("User {} is {} years old", user, age);
    }
}