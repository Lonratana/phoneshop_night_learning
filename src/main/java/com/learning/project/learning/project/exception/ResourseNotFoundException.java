package com.learning.project.learning.project.exception;

import org.springframework.http.HttpStatus;

public class ResourseNotFoundException extends ApiException {

	public ResourseNotFoundException(String resourceName,Integer id) {
		super(HttpStatus.NOT_FOUND, String.format("%s with id = %d not found ", resourceName,id));
	}

}