package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class LogbackMdcExample {

     private static final Logger LOG = LoggerFactory.getLogger(LogbackMdcExample.class);

    public static void main(String[] args) {
        MDC.put("project", "Java Code Geeks");
        LOG.info("Test logging");
    }

}
