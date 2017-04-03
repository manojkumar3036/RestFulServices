package com.techlook.mks.dao;

import java.util.List;

import org.hibernate.Query;
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

	public User getUserById(int id) {
		Session session=sessionFactory.openSession();
		User user=(User) session.get(User.class, id);
		return user;
	}

	public List<User> getAllUsers() {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from User");
		List<User> users=query.list();
		return users;
	
	}

}
