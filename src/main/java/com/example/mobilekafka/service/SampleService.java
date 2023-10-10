package com.example.mobilekafka.service;

import com.example.mobilekafka.entity.SampleEntity;

import java.util.List;

/**
 * description goes here...
 * <br></br>
 *
 * @author SatyaRajAwasth1  on 10/10/2023
 */


public interface SampleService {
    List<SampleEntity> getAllMessages();
    SampleEntity saveMessage(SampleEntity sampleEntity);
}
