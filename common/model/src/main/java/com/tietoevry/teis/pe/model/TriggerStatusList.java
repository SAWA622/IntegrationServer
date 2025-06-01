package com.tietoevry.teis.pe.model;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name= "TriggerStatusList")
public class TriggerStatusList {

	List<TriggerStatus> triggerStatus;

	public List<TriggerStatus> getTriggerStatus() {
		return triggerStatus;
	}

	public void setTriggerStatus(List<TriggerStatus> triggerStatus) {
		this.triggerStatus = triggerStatus;
	}

}
