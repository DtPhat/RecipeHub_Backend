package com.example.RecipeHub.errorHandlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class ErrorHandler {
	@ExceptionHandler(UnauthorizedExeption.class)
	public ResponseEntity<String> accessDenied(UnauthorizedExeption ex){
		return new ResponseEntity<>(ex.getMessage() ,HttpStatus.UNAUTHORIZED);
	}
}