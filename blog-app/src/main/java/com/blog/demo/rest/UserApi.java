package com.blog.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.blog.demo.dao.User;
import com.blog.demo.dao.UserRepository;

@RestController
@CrossOrigin("*")
public class UserApi {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<User> getUsers() {
		return userRepository.findAll();
	}
	
	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
	public User findUser(@PathVariable Long id) {
		return userRepository.getOne(id);
	} 
	
	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public User addUser(@RequestBody User user) {
		return userRepository.save(user);
	}
	
	@RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)
	public Boolean updateUser(@PathVariable Long id,@RequestBody User user) {
		try {
			User u = userRepository.getOne(id);
			user.setId(u.getId());
			userRepository.save(user);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}
	


}
