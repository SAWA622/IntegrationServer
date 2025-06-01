package com.tietoevry.teis.pe.model;

import java.util.ArrayList;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;


@Schema(name = "ExecutorParamData")
public class ExecutorParamData {
	private String taskId;
	private List<ParamData> parameterDataList = new ArrayList<ParamData>();
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public List<ParamData> getParameterDataList() {
		return parameterDataList;
	}
	public void setParameterDataList(List<ParamData> parameterDataList) {
		this.parameterDataList = parameterDataList;
	}
	

}
