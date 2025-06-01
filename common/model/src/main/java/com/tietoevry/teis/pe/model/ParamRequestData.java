package com.tietoevry.teis.pe.model;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "ParamRequestData")
public class ParamRequestData {
		private Integer workspaceId;
	    private String name;
	    private String taskId;
	    private String value;
		public Integer getWorkspaceId() {
			return workspaceId;
		}
		public void setWorkspaceId(Integer workspaceId) {
			this.workspaceId = workspaceId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getTaskId() {
			return taskId;
		}
		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	    
}
