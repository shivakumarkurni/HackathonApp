package com.petpeers.petpeers.Exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.petpeers.petpeers.controllers.PetNotFoundException;
import com.petpeers.petpeers.controllers.UserNotFoundException;


@ControllerAdvice
@RestController
public class CoustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(Exception.class)
	  public final ResponseEntity<ExceptionResponse> handleAllExceptions(Exception ex, WebRequest request) {
	    ExceptionResponse exceptionResponse = new ExceptionResponse(LocalDate.now(), ex.getMessage(),ex);
	    return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	  }
	
	
	  @ExceptionHandler(PetNotFoundException.class)
	  public final ResponseEntity<ExceptionResponse> handlePetNotFoundException(PetNotFoundException ex, WebRequest request) {
	    ExceptionResponse exceptionResponse = new ExceptionResponse(LocalDate.now(), ex.getMessage(),ex);
	    return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
	  }
	  
	  @ExceptionHandler(UserNotFoundException.class)
	  public final ResponseEntity<ExceptionResponse> handleUserNotFoundException(UserNotFoundException ex, WebRequest request) {
	    ExceptionResponse exceptionResponse = new ExceptionResponse(LocalDate.now(), ex.getMessage(),ex);
	    return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
	  }
}
