package com.tietoevry.teis.core.ts.jobs;

import java.time.LocalTime;
import java.time.ZonedDateTime;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SampleJob implements Job {
    private static final Logger logger = LoggerFactory.getLogger(SampleJob.class);

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        JobDataMap dataMap = context.getJobDetail().getJobDataMap();
        LocalTime exclusionStart = LocalTime.parse(dataMap.getString("exclusionStart")); 
        LocalTime exclusionEnd = LocalTime.parse(dataMap.getString("exclusionEnd"));     
        LocalTime now = LocalTime.now();

        if (now.isAfter(exclusionStart) && now.isBefore(exclusionEnd)) {
            logger.info("Skipping execution between {} and {}", exclusionStart, exclusionEnd);
            return;
        }
        logger.info("Job executed at: {}", context.getFireTime());
        logger.info("Current time: {}", ZonedDateTime.now());
    }
}