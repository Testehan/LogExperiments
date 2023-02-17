package com.testehan.log4j;


import org.apache.log4j.Logger;

public class Main
{
    private static Logger log = Logger.getLogger(Main.class.getName());

    public static void main( String[] args )
    {
        log.debug("Hello this is a debug message");
        log.info("Hello this is an info message");
        log.info("java vm : ${java:vm}");
        log.info("env path : ${env:PATH}");
    }
}
