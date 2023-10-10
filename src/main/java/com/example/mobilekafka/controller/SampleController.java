package com.example.mobilekafka.controller;

import com.example.mobilekafka.entity.SampleEntity;
import com.example.mobilekafka.service.SampleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * description goes here...
 * <br></br>
 *
 * @author SatyaRajAwasth1  on 10/10/2023
 */

@RestController
public class SampleController {

    private final SampleService sampleService;

    public SampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @GetMapping("/msg")
    public ResponseEntity<List<SampleEntity>> getMessage(){
        return new ResponseEntity<>(sampleService.getAllMessages(), HttpStatus.OK);
    }
}
