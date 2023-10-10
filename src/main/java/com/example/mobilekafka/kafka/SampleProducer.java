package com.example.mobilekafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * description goes here...
 * <br></br>
 *
 * @author SatyaRajAwasth1  on 10/10/2023
 */

@Component
public class SampleProducer {

    private static final Logger log = LoggerFactory.getLogger("SimpleKafkaProducerImpl.class");
    private final KafkaTemplate<String, String> kafkaTemplate;


    public SampleProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public String sendMessage(String message){
        log.info("Sending message: {}", message);
        kafkaTemplate.send("test1",message);
        return message;
    }

}
