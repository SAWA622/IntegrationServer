package com.tietoevry.teis.pe.model;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name="BooleanResult")
public class BooleanResult {
	
	private boolean result;
	
	public BooleanResult(boolean r) {
		this.setResult(r);
	}
	public BooleanResult() {
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}
	
	

}
