package com.software.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.software.dao.impl.UserDaoImpl;
import com.software.entity.User;
import com.software.service.IUserService;

public class UserServiceImpl implements IUserService {

	@Override
	public User login(String userName, String passWord) {
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		try {
			//调用dao层的方法得到返回值
			List<User> userList = userDaoImpl.getUser(userName, passWord);
			//根据返回值判断是否登录成功
			if(userList.size()>0) {//集合中有元素
				User user = userList.get(0);
				return user;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public boolean Judge(String userName, String passWord) {
		boolean flag = false;
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		try {
			//调用dao层的方法得到返回值
			List<User> userList = userDaoImpl.getUser(userName, passWord);
			//根据返回值判断是否登录成功
			if(userList.size()>0) {//集合中有元素
				User user = userList.get(0);
				if(user.getType()==1) {
					flag = true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	
	//重置密码
		@Override
		public boolean resetPassword(String userName, String idNumber,String passWord) {
			boolean flag = false;
			UserDaoImpl userDaoImpl = new UserDaoImpl();
			//try {
				//调用dao层的方法得到返回值
				try {
					int rows = userDaoImpl.resetPassword(userName, idNumber,passWord);
					if(rows>0) {
						System.out.println("密码更改成功");
					}else{
						System.out.println("密码更改失败，请重试！");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			return flag;
		}
}
