package com.techlook.mks.dao;

import com.techlook.mks.model.User;

public interface UserDAO {

	public void addUser(User user);

	public User getUserById(int id);

}
