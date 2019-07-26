package com.petpeers.petpeers.Exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ExceptionResponse {

		   private HttpStatus status;
		   @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
		   private LocalDate localDate;
		   private String message;
		   private String debugMessage;

		   private ExceptionResponse() {
		       localDate = LocalDate.now();
		   }

		   ExceptionResponse(HttpStatus status) {
		       this();
		       this.status = status;
		   }

		   ExceptionResponse(HttpStatus status, Throwable ex) {
		       this();
		       this.status = status;
		       this.message = "Unexpected error";
		       this.debugMessage = ex.getLocalizedMessage();
		   }

		   ExceptionResponse(LocalDate localDate, String message, Throwable ex) {
		       this();
		       this.localDate = localDate;
		       this.message = message;
		       this.debugMessage = ex.getLocalizedMessage();
		   }
		}

