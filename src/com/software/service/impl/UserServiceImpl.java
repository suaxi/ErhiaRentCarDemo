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
			//����dao��ķ����õ�����ֵ
			List<User> userList = userDaoImpl.getUser(userName, passWord);
			//���ݷ���ֵ�ж��Ƿ��¼�ɹ�
			if(userList.size()>0) {//��������Ԫ��
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
			//����dao��ķ����õ�����ֵ
			List<User> userList = userDaoImpl.getUser(userName, passWord);
			//���ݷ���ֵ�ж��Ƿ��¼�ɹ�
			if(userList.size()>0) {//��������Ԫ��
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
	
	
	//��������
		@Override
		public boolean resetPassword(String userName, String idNumber,String passWord) {
			boolean flag = false;
			UserDaoImpl userDaoImpl = new UserDaoImpl();
			//try {
				//����dao��ķ����õ�����ֵ
				try {
					int rows = userDaoImpl.resetPassword(userName, idNumber,passWord);
					if(rows>0) {
						System.out.println("������ĳɹ�");
					}else{
						System.out.println("�������ʧ�ܣ������ԣ�");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			return flag;
		}
}
