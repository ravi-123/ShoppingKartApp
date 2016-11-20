package com.app.services;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.springframework.stereotype.Service;

import com.app.dao.HibernateDaoImpl;
import com.app.pojo.User;

@Service("UserService")
public class UserService {
	@Resource
	private HibernateDaoImpl dao;
	
	public User getUser(int id){
		Session sess = dao.getSession();
		User u =(User)sess.get(User.class, 1);
		sess.close();
		return u;
		
	}
	
	public Boolean addUser(User userToAdd){
		Session sess = dao.getSession();
		sess.beginTransaction();
		sess.save(userToAdd);
		sess.getTransaction().commit();
		sess.close();
		return true;
	}
}
