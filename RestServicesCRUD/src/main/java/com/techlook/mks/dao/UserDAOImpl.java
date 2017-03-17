package com.techlook.mks.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlook.mks.model.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addUser(User user) {
		Session session=sessionFactory.openSession();
		session.save(user);
		session.flush();
		session.close();
		
		
	}

}
