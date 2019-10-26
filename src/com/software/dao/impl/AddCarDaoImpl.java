package com.software.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.software.dao.IAddCarDao;
import com.software.entity.Car;
import com.software.entity.User;
import com.software.util.JDBCTemplate;
import com.software.util.PreperedStatmentSetter;

public class AddCarDaoImpl extends JDBCTemplate implements IAddCarDao {

	@Override
	public int AddCar(Car car) throws SQLException {
		List<Car> list = new ArrayList<>();
		String sql = "INSERT INTO t_car VALUES(t_car_id_seq.NEXTVAL,?,?,?,?,?,?,?,?,?,?)";
		int rows = update(sql, new PreperedStatmentSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, car.getCarNumber());
				pstmt.setLong(2, car.getBrand_id());
				pstmt.setString(3, car.getModel());
				pstmt.setString(4, car.getColor());
				pstmt.setLong(5, car.getCategory_id());
				pstmt.setString(6, car.getT_comments());
				pstmt.setDouble(7, car.getPrice());
				pstmt.setInt(8, car.getRent());
				pstmt.setString(9, car.getStatus());
				pstmt.setString(10, car.getUseable());
			}
		});
		return rows;
	}
}
