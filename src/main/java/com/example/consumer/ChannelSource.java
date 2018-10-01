package com.example.consumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

public interface ChannelSource {

    String TOPIC = "TOPIC_NAME";

    @Input(ChannelSource.TOPIC)
    MessageChannel channel();

}
