package com.example.demo.exception;

import org.springframework.http.HttpStatus;

import com.example.demo.exception.UserServiceException;

public class UserServiceException extends RuntimeException {

	private String errorMessage;
	private HttpStatus httpStatus;

	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @return the httpStatus
	 */
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}

	public UserServiceException(String errorMessage, HttpStatus httpStatus) {
		super();
		this.errorMessage = errorMessage;
		this.httpStatus = httpStatus;
	}

	public UserServiceException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserServiceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public UserServiceException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public UserServiceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public UserServiceException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
