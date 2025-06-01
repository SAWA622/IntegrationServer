package com.tietoevry.teis.pe.client.v3.vo;

 class ErrorMessageInfo {
	private String message;
	private String type;
	private String taskId;
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getTaskId() {
		return taskId;
	}
	
	
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	
}
