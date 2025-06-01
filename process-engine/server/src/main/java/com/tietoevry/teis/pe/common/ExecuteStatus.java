package com.tietoevry.teis.pe.common;

public enum ExecuteStatus {
	Success("Success"), Busy("Busy"), Failed("Failed");

	private String status;

	public String getStatus() {
		return status;
	}

	ExecuteStatus(String s) {
		this.status = s;
	}

	public static ExecuteStatus fromValue(String text) {
		if (text != null) {
			text = text.trim();
		}
		for (ExecuteStatus b : ExecuteStatus.values()) {
			if (String.valueOf(b.status).equalsIgnoreCase(text)) {
				return b;
			}
		}
		return null;
	}
}
