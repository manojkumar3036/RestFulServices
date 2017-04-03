package com.techlook.mks.dao;

import java.util.List;

import com.techlook.mks.model.User;

public interface UserDAO {

	public void addUser(User user);

	public User getUserById(int id);

	public List<User> getAllUsers();
	
	public User deleteUserById(int id);

}
