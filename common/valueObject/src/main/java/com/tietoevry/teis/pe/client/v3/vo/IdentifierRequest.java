/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tietoevry.teis.pe.client.v3.vo;

import java.util.Map;

public class IdentifierRequest {
    
    private String triggerId;
    private String filePath;
    private String taskId;
    private String workspaceId;
    private String identifierdetails;
    private Map<String, String> parameterMap;
    private String status;
    private String triggerTaskId;
    public String activatedByHost;
    public String activatedByPID ;

    public String getTriggerTaskId() {
        return triggerTaskId;
    }

    public void setTriggerTaskId(String triggerTaskId) {
        this.triggerTaskId = triggerTaskId;
    }

    public String getActivatedByHost() {
		return activatedByHost;
	}
    
    public void setActivatedByHost(String activatedByHost) {
		this.activatedByHost = activatedByHost;
	}
    
    public String getActivatedByPID() {
		return activatedByPID;
	}
    
    public void setActivatedByPID(String activatedByPID) {
		this.activatedByPID = activatedByPID;
	}
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    

    public Map<String, String> getParameterMap() {
        return parameterMap;
    }

    public void setParameterMap(Map<String, String> parameterMap) {
        this.parameterMap = parameterMap;
    }
    
    

    public String getIdentifierdetails() {
        return identifierdetails;
    }

    public void setIdentifierdetails(String identifierdetails) {
        this.identifierdetails = identifierdetails;
    }
    

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTriggerId() {
        return triggerId;
    }

    public void setTriggerId(String triggerId) {
        this.triggerId = triggerId;
    }

    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }
    
    
}
