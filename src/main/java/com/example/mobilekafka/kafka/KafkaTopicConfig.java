package com.example.mobilekafka.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * description goes here...
 * <br></br>
 *
 * @author SatyaRajAwasth1  on 10/10/2023
 */

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic sampleTopic1(){
        return TopicBuilder.name("test").build();
    }

}