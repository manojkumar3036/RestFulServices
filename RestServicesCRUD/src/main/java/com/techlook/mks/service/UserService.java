package com.techlook.mks.service;

import com.techlook.mks.model.User;

public interface UserService {
	
	public void addUser(User user);
	
	public User getUserById(int id);

}
