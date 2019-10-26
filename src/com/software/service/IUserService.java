package com.software.service;

import com.software.entity.User;

public interface IUserService {
	/**
	 * 验证登录是否成功
	 * @param userName
	 * @param passWord
	 * @return 如果返回user不为空，则登陆成功，否则失败
	 */
	public User login(String userName,String passWord);
	public boolean Judge(String userName,String passWord);
	public boolean resetPassword(String userName,String idNumber,String passWord);
}
