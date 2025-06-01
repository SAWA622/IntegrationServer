package com.tietoevry.teis.executor.vo;

import java.util.List;

public class ExecutorVo {
	
	private String taskId;
	private String itemId;
	private String itemName;
	private String executableName;
	private String excutablePath;
	private String itemType;
	private String type;
	private int workspaceId;
	private int id;
	private String status;
	private String taskStatus;
	private List<ConfigVo> configDataList;
	private List<String> sysLibs;
	private List<ParamVo> parameters;
	private List<NetUserVo> netUsers;
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
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getExecutableName() {
		return executableName;
	}
	public void setExecutableName(String executableName) {
		this.executableName = executableName;
	}
	public String getExcutablePath() {
		return excutablePath;
	}
	public void setExcutablePath(String excutablePath) {
		this.excutablePath = excutablePath;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getWorkspaceId() {
		return workspaceId;
	}
	public void setWorkspaceId(int workspaceId) {
		this.workspaceId = workspaceId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public List<ConfigVo> getConfigDataList() {
		return configDataList;
	}
	public void setConfigDataList(List<ConfigVo> configDataList) {
		this.configDataList = configDataList;
	}
	public List<String> getSysLibs() {
		return sysLibs;
	}
	public void setSysLibs(List<String> sysLibs) {
		this.sysLibs = sysLibs;
	}
	public List<ParamVo> getParameters() {
		return parameters;
	}
	public void setParameters(List<ParamVo> parameters) {
		this.parameters = parameters;
	}
	public List<NetUserVo> getNetUsers() {
		return netUsers;
	}
	public void setNetUsers(List<NetUserVo> netUsers) {
		this.netUsers = netUsers;
	}

}
