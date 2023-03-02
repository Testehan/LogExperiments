package com.testehan.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main( String[] args )
    {
        log.debug("Hello this is a debug message");
        log.info("Hello this is an info message");
        log.info("java vm : ${java:vm}");
        log.info("env path : ${env:PATH}");

        log.error("Hello this is an error message");
    }
}
