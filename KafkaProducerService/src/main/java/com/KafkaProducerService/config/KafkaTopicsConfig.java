package com.KafkaProducerService.config;

import com.KafkaProducerService.util.StringConstant;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicsConfig {
    @Bean
    public NewTopic getToken(){
        return TopicBuilder.name(StringConstant.TOPIC_KAFKA_EXAMPLE).build();
    }
}
