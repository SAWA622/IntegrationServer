package com.tietoevry.teis.pe.model;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name="ComponentData")
public class ComponentData {
	
	private String name;
	private String cache;
	private boolean enabled;
	private Integer poolSize;
	private String groupName;
	private String executableDirectory;
	private String tempDirectory;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCache() {
		return cache;
	}
	public void setCache(String cache) {
		this.cache = cache;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public Integer getPoolSize() {
		return poolSize;
	}
	public void setPoolSize(Integer poolSize) {
		this.poolSize = poolSize;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getExecutableDirectory() {
		return executableDirectory;
	}
	public void setExecutableDirectory(String executableDirectory) {
		this.executableDirectory = executableDirectory;
	}
	public String getTempDirectory() {
		return tempDirectory;
	}
	public void setTempDirectory(String tempDirectory) {
		this.tempDirectory = tempDirectory;
	}

}
