package com.example.ten;

import org.apache.log4j.Logger;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageListener {

    private Logger logger = Logger.getLogger(this.getClass());

    @StreamListener(ConsumerChannels.DIRECTED)
    public void directed(GreetingMessage message) {
        System.out.println("Directed: " + message);
        logger.debug("Directed: " + message);
    }

    @StreamListener(ConsumerChannels.BROADCASTS)
    public void broadcasted(String message) {
        System.out.println("Directed: " + message);
        logger.debug("Directed: " + message);
    }

}