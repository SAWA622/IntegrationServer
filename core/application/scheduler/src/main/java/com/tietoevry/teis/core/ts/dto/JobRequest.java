package com.tietoevry.teis.core.ts.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class JobRequest {
    private String jobName;
    private String jobGroup;
    private String jobClass;
    private String cronExpression;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date startTime;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date endTime;
    private String exclusionStart;  
    private String exclusionEnd;   
    
    // Getters and Setters
    public String getJobName() { return jobName; }
    public void setJobName(String jobName) { this.jobName = jobName; }
    
    public String getJobGroup() { return jobGroup; }
    public void setJobGroup(String jobGroup) { this.jobGroup = jobGroup; }
    
    public String getJobClass() { return jobClass; }
    public void setJobClass(String jobClass) { this.jobClass = jobClass; }
    
    public String getCronExpression() { return cronExpression; }
    public void setCronExpression(String cronExpression) { this.cronExpression = cronExpression; }
    
    public Date getStartTime() { return startTime; }
    public void setStartTime(Date startTime) { this.startTime = startTime; }
    
    public Date getEndTime() { return endTime; }
    public void setEndTime(Date endTime) { this.endTime = endTime; }
    
    public String getExclusionStart() { return exclusionStart; }
    public void setExclusionStart(String exclusionStart) { this.exclusionStart = exclusionStart; }
    
    public String getExclusionEnd() { return exclusionEnd; }
    public void setExclusionEnd(String exclusionEnd) { this.exclusionEnd = exclusionEnd; }
}