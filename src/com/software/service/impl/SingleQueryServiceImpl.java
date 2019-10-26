package com.software.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.software.dao.impl.SingleQueryDaoImpl;
import com.software.entity.Car;
import com.software.entity.RentalCar;
import com.software.service.ISingleQueryService;

public class SingleQueryServiceImpl implements ISingleQueryService {

	@Override
	public List<RentalCar> SingQueryId(String num) {
		SingleQueryDaoImpl singleQueryDaoImpl = new SingleQueryDaoImpl();
		List<RentalCar> list = null;
		try {
			list = singleQueryDaoImpl.SingleQueryId(num);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<RentalCar> SingQueryBrId(String num) {
	SingleQueryDaoImpl singleQueryDaoImpl = new SingleQueryDaoImpl();
	List<RentalCar> list = null;
	try {
		list = singleQueryDaoImpl.SingleQueryBrId(num);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	
	return list;
	}

	@Override
	public List<RentalCar> SingQueryCaId(String num) {
		SingleQueryDaoImpl singleQueryDaoImpl = new SingleQueryDaoImpl();
		List<RentalCar> list = null;
		try {
			list = singleQueryDaoImpl.SingleQueryCaId(num);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public List<RentalCar> AdSingQueryCaId(String num) {
		SingleQueryDaoImpl singleQueryDaoImpl = new SingleQueryDaoImpl();
		List<RentalCar> list = null;
		try {
			list = singleQueryDaoImpl.AdSingleQueryCaId(num);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public List<RentalCar> AdSingQueryBrId(String num) {
		SingleQueryDaoImpl singleQueryDaoImpl = new SingleQueryDaoImpl();
		List<RentalCar> list = null;
		try {
			list = singleQueryDaoImpl.AdSingleQueryBrId(num);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public List<RentalCar> AdSingQueryId(String num) {
		SingleQueryDaoImpl singleQueryDaoImpl = new SingleQueryDaoImpl();
		List<RentalCar> list = null;
		try {
			list = singleQueryDaoImpl.AdSingleQueryId(num);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public List<Car> UserSingleQueryCar(String CarId){
		List<Car> list = null;
		SingleQueryDaoImpl singleQueryDaoImpl = new SingleQueryDaoImpl();
		try {
			list = singleQueryDaoImpl.UserSingleQueryCar(CarId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
