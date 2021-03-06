package com.example.mysqldemo.service;

import java.util.List;

import com.example.mysqldemo.entity.User;

public interface IUserService {
	int save(User user);

	List<User> getAllUsers();

	void deleteUser(int id);

	List<User> getUsersByName(String name);
}
