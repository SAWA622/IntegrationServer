package com.tietoevry.teis.pe.client.v3.vo;

public class TriggerDetails {

	private String triggerIdentity;
	private String workspaceId;
	private String activatedByTaskId;
	private String activatedBy;
	private String activatedByPId;
	private String activatedByHost;

	public String getTriggerIdentity() {
		return triggerIdentity;
	}

	public void setTriggerIdentity(String triggerIdentity) {
		this.triggerIdentity = triggerIdentity;
	}

	public String getWorkspaceId() {
		return workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
	}

	public String getActivatedBy() {
		return activatedBy;
	}

	public void setActivatedBy(String activatedBy) {
		this.activatedBy = activatedBy;
	}

	public String getActivatedByTaskId() {
		return activatedByTaskId;
	}

	public void setActivatedByTaskId(String activatedByTaskId) {
		this.activatedByTaskId = activatedByTaskId;
	}

	public String getActivatedByPId() {
		return activatedByPId;
	}

	public void setActivatedByPId(String activatedByPId) {
		this.activatedByPId = activatedByPId;
	}

	public String getActivatedByHost() {
		return activatedByHost;
	}

	public void setActivatedByHost(String activatedByHost) {
		this.activatedByHost = activatedByHost;
	}
}
