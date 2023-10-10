package com.example.mobilekafka.repo;

import com.example.mobilekafka.entity.SampleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * description goes here...
 * <br></br>
 *
 * @author SatyaRajAwasth1  on 10/10/2023
 */

@Repository
public interface SampleRepo extends JpaRepository<SampleEntity, Long> {
}
