package com.example.mobilekafka.service;

import com.example.mobilekafka.entity.SampleEntity;
import com.example.mobilekafka.repo.SampleRepo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description goes here...
 * <br></br>
 *
 * @author SatyaRajAwasth1  on 10/10/2023
 */

@Service
public class SampleServiceImpl implements SampleService{

    private final SampleRepo sampleRepo;

    public SampleServiceImpl(SampleRepo sampleRepo) {
        this.sampleRepo = sampleRepo;
    }

    @Override
    public List<SampleEntity> getAllMessages() {
        return sampleRepo.findAll();
    }

    @Override
    public SampleEntity saveMessage(SampleEntity sampleEntity) {
        return sampleRepo.save(sampleEntity);
    }
}
