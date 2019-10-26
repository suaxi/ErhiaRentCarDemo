package com.software.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.software.dao.impl.SaveRecordDaoImpl;
import com.software.entity.AllRecord;
import com.software.entity.Days;
import com.software.entity.Record;
import com.software.entity.User;
import com.software.service.ISaveRecordService;

public class SaveRecordServiceImpl implements ISaveRecordService {

	@Override
	public void SaveRecord(int UserId,String CarId) {
		SaveRecordDaoImpl saveRecordDaoImpl = new SaveRecordDaoImpl();
		try {
			int rows = saveRecordDaoImpl.SaveRecord(UserId, CarId);
			if(rows>0) {
				System.out.println("租车成功！");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return;
	}
	
	@Override
	public User getUserIdForUserName(String UserName) {
		SaveRecordDaoImpl saveRecordDaoImpl = new SaveRecordDaoImpl();
		
		try {
			List<User> userList = saveRecordDaoImpl.getUserIdForUserName(UserName);
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
	public void SaveReturnRecord(String CarId) {
		SaveRecordDaoImpl saveRecordDaoImpl = new SaveRecordDaoImpl();
		try {
			int rows = saveRecordDaoImpl.SaveReturnRecord(CarId);
			if(rows>0) {
				System.out.println("还车成功！");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public double getPayment(String CarId) {
		double payment=0;
		SaveRecordDaoImpl impl = new SaveRecordDaoImpl();
		List<Days> list;
		try {
			list = impl.getTime(CarId);
			for (Days day : list) {
				payment=Math.ceil(day.getDay())*day.getRent();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return payment;
	}
	
	public void returnCarPayment(String CarId,double payment) {
		SaveRecordDaoImpl saveRecordDaoImpl = new SaveRecordDaoImpl();
		try {
			int rows = saveRecordDaoImpl.returnCarPayment(CarId, payment);
			if(rows>0) {
				System.out.println("共需要支付："+payment);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
