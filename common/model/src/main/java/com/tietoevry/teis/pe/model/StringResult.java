package com.tietoevry.teis.pe.model;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "StringResult")
public class StringResult {
	
	private String result;
	
	public StringResult() {
	}
	public StringResult(String r) {
		this.setResult(r);
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	

}
