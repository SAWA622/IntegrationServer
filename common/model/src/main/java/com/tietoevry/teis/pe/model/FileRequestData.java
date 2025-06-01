package com.tietoevry.teis.pe.model;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "FileRequestData")
public class FileRequestData {
	
	private String taskId;
    private String extension;
    private boolean autoDelete;
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	public boolean isAutoDelete() {
		return autoDelete;
	}
	public void setAutoDelete(boolean autoDelete) {
		this.autoDelete = autoDelete;
	}

}
