package com.blog.demo.rest;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.blog.demo.dao.User;
import com.blog.demo.dao.UserRepository;

//@RestController
@CrossOrigin("*")
public class UserApi {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/users")
	public List<User> getUsers() {
		return userRepository.findAll();
	}

	@GetMapping("/users/{id}")
	public User getOne(@PathVariable Long id) {
		return userRepository.getOne(id);
	}

	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		return userRepository.save(user);
	}

	@PutMapping("/users/{id}")
	public Boolean updateUser(@RequestBody User user, @PathVariable Long id) {
		try {
			User u = userRepository.getOne(id);
			user.setId(u.getId());
			userRepository.save(user);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	@DeleteMapping("/users/{id}")
	public void delete(@PathParam("id") Long id) {
		userRepository.deleteById(id);
	}

}
