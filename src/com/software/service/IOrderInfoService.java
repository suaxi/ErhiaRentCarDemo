package com.software.service;

import java.util.List;

import com.software.entity.RentalCar;

public interface IOrderInfoService {
	public List<RentalCar> OrderInfo(String CarId);
	public List<RentalCar>	 UserOrderInfo(int UserId);
	public List<RentalCar>	 UserAllOrderInfo(int UserId);

}
