package com.tietoevry.teis.pe.exception;


public class TeisException extends RuntimeException {
	
	private IErrorCode errorCode;

	public TeisException(IErrorCode code, String  msg) {
		 super(msg);
	}
	
	public TeisException(IErrorCode code) {
		 super(code.getMessage());
		 this.errorCode = code;
	}

	 
	
	public TeisException(IErrorCode code, String message, Throwable cause) {
		super(message, cause);
		this.errorCode = code;
	}

	public TeisException(IErrorCode code, Throwable cause) {
		super(cause);
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
	
	public IErrorCode getCode() {
		return this.errorCode;
	}

	public static void throwError(IErrorCode code, String message) throws TeisException {
		throw new TeisException(code, message);
	}
	public static void throwError(IErrorCode code, Exception exception) throws TeisException {
		throw new TeisException(code, exception);
	}
	
	public static void throwError(IErrorCode code, String message, Exception exception) throws TeisException {
		throw new TeisException(code, message, exception);
	}
	

}
