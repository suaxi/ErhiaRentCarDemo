package com.software.dao;

import java.sql.SQLException;
import java.util.List;

import com.software.entity.RentalCar;

public interface IRentalCarDao {
	public List<RentalCar> RentCar(String CarId) throws SQLException;
	public List<RentalCar> ReturnCar(String CarId) throws SQLException;
	}
