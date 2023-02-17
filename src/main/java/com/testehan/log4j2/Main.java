package com.testehan.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main
{
    private static final Logger log = LogManager.getLogger(Main.class);

    public static void main( String[] args )
    {
        log.debug("Hello this is a debug message");
        log.info("Hello this is an info message");
        log.info("java vm : ${java:vm}");
        log.info("env path : ${env:PATH}");
    }
}

