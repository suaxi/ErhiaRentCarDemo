package com.software.dao;

import java.sql.SQLException;
import java.util.List;

import com.software.entity.AllRecord;
import com.software.entity.RentalCar;

public interface IOrderInfoDao {
	public List<RentalCar> OrderInfo(String CarId) throws SQLException;
	public List<RentalCar>	 UserOrderInfo(int UserId) throws SQLException;
	public List<RentalCar>	 UserAllOrderInfo(int UserId) throws SQLException;
}
