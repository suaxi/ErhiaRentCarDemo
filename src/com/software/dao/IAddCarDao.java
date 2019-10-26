package com.software.dao;

import java.sql.SQLException;

import com.software.entity.Car;

public interface IAddCarDao {
	public int AddCar(Car car) throws SQLException;
}
