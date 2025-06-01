package com.tietoevry.teis.pe.model;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "MutexData")
public class MutexData {
	private String mutex;
    private String taskId;
    private boolean  removeMutex;
	public String getMutex() {
		return mutex;
	}
	public void setMutex(String mutex) {
		this.mutex = mutex;
	}
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public boolean isRemoveMutex() {
		return removeMutex;
	}
	public void setRemoveMutex(boolean removeMutex) {
		this.removeMutex = removeMutex;
	}
    

}
