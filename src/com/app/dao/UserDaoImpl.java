package com.app.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.app.pojo.User;

@Repository
public class UserDaoImpl {
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
