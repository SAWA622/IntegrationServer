package com.tietoevry.teis.pe.model;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "IdentifierData")
public class IdentifierData {

	private String identifierdetails;
	private String taskId;
	private Integer workspaceId;
	private String triggerTaskId;
	private String parentTaskId;
	public String getIdentifierdetails() {
		return identifierdetails;
	}
	public void setIdentifierdetails(String identifierdetails) {
		this.identifierdetails = identifierdetails;
	}
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public Integer getWorkspaceId() {
		return workspaceId;
	}
	public void setWorkspaceId(Integer workspaceId) {
		this.workspaceId = workspaceId;
	}
	public String getTriggerTaskId() {
		return triggerTaskId;
	}
	public void setTriggerTaskId(String triggerTaskId) {
		this.triggerTaskId = triggerTaskId;
	}
	public String getParentTaskId() {
		return parentTaskId;
	}
	public void setParentTaskId(String parentTaskId) {
		this.parentTaskId = parentTaskId;
	}
	
}
