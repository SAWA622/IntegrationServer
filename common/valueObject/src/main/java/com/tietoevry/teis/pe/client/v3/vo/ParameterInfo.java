package com.tietoevry.teis.pe.client.v3.vo;

public class ParameterInfo {
    
    private String parameterName;
    private String workspaceId;
    private String taskId;
    private String parameterValue;
    
    
    public String getParameterValue() {
		return parameterValue;
	}
    public void setParameterValue(String parameterValue) {
		this.parameterValue = parameterValue;
	}
    
    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }
    
    
}

