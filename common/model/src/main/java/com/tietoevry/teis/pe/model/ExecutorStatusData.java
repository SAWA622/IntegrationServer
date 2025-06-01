package com.tietoevry.teis.pe.model;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "ExecutorStatusData")
public class ExecutorStatusData {

	private String taskId;
	private int itemId;
	private String workspaceId;
	private String status;
	private String taskStatus;
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
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
	public String getTaskStatus() {
		return taskStatus;
	}
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	@Override
	public String toString() {
		return "ExecutorStatusData [taskId=" + taskId + ", itemId=" + itemId + ", workspaceId=" + workspaceId
				+ ", status=" + status + ", taskStatus=" + taskStatus + "]";
	}
	
	
}
