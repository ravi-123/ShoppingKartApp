package com.app.services;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.app.dao.UserDaoImpl;
import com.app.pojo.User;

@Service("UserService")
public class UserService {
	@Resource
	private UserDaoImpl dao;
	
	public User getUser(int id){
		return dao.getUser(id);
		
	}
	
	public Boolean addUser(User userToAdd){
		dao.addUser(userToAdd);
		return true;
	}
}
