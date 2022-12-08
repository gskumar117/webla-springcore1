package com.webla.clinical.exception;

import java.io.Serializable;
import java.util.Date;

public class ErrorResponse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int statusCode;
	private Date timeStamp;
	private String errorDescription;

	public ErrorResponse(int statusCode, Date timeStamp, String errorDescription) {
		super();
		this.statusCode = statusCode;
		this.timeStamp = timeStamp;
		this.errorDescription = errorDescription;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

}
