package com.danilorocha.redis.subscribers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;

public class Receiver implements MessageListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

    @Override
    public void onMessage(Message message, byte[] pattern) {
        LOGGER.info("Recebedor {}", message);
    }


}
