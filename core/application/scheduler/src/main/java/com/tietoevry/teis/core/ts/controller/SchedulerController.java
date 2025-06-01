package com.tietoevry.teis.core.ts.controller;

import com.tietoevry.teis.core.ts.dto.JobRequest;
import com.tietoevry.teis.core.ts.jobs.SampleJob;
import com.tietoevry.teis.core.ts.service.SchedulerService;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/scheduler")
public class SchedulerController  {

    @Autowired
    private SchedulerService schedulerService;

    @PostMapping("/create")
    public ResponseEntity<String> createJob(@RequestBody JobRequest jobRequest) {
        try {
        	System.out.println(jobRequest.getStartTime());
            JobDetail jobDetail = JobBuilder.newJob(SampleJob.class)
                    .withIdentity(jobRequest.getJobName(), jobRequest.getJobGroup())
                    .usingJobData("exclusionStart", jobRequest.getExclusionStart())
                    .usingJobData("exclusionEnd", jobRequest.getExclusionEnd())
                    .storeDurably()
                    .build();

         
            Trigger trigger = TriggerBuilder.newTrigger()
                    .withIdentity(jobRequest.getJobName() + "Trigger", jobRequest.getJobGroup())
                    .withSchedule(CronScheduleBuilder.cronSchedule(jobRequest.getCronExpression()))
                    .startAt(jobRequest.getStartTime())
                    .endAt(jobRequest.getEndTime())
//                    .startNow()
                    .build();

            schedulerService.scheduleJob(jobDetail, trigger);
            return ResponseEntity.ok("Job created with exclusion window: " + 
                    jobRequest.getExclusionStart() + " to " + jobRequest.getExclusionEnd());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error: " + e.getMessage());
        }
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateJob(@RequestBody JobRequest jobRequest) {
        try {
            Trigger newTrigger = TriggerBuilder.newTrigger()
                    .withIdentity(jobRequest.getJobName() + "Trigger", jobRequest.getJobGroup())
                    .startAt(jobRequest.getStartTime() != null ? jobRequest.getStartTime() : new Date())
                    .withSchedule(CronScheduleBuilder.cronSchedule(jobRequest.getCronExpression()))
                    .endAt(jobRequest.getEndTime())
                    .build();

            boolean updated = schedulerService.updateJob(jobRequest.getJobName(), jobRequest.getJobGroup(), newTrigger);
            if (updated) {
                return ResponseEntity.ok("Job updated successfully");
            } else {
                return ResponseEntity.badRequest().body("Job not found");
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error updating job: " + e.getMessage());
        }
    }

    @DeleteMapping("/delete/{jobGroup}/{jobName}")
    public ResponseEntity<String> deleteJob(@PathVariable String jobGroup, @PathVariable String jobName) {
        try {
            boolean deleted = schedulerService.deleteJob(jobName, jobGroup);
            if (deleted) {
                return ResponseEntity.ok("Job deleted successfully");
            } else {
                return ResponseEntity.badRequest().body("Job not found");
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error deleting job: " + e.getMessage());
        }
    }

    @GetMapping("/list")
    public ResponseEntity<List<String>> getAllJobs() {
        try {
            return ResponseEntity.ok(schedulerService.getAllJobs());
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping("/pause/{jobGroup}/{jobName}")
    public ResponseEntity<String> pauseJob(@PathVariable String jobGroup, @PathVariable String jobName) {
        try {
            boolean paused = schedulerService.pauseJob(jobName, jobGroup);
            if (paused) {
                return ResponseEntity.ok("Job paused successfully");
            } else {
                return ResponseEntity.badRequest().body("Job not found");
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error pausing job: " + e.getMessage());
        }
    }

    @PostMapping("/resume/{jobGroup}/{jobName}")
    public ResponseEntity<String> resumeJob(@PathVariable String jobGroup, @PathVariable String jobName) {
        try {
            boolean resumed = schedulerService.resumeJob(jobName, jobGroup);
            if (resumed) {
                return ResponseEntity.ok("Job resumed successfully");
            } else {
                return ResponseEntity.badRequest().body("Job not found");
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error resuming job: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private Class<? extends Job> getClass(String className) throws ClassNotFoundException {
        return (Class<? extends Job>) Class.forName(className);
    }
}