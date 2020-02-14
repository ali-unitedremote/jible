package com.unitedremote.bootcamp.services.utils;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

@Service
public class ErrorHandlingService {

	public String InputValidationErroHandler(BindingResult bindingResult){
		String errorMessage = "";
		List<ObjectError> errors = bindingResult.getAllErrors();
		
		for (ObjectError error : errors) {
			String fieldError = ((FieldError) error).getField();
			errorMessage+=  fieldError + " " + error.getDefaultMessage() + "\n";
		}
		
		return "Problem with your data : \n" + errorMessage;
	}
}
