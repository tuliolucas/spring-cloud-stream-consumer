package com.example.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Autowired
    private MessageConsumer consumer;

    @org.springframework.cloud.stream.annotation.StreamListener(target = ChannelSource.TOPIC)
    public void processInformation(String message){
        consumer.process(message);
    }

}