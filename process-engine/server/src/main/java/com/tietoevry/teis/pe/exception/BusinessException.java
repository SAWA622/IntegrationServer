package com.tietoevry.teis.pe.exception;

public class BusinessException extends Exception {
	
	private IErrorCode errorCode;

	public BusinessException(IErrorCode code, String  msg) {
		 super(msg);
	}
	
	public BusinessException(IErrorCode code) {
		 super(code.getMessage());
		 this.errorCode = code;
	}

	 
	
	public BusinessException(IErrorCode code, String message, Throwable cause) {
		super(message, cause);
		this.errorCode = code;
	}
	
	@Override
	public String getMessage() {
		StringBuffer sb = new StringBuffer(errorCode.getCode());
		sb.append("::").append(errorCode.getMessage());
		sb.append("\n");
		sb.append(super.getMessage());
		return sb.toString();
	}

	
}
