package com.software.service;

import com.software.entity.User;

public interface IUserService {
	/**
	 * ��֤��¼�Ƿ�ɹ�
	 * @param userName
	 * @param passWord
	 * @return �������user��Ϊ�գ����½�ɹ�������ʧ��
	 */
	public User login(String userName,String passWord);
	public boolean Judge(String userName,String passWord);
	public boolean resetPassword(String userName,String idNumber,String passWord);
}
