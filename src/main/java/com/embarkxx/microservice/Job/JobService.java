package com.embarkxx.microservice.Job;

import com.embarkxx.microservice.entity.Job;

import java.util.List;

public interface JobService {
    List<Job> findAll();
    String createJob(Job job);
    Job getJobById(Long id);

    boolean deleteJobById(Long id);

    boolean updateJob(Long id, Job updatedJob);
}
