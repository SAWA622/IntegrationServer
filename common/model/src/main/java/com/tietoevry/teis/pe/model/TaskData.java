package com.tietoevry.teis.pe.model;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;


@Schema(name = "TaskData")
public class TaskData {
	
	private String id;
	private String name;
	private String itemType;
	private String itemId;
	private String workspaceId;
	private int msgPendingDelay;
	private List<String> syslibIds;
	private List<ParamData> parameters;
	private List<ExecutableData> executables;
	private List<ConfigData> configDataList;
	private String baseUrl;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
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
	public int getMsgPendingDelay() {
		return msgPendingDelay;
	}
	public void setMsgPendingDelay(int msgPendingDelay) {
		this.msgPendingDelay = msgPendingDelay;
	}
	public List<String> getSyslibIds() {
		return syslibIds;
	}
	public void setSyslibIds(List<String> syslibIds) {
		this.syslibIds = syslibIds;
	}
	public List<ParamData> getParameters() {
		return parameters;
	}
	public void setParameters(List<ParamData> parameters) {
		this.parameters = parameters;
	}
	public List<ExecutableData> getExecutables() {
		return executables;
	}
	public void setExecutables(List<ExecutableData> executables) {
		this.executables = executables;
	}
	public List<ConfigData> getConfigDataList() {
		return configDataList;
	}
	public void setConfigDataList(List<ConfigData> configDataList) {
		this.configDataList = configDataList;
	}
	public String getBaseUrl() {
		return baseUrl;
	}
	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	
}
