package com.tietoevry.teis.pe.client.v3.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ExecutorParametersData implements Serializable {

	private static final long serialVersionUID = 1L;
	private String taskId;
    private List<ParamElement> parameterDataList = new ArrayList<ParamElement>();

    public List<ParamElement> getParameterDataList() {
        return parameterDataList;
    }

    public void setParameterDataList(List<ParamElement> parameterDataList) {
        this.parameterDataList = parameterDataList;
    }
    
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }
}
