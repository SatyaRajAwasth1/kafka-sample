package com.example.mobilekafka.kafka;

import com.example.mobilekafka.entity.SampleEntity;
import com.example.mobilekafka.service.SampleService;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

/**
 * description goes here...
 * <br></br>
 *
 * @author SatyaRajAwasth1  on 10/10/2023
 */

@Component
public class SampleConsumer {

    private static final Logger log = Logger.getLogger("SampleKafkaConsumerImpl.class");
    private final SampleService sampleService;

    public SampleConsumer(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @KafkaListener(topics = "test")
//    Mention groupId too if multiple groups
    public void consumeMessage(String data){
        log.info("consuming message: "+data);
        System.out.println("Saved: "+sampleService.saveMessage(new SampleEntity(data)));
    }

}
