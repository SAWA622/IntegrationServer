package com.tietoevry.teis.pe.client.v3.vo;

public class RegisterRequest {

	private String scriptEngineIP;
	private String scriptEnginePort;
	private String scriptEngineKey;
	private String scriptEngineMode;
	private String cacheObjectLifespan;
	private String processPoolSize;
	private boolean enabled;

	private byte[] certdata;

	public String getScriptEngineIP() {
		return scriptEngineIP;
	}

	public void setScriptEngineIP(String scriptEngineIP) {
		this.scriptEngineIP = scriptEngineIP;
	}

	public String getScriptEnginePort() {
		return scriptEnginePort;
	}

	public void setScriptEnginePort(String scriptEnginePort) {
		this.scriptEnginePort = scriptEnginePort;
	}

	public String getScriptEngineKey() {
		return scriptEngineKey;
	}

	public void setScriptEngineKey(String scriptEngineKey) {
		this.scriptEngineKey = scriptEngineKey;
	}

	public String getScriptEngineMode() {
		return scriptEngineMode;
	}

	public void setScriptEngineMode(String scriptEngineMode) {
		this.scriptEngineMode = scriptEngineMode;
	}

	public String getCacheObjectLifespan() {
		return cacheObjectLifespan;
	}

	public void setCacheObjectLifespan(String cacheObjectLifespan) {
		this.cacheObjectLifespan = cacheObjectLifespan;
	}

	public String getProcessPoolSize() {
		return processPoolSize;
	}

	public void setProcessPoolSize(String processPoolSize) {
		this.processPoolSize = processPoolSize;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public byte[] getCertdata() {
		return certdata;
	}

	public void setCertdata(byte[] certdata) {
		this.certdata = certdata;
	}

}
