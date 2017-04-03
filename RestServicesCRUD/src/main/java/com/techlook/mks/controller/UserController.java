package com.techlook.mks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.techlook.mks.model.User;
import com.techlook.mks.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	public UserController() {
		System.out.println("Instantiating UserController!!");
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	// Client is sending the data in JSON format. This method has to convert
	// JSON to Java
	public @ResponseBody void addUser(@RequestBody User user) {
		userService.addUser(user);
	}

	@RequestMapping(value = "/user/getuser/{id}", method = RequestMethod.GET)
	public @ResponseBody User getSingleUser(@PathVariable("id") int id) {
		User user = userService.getUserById(id);
		return user;
	}

}
