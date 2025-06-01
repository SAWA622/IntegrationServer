package com.tietoevry.teis.pe.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.tietoevry.teis.pe.exception.ErrorMessage;
import com.tietoevry.teis.pe.exception.PlainMessage;
import com.tietoevry.teis.pe.exception.TeisException;

@ControllerAdvice
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class GlobalControllerAdvice // extends ResponseEntityExceptionHandler
{
	/**
	 * Note use base class if you wish to leverage its handling. Some code will need
	 * changing.
	 */
	private static final Logger logger = LoggerFactory.getLogger(GlobalControllerAdvice.class);

	@ExceptionHandler(Throwable.class)
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	public ResponseEntity<ErrorMessage> problem(final Throwable e) {
		String message = e.getMessage();
		// might actually prefer to use a generic message
		UUID uuid = UUID.randomUUID();
		String logRef = uuid.toString();
		logger.error("logRef=" + logRef, message, e);
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).contentType(MediaType.APPLICATION_JSON)
				.body(new ErrorMessage(logRef, message));
		// return new ResponseEntity <ErrorMessage> (new ErrorMessage(logRef, message),
		// HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(TeisException.class)
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	public ResponseEntity<ErrorMessage> handleTeisException(final TeisException e) {
		String message = e.getMessage();
		String logRef = e.getCode().getCode();
		logger.error("logRef=" + logRef, message, e);
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).contentType(MediaType.APPLICATION_JSON)
				.body(new ErrorMessage(logRef, message));
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public ResponseEntity<PlainMessage> handleMethodArgumentNotValid(MethodArgumentNotValidException ex) {
		List<FieldError> fieldErrors = ex.getBindingResult().getFieldErrors();
		List<ObjectError> globalErrors = ex.getBindingResult().getGlobalErrors();
		List<String> errors = new ArrayList<>(fieldErrors.size() + globalErrors.size());
		String error;
		for (FieldError fieldError : fieldErrors) {
			error = fieldError.getField() + ", " + fieldError.getDefaultMessage();
			errors.add(error);
		}
		for (ObjectError objectError : globalErrors) {
			error = objectError.getObjectName() + ", " + objectError.getDefaultMessage();
			errors.add(error);
		}
		PlainMessage errorMessage = new PlainMessage(errors);

		// Object result=ex.getBindingResult();//instead of above can allso pass the
		// more detailed bindingResult
		return ResponseEntity.badRequest().body(errorMessage);
		// return new ResponseEntity(errorMessage, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(ConstraintViolationException.class)
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public ResponseEntity<PlainMessage> handleConstraintViolatedException(ConstraintViolationException ex) {
		Set<ConstraintViolation<?>> constraintViolations = ex.getConstraintViolations();

		List<String> errors = new ArrayList<>(constraintViolations.size());
		String error;
		for (ConstraintViolation constraintViolation : constraintViolations) {

			error = constraintViolation.getMessage();
			errors.add(error);
		}

		PlainMessage errorMessage = new PlainMessage(errors);
		return ResponseEntity.badRequest().body(errorMessage);
	}

	@ExceptionHandler(MissingServletRequestParameterException.class)
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public ResponseEntity<PlainMessage> handleMissingServletRequestParameterException(
			MissingServletRequestParameterException ex) {

		List<String> errors = new ArrayList<>();
		String error = ex.getParameterName() + ", " + ex.getMessage();
		errors.add(error);
		PlainMessage errorMessage = new PlainMessage(errors);
		return ResponseEntity.badRequest().body(errorMessage);
	}

	@ExceptionHandler(HttpMediaTypeNotSupportedException.class)
	@ResponseStatus(code = HttpStatus.UNSUPPORTED_MEDIA_TYPE)
	public ResponseEntity<PlainMessage> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex) {
		String unsupported = "Unsupported content type: " + ex.getContentType();
		String supported = "Supported content types: " + MediaType.toString(ex.getSupportedMediaTypes());
		PlainMessage errorMessage = new PlainMessage(unsupported, supported);
		return ResponseEntity.status(HttpStatus.UNSUPPORTED_MEDIA_TYPE).body(errorMessage);
	}

	@ExceptionHandler(HttpMessageNotReadableException.class)
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public ResponseEntity<PlainMessage> handleHttpMessageNotReadable(HttpMessageNotReadableException ex) {
		Throwable mostSpecificCause = ex.getMostSpecificCause();
		PlainMessage errorMessage;
		if (mostSpecificCause != null) {
			String exceptionName = mostSpecificCause.getClass().getName();
			String message = mostSpecificCause.getMessage();
			errorMessage = new PlainMessage(exceptionName, message);
		} else {
			errorMessage = new PlainMessage(ex.getMessage());
		}
		return ResponseEntity.badRequest().body(errorMessage);
	}

}