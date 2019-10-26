package com.software.service;

import java.util.List;

import com.software.entity.Car;
import com.software.entity.RentalCar;

public interface ICarService {
/**
 * 
 * @param useable
 * @return
 */
	public List<RentalCar> carInfo();
	public List<RentalCar> carInfoA();
	public List<RentalCar> carInfoD();
	public List<RentalCar> AdminCarInfo();
	public List<RentalCar> AdminCarInfoD();
	public List<RentalCar> AdminCarInfoA();
	public List<Car> AllCarInfo();
}
