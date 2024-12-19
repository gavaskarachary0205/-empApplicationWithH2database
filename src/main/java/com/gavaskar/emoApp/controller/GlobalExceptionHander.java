package com.gavaskar.emoApp.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHander{
		@ExceptionHandler(MethodArgumentNotValidException.class)
		public ResponseEntity<Map<String,String >> handleValidException(MethodArgumentNotValidException ex){
			Map<String, String> errors=new HashMap<>();
			BindingResult bindingresult=ex.getBindingResult();
			bindingresult.getFieldErrors().forEach((error)->{
				String fielName= error.getField(); //email
				String Meassge=error.getDefaultMessage();
				errors.put(fielName,Meassge);
			});
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors);
		}
		
}
