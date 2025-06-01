package com.tietoevry.teis.pe.exception;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name="ErrorMessage")
public class ErrorMessage {
	
private String code;
private String message;

public ErrorMessage(String c, String message) {
	super();
	this.code = c;
	this.message = message;
}

public ErrorMessage() {
	super();
	
}


public String getCode() {
	return code;
}

public void setCode(String code) {
	this.code = code;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}
}
