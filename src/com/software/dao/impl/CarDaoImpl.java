package com.software.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.software.dao.ICarDao;
import com.software.entity.Car;
import com.software.entity.RentalCar;
import com.software.util.JDBCTemplate;
import com.software.util.ResultSetHandler;

public class CarDaoImpl extends JDBCTemplate implements ICarDao {
	@Override
	public List<RentalCar> carInfo() throws SQLException {
		List<RentalCar> list = new ArrayList<>();
		String sql = "select ca.id,ca.model,ca.t_comments,b.name,c.name,ca.rent,DECODE(USEABLE,'0','可租','1','不可租')\r\n" + 
				"\r\n"
				+ "from t_car ca,t_brand b,t_category c\r\n"
				+ "where (ca.brand_id=b.id) and (ca.category_id=c.id) and useable=0 order by ca.id";
		query(sql, null, new ResultSetHandler() {
			@Override
			public void handlerRs(ResultSet rs) throws SQLException {
				while (rs.next()) {
					RentalCar car = new RentalCar();
					car.setId(rs.getInt(1));
					car.setModel(rs.getString(2));
					car.setT_comments(rs.getString(3));
					car.setBrand_name(rs.getString(4));
					car.setCategory_name(rs.getString(5));
					car.setRent(rs.getInt(6));
					car.setUseable(rs.getString(7));
					list.add(car);
				}
			}
		});
		return list;

	}

	// 价格升序
	@Override
	public List<RentalCar> carInfoA() throws SQLException {
		List<RentalCar> list = new ArrayList<>();
		String sql = "select ca.id,ca.model,ca.t_comments,b.name,c.name,ca.rent,DECODE(USEABLE,'0','可租','1','不可租')\r\n" + 
				"\r\n"
				+ "from t_car ca,t_brand b,t_category c\r\n"
				+ "where (ca.brand_id=b.id) and (ca.category_id=c.id) and useable=0 order by ca.rent Asc";
		query(sql, null, new ResultSetHandler() {
			@Override
			public void handlerRs(ResultSet rs) throws SQLException {
				while (rs.next()) {
					RentalCar car = new RentalCar();
					car.setId(rs.getInt(1));
					car.setModel(rs.getString(2));
					car.setT_comments(rs.getString(3));
					car.setBrand_name(rs.getString(4));
					car.setCategory_name(rs.getString(5));
					car.setRent(rs.getInt(6));
					car.setUseable(rs.getString(7));
					list.add(car);
				}

			}
		});
		return list;

	}

	// 价格降序
	@Override
	public List<RentalCar> carInfoD() throws SQLException {
		List<RentalCar> list = new ArrayList<>();
		String sql = "select ca.id,ca.model,ca.t_comments,b.name,c.name,ca.rent,DECODE(USEABLE,'0','可租','1','不可租')\r\n" + 
				"\r\n"
				+ "from t_car ca,t_brand b,t_category c\r\n"
				+ "where (ca.brand_id=b.id) and (ca.category_id=c.id) and useable=0 order by ca.rent DESC";
		query(sql, null, new ResultSetHandler() {
			@Override
			public void handlerRs(ResultSet rs) throws SQLException {

				while (rs.next()) {
					RentalCar car = new RentalCar();
					car.setId(rs.getInt(1));
					car.setModel(rs.getString(2));
					car.setT_comments(rs.getString(3));
					car.setBrand_name(rs.getString(4));
					car.setCategory_name(rs.getString(5));
					car.setRent(rs.getInt(6));
					car.setUseable(rs.getString(7));
					list.add(car);
				}

			}
		});
		return list;

	}

