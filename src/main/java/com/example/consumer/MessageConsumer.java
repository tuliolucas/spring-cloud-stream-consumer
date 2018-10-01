package com.example.consumer;

import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    public void process(String message) {
        System.out.println("The info received was: " + message);
    }


}
