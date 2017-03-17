package com.techlook.mks.service;

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
	

}
