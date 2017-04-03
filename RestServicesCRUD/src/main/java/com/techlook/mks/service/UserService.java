package com.techlook.mks.service;

import java.util.List;

import com.techlook.mks.model.User;

public interface UserService {
	
	public void addUser(User user);
	
	public User getUserById(int id);
	
	public List<User> getAllUsers();

}
