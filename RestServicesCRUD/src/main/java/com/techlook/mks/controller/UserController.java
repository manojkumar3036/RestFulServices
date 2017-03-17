package com.techlook.mks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techlook.mks.model.User;
import com.techlook.mks.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	public UserController()
	{
		System.out.println("Instantiating UserController!!");
	}
	
	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	// Client is sending the data in JSON format. This method has to convert JSON to Java
	public void addUser(@RequestBody User user)
	{
		userService.addUser(user);
	}

}
