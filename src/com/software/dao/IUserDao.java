package com.software.dao;

import java.sql.SQLException;
import java.util.List;

import com.software.entity.User;

/**
 * 
 * @author Kaizuka-Inaho
 *
 */

public interface IUserDao {
	/**
	 * 通过用户名和密码查找用户信息
	 * @param userName
	 * @param passWord
	 * @return List<User>
	 */
	public List<User> getUser(String userName,String passWord) throws SQLException;
	public int resetPassword(String userName,String idNumber,String passWord) throws SQLException;
}
