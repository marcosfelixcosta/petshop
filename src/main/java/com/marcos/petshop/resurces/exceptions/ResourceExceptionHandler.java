package com.marcos.petshop.resurces.exceptions;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.marcos.petshop.service.exceptions.ObjetoNaoEncontradoException;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ObjetoNaoEncontradoException.class)
	public ResponseEntity<StandartError> objectNotFound(ObjetoNaoEncontradoException e, HttpServletRequest request) {
		
		StandartError error = new StandartError(HttpStatus.NOT_FOUND.value(), e.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
		
	}
	

}
