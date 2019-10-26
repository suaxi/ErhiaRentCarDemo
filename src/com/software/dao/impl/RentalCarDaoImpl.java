package com.software.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.software.dao.IRentalCarDao;
import com.software.entity.RentalCar;
import com.software.util.JDBCTemplate;
import com.software.util.PreperedStatmentSetter;

public class RentalCarDaoImpl extends JDBCTemplate implements IRentalCarDao {
	//	×â³µ
	@Override
	public List<RentalCar> RentCar(String CarId) throws SQLException {
		List<RentalCar> list = new ArrayList<>();
		String sql = "UPDATE t_car SET useable=1 WHERE id=?";
		update(sql, new PreperedStatmentSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, CarId);
			}
		});
		return null;
	}
	
	//»¹³µ
	@Override
	public List<RentalCar> ReturnCar(String CarId) throws SQLException {
		List<RentalCar> list = new ArrayList<>();
		String sql = "UPDATE t_car SET useable=0 WHERE id=?";
		update(sql, new PreperedStatmentSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, CarId);
				
			}
		});
		return null;
	}
	
}

