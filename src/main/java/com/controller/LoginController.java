package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.User;
import com.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService service;
	
	
	@GetMapping("/hello")
	@ResponseBody
	public String sayHello() {
		return "Hi Trevor";
	}
	
	@GetMapping("/login")
	public String showLogin() {
		return "login";
	}
	
	@PostMapping("/login")
	public String login(ModelMap m,@RequestParam("uname")String uname, @RequestParam("pass")String password) {
		if(service.login(m, uname, password)) {
			return "welcome";
		}
		m.put("errormessage", "Invalid Credentials. Please try again");
		return "login";
	}
	
	
	@GetMapping("/register")
	public String showRegister() {
		return "register";
	}
	
	@PostMapping("/register")
	public String register(@RequestParam("uname")String name, @RequestParam("pass")String pass,
			@RequestParam("email")String email, @RequestParam("city")String city) {
		if(service.register(name,pass,email,city)) {
			System.out.println("registered success");
		}else {
			System.out.println("register failure");
		}
		return "redirect:/login";
	}
	
	@PostMapping("/edit")
	public String editUser(ModelMap m, @RequestParam("email")String email, 
			@RequestParam("city")String city,@RequestParam("name")String name) {
		User u = service.edit(email,city,name);
		if(u!=null) {
			m.put("updateMessage", "Update Successful!");
			m.put("user",u);
			return "welcome";
		}else {
			m.put("updateMessage", "Update NOT Successful!");
			return "welcome";
		}
		
		
	}
}
