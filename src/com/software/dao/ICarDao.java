package com.software.dao;

import java.sql.SQLException;
import java.util.List;

import com.software.entity.Car;
import com.software.entity.RentalCar;

public interface ICarDao {
	public List<RentalCar> carInfo() throws SQLException;
	public List<RentalCar> carInfoD() throws SQLException;
	public List<RentalCar> carInfoA() throws SQLException;
	public List<RentalCar> AdminCarInfo() throws SQLException;
	public List<RentalCar> AdminCarInfoD() throws SQLException;
	public List<RentalCar> AdminCarInfoA() throws SQLException;
	public List<Car>  AllCarInfo() throws SQLException;
}
