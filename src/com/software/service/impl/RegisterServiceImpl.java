package com.software.service.impl;

import java.sql.SQLException;

import com.software.dao.impl.UserRegisterDaoImpl;
import com.software.entity.User;
import com.software.service.IUserRegisterService;


public class RegisterServiceImpl implements IUserRegisterService {

	@Override
	public User register(User user) {	
		UserRegisterDaoImpl userRegisterDaoImpl = new UserRegisterDaoImpl(); 
		try {
			userRegisterDaoImpl.register(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
