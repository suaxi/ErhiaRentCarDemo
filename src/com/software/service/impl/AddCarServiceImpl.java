package com.software.service.impl;

import java.sql.SQLException;

import com.software.dao.impl.AddCarDaoImpl;
import com.software.entity.Car;
import com.software.service.IAddCarService;

public class AddCarServiceImpl implements IAddCarService {

	@Override
	public Car addCar(Car car) {
		AddCarDaoImpl addCarDaoImpl = new AddCarDaoImpl();
		try {
			int rows = addCarDaoImpl.AddCar(car);
			if(rows>0) {
				System.out.println("Ìí¼Ó³É¹¦£¡");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
