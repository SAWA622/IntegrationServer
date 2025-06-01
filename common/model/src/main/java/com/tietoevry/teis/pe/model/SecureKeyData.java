package com.tietoevry.teis.pe.model;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name="SecureKeyData")
public class SecureKeyData {
	private String key;
	private String algorithm;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getAlgorithm() {
		return algorithm;
	}
	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}
	

}
