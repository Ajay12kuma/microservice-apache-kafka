package com.KafkaProducerService.controller;

import com.KafkaProducerService.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class KafkaMessageProducerController {
    @Autowired
    private KafkaProducerService kafkaProducerService;
    @PostMapping("/sendmessage")
    public ResponseEntity<?> sendmessagetoKafkaServer(@RequestBody String msg){
        this.kafkaProducerService.sendmessageTokafkaserver(msg);
        return ResponseEntity.status(HttpStatus.OK).body("Message sent successfully......!!");
    }
}
