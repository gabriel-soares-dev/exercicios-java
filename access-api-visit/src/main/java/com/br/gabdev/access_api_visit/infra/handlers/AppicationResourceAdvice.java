package com.br.gabdev.access_api_visit.infra.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.br.gabdev.access_api_visit.core.exception.BusinessException;

@RestControllerAdvice
public class AppicationResourceAdvice {
	
	@ExceptionHandler(BusinessException.class)
	@ResponseStatus(HttpStatus.PRECONDITION_FAILED)
	public ApiError handleBusinessException(BusinessException ex) {
		return new ApiError(ex.getMessage());
	}
}
