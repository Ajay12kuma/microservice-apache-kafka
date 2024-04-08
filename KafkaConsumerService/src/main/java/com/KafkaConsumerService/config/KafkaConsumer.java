package com.KafkaConsumerService.config;

import com.KafkaConsumerService.util.StringConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);
    @KafkaListener(topics = StringConstant.TOPIC_KAFKA_EXAMPLE,groupId = StringConstant.GROUP_ID_KAFKA_EXAMPLE)
    public void consumemsgFromkafkaServer(String msg){

        LOGGER.info("Consumer : "+msg);

    }
}
