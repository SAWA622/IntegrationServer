package com.tietoevry.teis.pe.model.v3;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name="KillTaskDetails")
public class KillTaskDetails {

	private  String taskId; 
	
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	
	public String getTaskId() {
		return taskId;
	}
}
