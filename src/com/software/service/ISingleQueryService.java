package com.software.service;

import java.util.List;

import com.software.entity.Car;
import com.software.entity.RentalCar;

public interface ISingleQueryService {

	public List<RentalCar> SingQueryId(String num);
	public List<RentalCar> SingQueryBrId(String num);
	public List<RentalCar> SingQueryCaId(String num);
	public List<RentalCar> AdSingQueryCaId(String num);
	public List<RentalCar> AdSingQueryBrId(String num);
	public List<RentalCar> AdSingQueryId(String num);
	public List<Car> UserSingleQueryCar(String CarId);
	
}
