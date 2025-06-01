package com.tietoevry.teis.pe.client.v3.vo;

public class MsgDelayRequest {

	private String taskId;

	private long delayTimeInMiliSec;

	public long getDelayTimeInMiliSec() {
		return delayTimeInMiliSec;
	}

	public void setDelayTimeInMiliSec(long delayTimeInMiliSec) {
		this.delayTimeInMiliSec = delayTimeInMiliSec;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
}
