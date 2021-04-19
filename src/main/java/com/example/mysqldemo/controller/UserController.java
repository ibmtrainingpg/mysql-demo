package com.example.mysqldemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mysqldemo.entity.User;
import com.example.mysqldemo.service.IUserService;

@RestController
public class UserController {
	@Autowired
	private IUserService userService; //DI
	@PostMapping("user")
	int createUser(@RequestBody User user){
		return userService.save(user);
	}
	@GetMapping("user")
	List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	@GetMapping("user/{name}")
	List<User> getAllUsers(@PathVariable("name") String name){
		return userService.getUsersByName(name);
	}
	
	//delete
	@DeleteMapping("user/{id}")
	void getAllUsers(@PathVariable("id") int id){
		 userService.deleteUser(id);
	}
}
