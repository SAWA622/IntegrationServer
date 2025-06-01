package com.tietoevry.teis.pe.client.v3.vo;

import java.io.Serializable;
import java.util.List;

public class ExecutorStatusData implements Serializable {

	private static final long serialVersionUID = 1L;
	private String taskId;
    private String itemId;
    private String workspaceId;
    private String status;
    private String taskStatus;
	private String logStatus;
	
	//added for memory leak
	private List<String> childTaskIdsList;

    public String getTaskStatus() {
		return taskStatus;
	}
    public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
    
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }


    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
	
	 
	
	public String getLogStatus() {
		return logStatus;
	}
	public void setLogStatus(String logStatus) {
		this.logStatus = logStatus;
	}
	@Override
	public String toString() {
		return "ExecutorStatusData [taskId=" + taskId + ", itemId=" + itemId + ", workspaceId=" + workspaceId
				+ ", status=" + status + ", taskStatus=" + taskStatus + ", logStatus=" + logStatus + ", childTaskIdsList="
				+ childTaskIdsList + "]";
	}
	public List<String> getChildTaskIdsList() {
		return childTaskIdsList;
	}
	public void setChildTaskIdsList(List<String> childTaskIdsList) {
		this.childTaskIdsList = childTaskIdsList;
	}
	
	
}
