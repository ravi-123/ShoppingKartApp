package com.app.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
	@Transactional
	public Boolean addUser(User userToAdd){
		Session sess = dao.getSession();
//		sess.beginTransaction();
		try {
			sess.saveOrUpdate(userToAdd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("in catch block");
			e.printStackTrace();
		}
//		sess.getTransaction().commit();
//		sess.close();
		return true;
	}
	
	
	
}
