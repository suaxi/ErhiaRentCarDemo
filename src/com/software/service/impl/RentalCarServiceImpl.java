package com.software.service.impl;

import java.sql.SQLException;

import com.software.dao.impl.RentalCarDaoImpl;
import com.software.service.IRentalCarService;

public class RentalCarServiceImpl implements IRentalCarService {

	@Override
	public void RentCar(String CarId) {
		RentalCarDaoImpl rentalCarDaoImpl = new RentalCarDaoImpl();
		try {
			rentalCarDaoImpl.RentCar(CarId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void ReturnCar(String CarId) {
	RentalCarDaoImpl rentalCarDaoImpl = new RentalCarDaoImpl();
	try {
		rentalCarDaoImpl.ReturnCar(CarId);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
