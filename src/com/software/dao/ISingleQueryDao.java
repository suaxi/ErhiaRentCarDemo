package com.software.dao;

import java.sql.SQLException;
import java.util.List;

import com.software.entity.Car;
import com.software.entity.RentalCar;

public interface ISingleQueryDao {
	public List<RentalCar> SingleQueryId(String num) throws SQLException;
	public List<RentalCar> SingleQueryBrId(String num) throws SQLException;
	public List<RentalCar> SingleQueryCaId(String num) throws SQLException;
	public List<Car> UserSingleQueryCar(String CarId) throws SQLException;
	public List<RentalCar> AdSingleQueryBrId(String num) throws SQLException;
	public List<RentalCar> AdSingleQueryCaId(String num) throws SQLException;
	public List<RentalCar> AdSingleQueryId(String num) throws SQLException;
}
