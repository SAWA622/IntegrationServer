package com.tietoevry.teis.pe.exception;

public enum SystemErrorCode implements IErrorCode {

	ServerConnect(Type.Communication,"Coulden't connect to server, please see more error logs "),
	ServerEmptyResponse("Empty Response from server"),
	ServerErrorResponse("Empty Response from server"),
	InternalError("Internal error occured!!!"),
	PERegistration("Process Engine is not registred"),
	ExecutorRegistration("Executor is not registered"),
	JsonParseError(Type.Business," Json Parsing exception"),
	JMSCommunication(Type.Communication,"Jms couldn't connect or some exeception in message send/received");
	
	private Type type; 
	
	SystemErrorCode(String msg) {
		this.message = msg;
		this.type = Type.System;
	}
	
	SystemErrorCode(Type t, String msg) {
		this.message = msg;
		this.type = t;
	}
	
	private String message;

	@Override
	public String getCode() {
		return this.name();
	}

	@Override
	public String getMessage() {
		return message;
	}

	@Override
	public Type getType() {
		return this.type;
	}

}
