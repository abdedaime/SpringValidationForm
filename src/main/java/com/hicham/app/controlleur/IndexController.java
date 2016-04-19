package com.hicham.app.controlleur;

import java.util.logging.Logger;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hicham.app.model.UserForm;

@Controller
public class IndexController  {

	private Logger logger = Logger.getLogger(IndexController.class.getName());
    @Autowired
    @Qualifier("RegisterValidateur")
	 private Validator   registerValidateur;
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		logger.info("HELLO CONTROLLEUR");
		return "index";
	}

	@ModelAttribute("userForm")
	public UserForm intiForm() {
		return new UserForm();
	}
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public    String register(@ModelAttribute("userForm") @Valid   UserForm userForm,Model model ,BindingResult bindingResult){
		
		registerValidateur.validate(userForm, bindingResult);
		
		return  "index";
	}
	

}
