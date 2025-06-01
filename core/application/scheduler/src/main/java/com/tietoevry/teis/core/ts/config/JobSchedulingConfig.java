package com.tietoevry.teis.core.ts.config;

import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tietoevry.teis.core.ts.jobs.SampleJob;

@Configuration
public class JobSchedulingConfig {

    @Bean
    public JobDetail sampleJobDetail() {
        return JobBuilder.newJob(SampleJob.class)
                .withIdentity("sampleJob")
                .storeDurably()
                .build();
    }

}