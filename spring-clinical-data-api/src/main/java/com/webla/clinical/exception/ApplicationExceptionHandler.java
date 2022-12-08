package com.webla.clinical.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = { PatientNotFoundException.class} )
	public ResponseEntity<ErrorResponse> 
		handlePatientNotFoundException(Exception e){
		ErrorResponse errorResponse =
				new ErrorResponse(404, new Date(), e.getMessage());
		return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler(value = { PatientAlreadyAvailableException.class} )
	public ResponseEntity<ErrorResponse> 
		handlePatientAlreadyException(Exception e){
		ErrorResponse errorResponse =
				new ErrorResponse(404, new Date(), e.getMessage());
		return new ResponseEntity<>(errorResponse, HttpStatus.FOUND);
	}
	
	@ExceptionHandler(value = { Exception.class} )
	public ResponseEntity<ErrorResponse> 
		handleException(Exception e){
		ErrorResponse errorResponse =
				new ErrorResponse(404, new Date(), e.getMessage());
		return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
	}
	
}
