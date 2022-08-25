package com.techment.Exception;

public class IdNotFoundException extends RuntimeException {
	String message;

	public IdNotFoundException(String message) {
		super();
		this.message = message;
	}
	
	
}
