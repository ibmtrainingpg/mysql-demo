package com.example.mysqldemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mysqldemo.entity.User;
import com.example.mysqldemo.service.IUserService;

@RestController
public class UserController {
	@Autowired
	private IUserService userService;
	@PostMapping("user")
	int createUser(@RequestBody User user){
		return userService.save(user);
	}
	@GetMapping("user")
	List<User> getAllUsers(){
		return userService.getAllUsers();
	}
}
