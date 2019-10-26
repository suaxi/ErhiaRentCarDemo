package com.software.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.software.dao.impl.CarDaoImpl;
import com.software.entity.Car;
import com.software.entity.RentalCar;
import com.software.service.ICarService;

public class CarServiceImpl implements ICarService {
	CarDaoImpl carDaoImpl = new CarDaoImpl();
	List<RentalCar> list = null;

	@Override
	public List<RentalCar> carInfo() {
		try {
			list = carDaoImpl.carInfo();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	// 按照价格升序
	@Override
	public List<RentalCar> carInfoA() {
		try {
			list = carDaoImpl.carInfoA();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	// 按照价格降序
	@Override
	public List<RentalCar> carInfoD() {
		try {
			list = carDaoImpl.carInfoD();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<RentalCar> AdminCarInfo() {
		try {
			list = carDaoImpl.AdminCarInfo();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<RentalCar> AdminCarInfoD() {
		try {
			list = carDaoImpl.AdminCarInfoD();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<RentalCar> AdminCarInfoA() {
		try {
			list = carDaoImpl.AdminCarInfoA();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public List<Car> AllCarInfo(){
		List<Car> CarInfo = null;
		try {
			CarInfo = carDaoImpl.AllCarInfo();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CarInfo;
	}
}
