package com.techlook.mks.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User_Info")
public class User {
	/*
	 * 
	 * Adding attributes to the User
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String firstName;
	String lastName;
	String email;

	/*
	 * Generating getter and setter methods
	 * 
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
