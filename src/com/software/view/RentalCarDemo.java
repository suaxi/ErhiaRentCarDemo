package com.software.view;

import java.util.Scanner;

import com.software.entity.User;
import com.software.service.impl.RentalCarServiceImpl;
import com.software.service.impl.SaveRecordServiceImpl;
import com.software.service.impl.UserServiceImpl;

public class RentalCarDemo {
	
	//租车 更改type =>0 to 1
	public void RentCar(String CarId) {
		RentalCarServiceImpl rentalCarServiceImpl = new RentalCarServiceImpl();
		rentalCarServiceImpl.RentCar(CarId);
	}
	//还车 更改type=>1 to 0
	public void ReturnCar(String CarId) {
		RentalCarServiceImpl rentalCarServiceImpl = new RentalCarServiceImpl();
		rentalCarServiceImpl.ReturnCar(CarId);
	}
	
	public void SaveCarPayment(String CarId,double payment) {
		SaveRecordServiceImpl saveRecordServiceImpl = new SaveRecordServiceImpl();
		saveRecordServiceImpl.returnCarPayment(CarId, payment);
	}

	public double getPayment(String CarId) {
		SaveRecordServiceImpl saveRecordServiceImpl = new SaveRecordServiceImpl();
		double payment = saveRecordServiceImpl.getPayment(CarId);
		return payment;
	}
	
	public void  SaveReturnRecord(String CarId) {
		SaveRecordServiceImpl saveRecordServiceImpl = new SaveRecordServiceImpl();
		saveRecordServiceImpl.SaveReturnRecord(CarId);
	}
	
	public void SaveRecord(int UserId,String CarId) {
		SaveRecordServiceImpl saveRecordServiceImpl = new SaveRecordServiceImpl();
		saveRecordServiceImpl.SaveRecord(UserId, CarId);
	}
	
	public User getUserIdForUserName(String UserName) {
		SaveRecordServiceImpl saveRecordServiceImpl = new SaveRecordServiceImpl();
		 User user = saveRecordServiceImpl.getUserIdForUserName(UserName);
		return user;
	}
	
	public User getUserIdForUP(String userName,String passWord) {
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		User user = userServiceImpl.login(userName, passWord);
		return user;
	}
	
	
}
