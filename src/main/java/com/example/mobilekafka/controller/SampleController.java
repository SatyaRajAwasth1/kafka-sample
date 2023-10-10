package com.example.mobilekafka.controller;

import com.example.mobilekafka.entity.SampleEntity;
import com.example.mobilekafka.kafka.SampleProducer;
import com.example.mobilekafka.service.SampleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * description goes here...
 * <br></br>
 *
 * @author SatyaRajAwasth1  on 10/10/2023
 */

@RestController
public class SampleController {

    private final SampleService sampleService;
    private final SampleProducer sampleProducer;

    public SampleController(SampleService sampleService, SampleProducer sampleProducer) {
        this.sampleService = sampleService;
        this.sampleProducer = sampleProducer;
    }

    @GetMapping("/msg")
    public ResponseEntity<List<SampleEntity>> getAllMessages(){
        return new ResponseEntity<>(sampleService.getAllMessages(), HttpStatus.OK);
    }
    @PostMapping("/msg/add")
    public ResponseEntity<String> addMessageEvent(@RequestBody Map<String, String> message){
        return new ResponseEntity<>(sampleProducer.sendMessage(message.get("message")), HttpStatus.OK);
    }
}
