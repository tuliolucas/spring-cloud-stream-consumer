package com.example.consumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.MimeTypeUtils;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

@SpringBootTest(classes = {Application.class, ConfigurationTest.class})
@RunWith(SpringRunner.class)
public class ConsumerIntegrationTest {

    public static final Message<?> TEST_MESSAGE = MessageBuilder.withPayload("bar")
            .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON).build();

    @Autowired
    ChannelSource channelSource;

    @Autowired
    MessageConsumer messageConsumer;

    @Test
    public void testWiring() {
        channelSource.channel().send(TEST_MESSAGE);
        verify(messageConsumer).process(TEST_MESSAGE.getPayload().toString());
    }



}