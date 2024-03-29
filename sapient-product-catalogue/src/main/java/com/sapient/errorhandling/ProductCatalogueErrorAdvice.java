package com.sapient.errorhandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.sapient.exception.ProductException;

@ControllerAdvice
public class ProductCatalogueErrorAdvice {
	
	@ExceptionHandler({RuntimeException.class})
	public ResponseEntity<String> handleRuntimeException(RuntimeException e){
	   return error(HttpStatus.INTERNAL_SERVER_ERROR, e);
	}
	
	@ExceptionHandler({ProductException.class})
	public ResponseEntity<String> handleNotFoundException(ProductException e){
		return error(HttpStatus.NOT_FOUND, e);
	}
	
	private ResponseEntity<String> error(HttpStatus status,Exception e){
		return ResponseEntity.status(status).body(e.getMessage());
	}

}
