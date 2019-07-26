package com.petpeers.petpeers.controllers;


	import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

	@ResponseStatus(HttpStatus.NOT_FOUND)
		public class PetNotFoundException extends RuntimeException {

			public PetNotFoundException(String exception) {
				super(exception);
			}

		}



