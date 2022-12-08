package com.webla.clinical.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.FOUND)
public class PatientAlreadyAvailableException extends RuntimeException{
	public PatientAlreadyAvailableException(String message) {
		super(message);
	}
}
