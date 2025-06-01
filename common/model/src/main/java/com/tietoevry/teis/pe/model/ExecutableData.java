package com.tietoevry.teis.pe.model;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;


@Schema(name="ExecutableData")
public class ExecutableData {
	
	private String id;
	private String name;
	private ExecutableType type;
	private String version;
	private List<ParamData> parameters;
	private List<NetUserData> netUsers;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ExecutableType getType() {
		return type;
	}
	public void setType(ExecutableType type) {
		this.type = type;
	}
	public List<ParamData> getParameters() {
		return parameters;
	}
	public void setParameters(List<ParamData> parameters) {
		this.parameters = parameters;
	}
	public List<NetUserData> getNetUsers() {
		return netUsers;
	}
	public void setNetUsers(List<NetUserData> netUsers) {
		this.netUsers = netUsers;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	

}
