package com.tietoevry.teis.pe.model.v3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.tietoevry.teis.pe.model.ConfigData;
import com.tietoevry.teis.pe.model.NetUserData;
import com.tietoevry.teis.pe.model.ParamData;

import io.swagger.v3.oas.annotations.media.Schema;


@Schema(name="ExecutorData")
public class ExecutorData implements Serializable {

	private static final long serialVersionUID = 1L;
	private String taskId;
    private String itemId;
    private List<ParamData> parameterDataList = new ArrayList<ParamData>();
    private String workspaceId;
    private String scriptId;
    private String status;
    private String taskStatus;
    private String parentType;
    private List<ConfigData> configDataList = new ArrayList<ConfigData>();
    private String scriptTypes;
    private List<NetUserData> netUserDatas;
	private List<String> sysLibRef;
	private String logStatus;
	
	//added for memory leak
	private List<String> listOfChildIds;

    public String getTaskStatus() {
		return taskStatus;
	}
    public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
    public List<ParamData> getParameterDataList() {
        return parameterDataList;
    }

    public void setParameterDataList(List<ParamData> parameterDataList) {
        this.parameterDataList = parameterDataList;
    }
    
    public List<ConfigData> getConfigDataList() {
        return configDataList;
    }

    public void setConfigDataList(List<ConfigData> configDataList) {
        this.configDataList = configDataList;
    }

    public String getScriptTypes() {
        return scriptTypes;
    }

    public void setScriptTypes(String scriptTypes) {
        this.scriptTypes = scriptTypes;
    }

    public List<ConfigData> getConfigData() {
        return configDataList;
    }

    public void setConfigData(List<ConfigData> configDataList) {
        this.configDataList = configDataList;
    }

    public String getParentType() {
        return parentType;
    }

    public void setParentType(String parentType) {
        this.parentType = parentType;
    }

    public ExecutorData() {
    }

  /*  public ExecutorData(String taskId, String itemId,
            Map<String,ParameterData> parameters, String workspaceId, String scriptId) {
        super();
        this.taskId = taskId;
        this.itemId = itemId;
        this.parameterDataMap = parameters;
        this.workspaceId = workspaceId;
        this.scriptId = scriptId;
    } */

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }


    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public String getScriptId() {
        return scriptId;
    }

    public void setScriptId(String scriptId) {
        this.scriptId = scriptId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
	/**
	 * @return the netUserDatas
	 */
	public List<NetUserData> getNetUserDatas() {
		return netUserDatas;
	}
	/**
	 * @param netUserDatas the netUserDatas to set
	 */
	public void setNetUserDatas(List<NetUserData> netUserDatas) {
		this.netUserDatas = netUserDatas;
	}

	/**
	 * @return the sysLibRef
	 */
	public List<String> getSysLibRef() {
		return sysLibRef;
	}
	/**
	 * @param sysLibRef the sysLibRef to set
	 */
	public void setSysLibRef(List<String> sysLibRef) {
		this.sysLibRef = sysLibRef;
	}
	public List<String> getListOfChildIds() {
		return listOfChildIds;
	}
	public void setListOfChildIds(List<String> listOfChildIds) {
		this.listOfChildIds = listOfChildIds;
	}
	
	public String getLogStatus() {
		return logStatus;
	}
	public void setLogStatus(String logStatus) {
		this.logStatus = logStatus;
	}
	@Override
	public String toString() {
		return "ExecutorData [taskId=" + taskId + ", itemId=" + itemId + ", parameterDataList=" + parameterDataList
				+ ", workspaceId=" + workspaceId + ", scriptId=" + scriptId + ", status=" + status + ", taskStatus="
				+ taskStatus + ", parentType=" + parentType + ", configDataList=" + configDataList + ", scriptTypes="
				+ scriptTypes + ", netUserDatas=" + netUserDatas + ", sysLibRef=" + sysLibRef + ", logStatus="
				+ logStatus + ", listOfChildIds=" + listOfChildIds + "]";
	}
	
	
}
