package com.testehan.log4j;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;

public class JNIAppender extends AppenderSkeleton {
    protected void append(LoggingEvent loggingEvent) {
        // this can send the message to some other component maybe..

        System.out.println("JNIAppender "+ loggingEvent.getLevel() + " " + loggingEvent.getRenderedMessage());
    }

    public void close() {

    }

    public boolean requiresLayout() {
        return false;
    }
}
