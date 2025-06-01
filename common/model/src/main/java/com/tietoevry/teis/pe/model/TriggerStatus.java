package com.tietoevry.teis.pe.model;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "TriggerStatus")
public class TriggerStatus {

	private String triggerName;
	private boolean triggerStarted;

	public String getTriggerName() {
		return triggerName;
	}

	public void setTriggerName(String triggerName) {
		this.triggerName = triggerName;
	}

	public boolean isTriggerStarted() {
		return triggerStarted;
	}

	public void setTriggerStarted(boolean triggerStarted) {
		this.triggerStarted = triggerStarted;
	}
}
