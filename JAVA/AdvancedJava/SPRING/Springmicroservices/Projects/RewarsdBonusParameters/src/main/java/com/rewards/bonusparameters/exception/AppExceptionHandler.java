package com.rewards.bonusparameters.exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = { Exception.class })
	public ResponseEntity<Object> handleAnyException(Exception ex, WebRequest req) {
		String errmsglocal = ex.getLocalizedMessage();
		if (errmsglocal == null)
			errmsglocal = ex.toString();
		Errormessage errmsg = new Errormessage(new Date(), errmsglocal);
		return new ResponseEntity<>(errmsg, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);

	}

	/*
	 * you can handle one and multiple messages by mentioning in brackets and change
	 * variable to exception instead of nullpointer or userCustomException
	 */
	@ExceptionHandler(value = { NullPointerException.class,UserCustomException.class })
	public ResponseEntity<Object> handleNullPointerException(Exception ex, WebRequest req) {
		String errmsglocal = ex.getLocalizedMessage();
		if (errmsglocal == null)
			errmsglocal = ex.toString();
		Errormessage errmsg = new Errormessage(new Date(), errmsglocal);
		return new ResponseEntity<>(errmsg, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);

	}

	/*
	 * @ExceptionHandler(value = { UserCustomException.class }) public
	 * ResponseEntity<Object> handleUserException(UserCustomException ex, WebRequest
	 * req) { String errmsglocal = ex.getLocalizedMessage(); if (errmsglocal ==
	 * null) errmsglocal = ex.toString(); Errormessage errmsg = new Errormessage(new
	 * Date(), errmsglocal); return new ResponseEntity<>(errmsg, new HttpHeaders(),
	 * HttpStatus.INTERNAL_SERVER_ERROR);
	 * 
	 * }
	 */

}
