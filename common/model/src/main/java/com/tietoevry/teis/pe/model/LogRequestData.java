package com.tietoevry.teis.pe.model;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;


@Schema(name = "LogRequestData")
public class LogRequestData implements Serializable{
    private String taskId;
    private String time;
    private String itemId;
    private String level;
    private String type;
    private String message;
    private int workspaceId;
    private String tag;
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getWorkspaceId() {
		return workspaceId;
	}
	public void setWorkspaceId(int workspaceId) {
		this.workspaceId = workspaceId;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	@Override
	public String toString() {
		return "LogRequestData [taskId=" + taskId + ", time=" + time + ", itemId=" + itemId + ", level=" + level
				+ ", type=" + type + ", message=" + message + ", workspaceId=" + workspaceId + ", tag=" + tag + "]";
	}
    

}