	// 管理员查询
	@Override
	public List<RentalCar> AdminCarInfo() throws SQLException {
		List<RentalCar> list = new ArrayList<>();
		String sql = "select ca.id,ca.model,ca.t_comments,b.name,c.name,ca.rent,DECODE(USEABLE,'0','可租','1','不可租'),decode(STATUS,'0','上架','1','下架')\r\n"
				+ "from t_car ca,t_brand b,t_category c\r\n"
				+ "where (ca.brand_id=b.id) and (ca.category_id=c.id)  order by ca.id";
		query(sql, null, new ResultSetHandler() {
			@Override
			public void handlerRs(ResultSet rs) throws SQLException {
				while (rs.next()) {
					RentalCar car = new RentalCar();
					car.setId(rs.getInt(1));
					car.setModel(rs.getString(2));
					car.setT_comments(rs.getString(3));
					car.setBrand_name(rs.getString(4));
					car.setCategory_name(rs.getString(5));
					car.setRent(rs.getInt(6));
					car.setUseable(rs.getString(7));
					car.setStatus(rs.getString(8));
					list.add(car);
				}
			}
		});
		return list;

	}

	// 降序
	@Override
	public List<RentalCar> AdminCarInfoD() throws SQLException {
		List<RentalCar> list = new ArrayList<>();
		String sql = "select ca.id,ca.model,ca.t_comments,b.name,c.name,ca.rent,DECODE(USEABLE,'0','可租','1','不可租'),decode(STATUS,'0','上架','1','下架')\r\n"
				+ "from t_car ca,t_brand b,t_category c\r\n"
				+ "where (ca.brand_id=b.id) and (ca.category_id=c.id)  order by ca.price DESC";
		query(sql, null, new ResultSetHandler() {
			@Override
			public void handlerRs(ResultSet rs) throws SQLException {
				while (rs.next()) {
					RentalCar car = new RentalCar();
					car.setId(rs.getInt(1));
					car.setModel(rs.getString(2));
					car.setT_comments(rs.getString(3));
					car.setBrand_name(rs.getString(4));
					car.setCategory_name(rs.getString(5));
					car.setRent(rs.getInt(6));
					car.setUseable(rs.getString(7));
					car.setStatus(rs.getString(8));
					list.add(car);
				}

			}
		});
		return list;

	}

	// 升序
	@Override
	public List<RentalCar> AdminCarInfoA() throws SQLException {
		List<RentalCar> list = new ArrayList<>();
		String sql = "select ca.id,ca.model,ca.t_comments,b.name,c.name,ca.rent,DECODE(USEABLE,'0','可租','1','不可租'),decode(STATUS,'0','上架','1','下架')\r\n"
				+ "from t_car ca,t_brand b,t_category c\r\n"
				+ "where (ca.brand_id=b.id) and (ca.category_id=c.id)  order by ca.price ASC";
		query(sql, null, new ResultSetHandler() {
			@Override
			public void handlerRs(ResultSet rs) throws SQLException {
				while (rs.next()) {
					RentalCar car = new RentalCar();
					car.setId(rs.getInt(1));
					car.setModel(rs.getString(2));
					car.setT_comments(rs.getString(3));
					car.setBrand_name(rs.getString(4));
					car.setCategory_name(rs.getString(5));
					car.setRent(rs.getInt(6));
					car.setUseable(rs.getString(7));
					car.setStatus(rs.getString(8));
					list.add(car);
				}

			}
		});
		return list;

	}
	
	
	@Override
	public List<Car>  AllCarInfo() throws SQLException{
		List<Car> list = new ArrayList<>();
		String sql = "select * from t_car";
		query(sql, null, new ResultSetHandler() {
			
			@Override
			public void handlerRs(ResultSet rs) throws SQLException {
				while(rs.next()) {
					Car car = new Car();
					car.setId(rs.getInt(1));
					car.setCarNumber(rs.getString(2));
					car.setBrand_id(rs.getInt(3));
					car.setModel(rs.getString(4));
					car.setColor(rs.getString(5));
					car.setCategory_id(rs.getInt(6));
					car.setT_comments(rs.getString(7));
					car.setPrice(rs.getDouble(8));
					car.setRent(rs.getInt(9));
					car.setStatus(rs.getString(10));
					car.setUseable(rs.getString(11));
					list.add(car);
				}
				
			}
		});
		return list;
	}
}