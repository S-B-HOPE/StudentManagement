package com.example.demo.exception;

import com.example.demo.exception.UserServiceException;

public class UserServiceException extends RuntimeException {

	public UserServiceException(String message) {

		super(message);

	}

}
