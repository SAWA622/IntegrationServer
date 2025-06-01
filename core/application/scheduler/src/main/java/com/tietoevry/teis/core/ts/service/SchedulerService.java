package com.tietoevry.teis.core.ts.service;

import org.quartz.*;
import org.quartz.impl.matchers.GroupMatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class SchedulerService {

    @Autowired
    private SchedulerFactoryBean schedulerFactoryBean;

    private Scheduler getScheduler() throws SchedulerException {
        return schedulerFactoryBean.getScheduler();
    }

    public void scheduleJob(JobDetail jobDetail, Trigger trigger) throws SchedulerException {
        Scheduler scheduler = getScheduler();
        scheduler.scheduleJob(jobDetail, trigger);
    }

    public boolean updateJob(String jobName, String jobGroup, Trigger newTrigger) throws SchedulerException {
        Scheduler scheduler = getScheduler();
        TriggerKey triggerKey = new TriggerKey(jobName + "Trigger", jobGroup);
        if (scheduler.checkExists(triggerKey)) {
            scheduler.rescheduleJob(triggerKey, newTrigger);
            return true;
        }
        return false;
    }

    public boolean deleteJob(String jobName, String jobGroup) throws SchedulerException {
        Scheduler scheduler = getScheduler();
        JobKey jobKey = new JobKey(jobName, jobGroup);
        return scheduler.deleteJob(jobKey);
    }

    public List<String> getAllJobs() throws SchedulerException {
        Scheduler scheduler = getScheduler();
        List<String> jobNames = new ArrayList<>();
        
        for (String groupName : scheduler.getJobGroupNames()) {
            for (JobKey jobKey : scheduler.getJobKeys(GroupMatcher.jobGroupEquals(groupName))) {
                jobNames.add(groupName + "." + jobKey.getName());
            }
        }
        return jobNames;
    }

    public boolean pauseJob(String jobName, String jobGroup) throws SchedulerException {
        Scheduler scheduler = getScheduler();
        JobKey jobKey = new JobKey(jobName, jobGroup);
        if (scheduler.checkExists(jobKey)) {
            scheduler.pauseJob(jobKey);
            return true;
        }
        return false;
    }

    public boolean resumeJob(String jobName, String jobGroup) throws SchedulerException {
        Scheduler scheduler = getScheduler();
        JobKey jobKey = new JobKey(jobName, jobGroup);
        if (scheduler.checkExists(jobKey)) {
            scheduler.resumeJob(jobKey);
            return true;
        }
        return false;
    }
}