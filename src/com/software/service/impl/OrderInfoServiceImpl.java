package com.software.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.software.entity.RentalCar;
import com.software.service.IOrderInfoService;

import com.software.dao.impl.OrderInfoDaoImpl;

public class OrderInfoServiceImpl implements IOrderInfoService {

	@Override
	public List<RentalCar> OrderInfo(String CarId) {
		OrderInfoDaoImpl orderInfoDaoImpl = new OrderInfoDaoImpl();
		List<RentalCar> list = null;
		 try {
			list = orderInfoDaoImpl.OrderInfo(CarId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public List<RentalCar>	 UserOrderInfo(int UserId){
		OrderInfoDaoImpl orderInfoDaoImpl = new OrderInfoDaoImpl();
		List<RentalCar> list = null;
		try {
			list = orderInfoDaoImpl.UserOrderInfo(UserId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public List<RentalCar>	 UserAllOrderInfo(int UserId){
		OrderInfoDaoImpl orderInfoDaoImpl = new OrderInfoDaoImpl();
		List<RentalCar> list = null;
		try {
			list = orderInfoDaoImpl.UserAllOrderInfo(UserId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
