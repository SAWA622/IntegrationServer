package com.tietoevry.teis.pe.exception;

public interface IErrorCode {
	Type getType();
	String getCode();
	String getMessage();
}
