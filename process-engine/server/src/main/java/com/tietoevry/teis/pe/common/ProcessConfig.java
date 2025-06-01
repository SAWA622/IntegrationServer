package com.tietoevry.teis.pe.common;

public class ProcessConfig {

	private String url;
	private int poolSize = 30;
	private int processId;
	private Process process;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getPoolSize() {
		return poolSize;
	}

	public void setPoolSize(int poolSize) {
		this.poolSize = poolSize;
	}

	public int getProcessId() {
		return processId;
	}

	public void setProcessId(int processId) {
		this.processId = processId;
	}

	public Process getProcess() {
		return process;
	}

	public void setProcess(Process process) {
		this.process = process;
	}

	@Override
	public String toString() {
		return "ProcessConfig [url=" + url + ", poolSize=" + poolSize + ", processId=" + processId + ", process="
				+ process + "]";
	}

}