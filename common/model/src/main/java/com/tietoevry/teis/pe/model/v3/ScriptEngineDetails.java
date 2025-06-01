package com.tietoevry.teis.pe.model.v3;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;


@Schema(name="ScriptEngineDetails")
public class ScriptEngineDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String scriptEngineName;
	
	private String cache;

	private String enabled;
	
	private String poolSize;
	
	private String seGroup;

	private String workspaceFolder;
	
	public String getCache() {
		return cache;
	}

	public void setCache(String cache) {
		this.cache = cache;
	}

	public String getEnabled() {
		return enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public String getPoolSize() {
		return poolSize;
	}

	public void setPoolSize(String poolSize) {
		this.poolSize = poolSize;
	}

	public String getSeGroup() {
		return seGroup;
	}

	public void setSeGroup(String seGroup) {
		this.seGroup = seGroup;
	}

	public String getScriptEngineName() {
		return scriptEngineName;
	}

	public void setScriptEngineName(String scriptEngineName) {
		this.scriptEngineName = scriptEngineName;
	}

	public String getWorkspaceFolder() {
		return workspaceFolder;
	}

	public void setWorkspaceFolder(String workspaceFolder) {
		this.workspaceFolder = workspaceFolder;
	}
}
