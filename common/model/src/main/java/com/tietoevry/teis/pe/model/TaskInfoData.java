package com.tietoevry.teis.pe.model;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "TaskInfoData")
public class TaskInfoData {
	private String taskId;
	private Integer itemId;
	private Integer workspaceId;
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public Integer getWorkspaceId() {
		return workspaceId;
	}
	public void setWorkspaceId(Integer workspaceId) {
		this.workspaceId = workspaceId;
	}
	
	

}
