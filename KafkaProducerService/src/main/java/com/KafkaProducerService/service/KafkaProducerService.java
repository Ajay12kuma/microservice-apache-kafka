package com.KafkaProducerService.service;

import com.KafkaProducerService.util.StringConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducerService.class);
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    public void sendmessageTokafkaserver(String msg){
        this.kafkaTemplate.send(StringConstant.TOPIC_KAFKA_EXAMPLE,msg);
        LOGGER.info("INSIDE SERVICE ... message sent succesfully");
    }




}
