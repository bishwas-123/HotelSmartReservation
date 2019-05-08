package com.hsr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hsr.forms.LoginForm;

@Controller
public class LoginController {
	
	//to get login form page
	
	@RequestMapping (value="/login", method=RequestMethod.GET)
	public String getLoginForm() {
		
		//returns "login" page
		return "login";
	}

	//to check login credential
	@RequestMapping (value="/login", method=RequestMethod.POST)
	public String login(@ModelAttribute(name="loginForm") LoginForm loginForm, Model model) {
		String username=loginForm.getUsername();
		String password=loginForm.getPassword();
		
		if(username.equals("admin") && password.equals("password"))
			return "home";
		else {
			model.addAttribute("invalidCredential", true);
			return "login";
		}
	}
}
