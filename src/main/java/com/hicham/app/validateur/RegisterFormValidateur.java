package com.hicham.app.validateur;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.hicham.app.model.UserForm;
@Component("RegisterValidateur")
public class RegisterFormValidateur implements  Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		return   RegisterFormValidateur.class.isAssignableFrom(RegisterFormValidateur.class);
		
	}

	@Override
	public void validate(Object arg0, Errors errors) {
		UserForm  userform=(UserForm) arg0;
		if(!userform.getEmail().contains("@") || userform.getEmail()==null )
		{
			
			
			errors.rejectValue("email", "INVALID", "adresse mail non valide");
		}
		ValidationUtils.rejectIfEmpty(errors, "prenom", "prenom.required");
		
	}

}
