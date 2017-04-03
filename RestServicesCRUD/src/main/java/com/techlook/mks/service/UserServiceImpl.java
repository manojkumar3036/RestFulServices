package com.techlook.mks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlook.mks.dao.UserDAO;
import com.techlook.mks.model.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDAO userDAO;
	public void addUser(User user) {
		userDAO.addUser(user);
		
	}
	public User getUserById(int id) {
		return userDAO.getUserById(id);
	}
	public List<User> getAllUsers() {
		
		return userDAO.getAllUsers();
	}
	public User deleteUserById(int id) {
		return userDAO.deleteUserById(id);
		
	}
	

}
