package com.software.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.software.dao.IOrderInfoDao;
import com.software.entity.RentalCar;
import com.software.util.JDBCTemplate;
import com.software.util.PreperedStatmentSetter;
import com.software.util.ResultSetHandler;

public class OrderInfoDaoImpl extends JDBCTemplate implements IOrderInfoDao {

	@Override
	public List<RentalCar> OrderInfo(String CarId) throws SQLException {
		List<RentalCar> list = new ArrayList<>();
		String sql = "select ca.id,ca.model,ca.rent,ca.t_comments,b.name,c.name,SYSDATE\r\n"
				+ "from t_car ca,t_brand b,t_category c\r\n"
				+ "where (ca.brand_id=b.id) and (ca.category_id=c.id) and ca.id=?";
		query(sql, new PreperedStatmentSetter() {

			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, CarId);

			}
		}, new ResultSetHandler() {

			@Override
			public void handlerRs(ResultSet rs) throws SQLException {
				while (rs.next()) {
					RentalCar car = new RentalCar();
					car.setId(rs.getInt(1));
					car.setModel(rs.getString(2));
					car.setRent(rs.getInt(3));
					car.setT_comments(rs.getString(4));
					car.setBrand_name(rs.getString(5));
					car.setCategory_name(rs.getString(6));
					car.setStart_date(rs.getTimestamp(7));
					list.add(car);
				}

			}
		});
		return list;
	}
	
	@Override
	public List<RentalCar>	 UserOrderInfo(int UserId) throws SQLException {
		List<RentalCar> list = new ArrayList<>();
		String sql ="SELECT re.id,re.car_id,car.model,re.payment,car.t_comments,br.name,c.name,re.start_date,re.return_date\r\n"
				+"FROM t_car car,t_record re,t_brand br,t_category c\r\n"
				+"WHERE re.car_id = car.id and car.brand_id=br.id and car.category_id=c.id and re.user_id=? and car.useable=1";
		query(sql, new PreperedStatmentSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setInt(1, UserId);
				
			}
		}, new ResultSetHandler() {
			
			@Override
			public void handlerRs(ResultSet rs) throws SQLException {
				while (rs.next()) {
					RentalCar car = new RentalCar();
					car.setId(rs.getInt(1));
					car.setCar_id(rs.getInt(2));
					car.setModel(rs.getString(3));
					car.setPayment(rs.getDouble(4));
					car.setT_comments(rs.getString(5));
					car.setBrand_name(rs.getString(6));
					car.setCategory_name(rs.getString(7));
					car.setStart_date(rs.getTimestamp(8));
					car.setReturn_date(rs.getTimestamp(9));
					list.add(car);
				}
			}
		});
		return list;
	}
	
	
	@Override
	public List<RentalCar>	 UserAllOrderInfo(int UserId) throws SQLException {
		List<RentalCar> list = new ArrayList<>();
		String sql ="SELECT re.id,re.car_id,car.model,re.payment,car.t_comments,br.name,c.name,re.start_date,re.return_date\r\n"
				+"FROM t_car car,t_record re,t_brand br,t_category c\r\n"
				+"WHERE re.car_id = car.id and car.brand_id=br.id and car.category_id=c.id and re.user_id=? ";
		query(sql, new PreperedStatmentSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setInt(1, UserId);
				
			}
		}, new ResultSetHandler() {
			
			@Override
			public void handlerRs(ResultSet rs) throws SQLException {
				while (rs.next()) {
					RentalCar car = new RentalCar();
					car.setId(rs.getInt(1));
					car.setCar_id(rs.getInt(2));
					car.setModel(rs.getString(3));
					car.setPayment(rs.getDouble(4));
					car.setT_comments(rs.getString(5));
					car.setBrand_name(rs.getString(6));
					car.setCategory_name(rs.getString(7));
					car.setStart_date(rs.getTimestamp(8));
					car.setReturn_date(rs.getTimestamp(9));
					list.add(car);
				}
			}
		});
		return list;
	}
	
}
