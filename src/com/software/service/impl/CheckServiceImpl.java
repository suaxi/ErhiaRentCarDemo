package com.software.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.software.dao.impl.CheckDaoImpl;
import com.software.entity.User;
import com.software.service.CheckService;

public class CheckServiceImpl implements CheckService {

	//ע���û�ʱ�����û������ѯ�û����Ƿ��Ѵ���
	@Override
	public boolean Check(String userName) {
		boolean flag = true;
		CheckDaoImpl checkDaoImpl = new CheckDaoImpl();
		try {
			List<User> list = checkDaoImpl.Check(userName);
			if(list.size()>0) {
				//�����������Ԫ�� ��������ݿ����Ѵ��ڸ��˻�
				flag=false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	
	@Override
	public boolean Checkid(String idNumber) {
		boolean flag1 = true;
		CheckDaoImpl checkDaoImpl = new CheckDaoImpl();
		try {
			List<User> list = checkDaoImpl.Checkid(idNumber);
			if(list.size()>0) {
				//�����������Ԫ�� ��������ݿ����Ѵ��ڸ����֤
				flag1=false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag1;
	}

}
