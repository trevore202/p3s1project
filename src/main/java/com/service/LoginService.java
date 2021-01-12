package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.dao.UserDao;
import com.model.User;

@Service
public class LoginService {

	@Autowired
	UserDao userDao;
	
	public boolean login(ModelMap m,String username, String password) {
		Optional<User> user = userDao.findById(username);
		if(user.isPresent()) {
			User u = user.get();
			if (u.getUsername().equalsIgnoreCase(username) && u.getPassword().equals(password)){
				m.put("user", u);
				return true;
			}
		}
		return false;
	}
	
	
	public boolean register(String name, String pass, String email, String city) {
		try{
			userDao.save(new User(name,pass,email,city));
			return true;
		} catch(Exception e) {
			return false;
		}
	}
	
	public User edit(String email,String city,String name) {
		Optional<User> user = userDao.findById(name);
		if (user.isPresent()) {
			User u = user.get();
			u.setEmail(email);
			u.setCity(city);
			userDao.save(u);
			return u;
		}else {
			return null;
		}
	}
}
