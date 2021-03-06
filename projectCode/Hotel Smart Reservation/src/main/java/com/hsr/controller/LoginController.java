package com.hsr.controller;

import com.hsr.entities.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hsr.form.LoginForm;

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
	public String login(@ModelAttribute(name="loginForm") Account account, Model model) {
		String username=account.getUserName();
		String password=account.getPassword();
		
		if(username.equals("admin") && password.equals("password"))
			return "home";
		else {
			model.addAttribute("invalidCredential", true);
			return "login";
		}
	}
}
