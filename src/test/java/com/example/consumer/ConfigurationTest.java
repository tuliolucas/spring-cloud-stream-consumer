package com.example.consumer;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@org.springframework.context.annotation.Configuration
public class ConfigurationTest {

    @Bean
    @Primary
    public MessageConsumer foodOrderPublisher(){
        return Mockito.mock(MessageConsumer.class);
    }
}
