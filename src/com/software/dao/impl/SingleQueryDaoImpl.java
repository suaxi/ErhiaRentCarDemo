package com.software.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.software.dao.ISingleQueryDao;
import com.software.entity.Car;
import com.software.entity.RentalCar;
import com.software.util.JDBCTemplate;
import com.software.util.PreperedStatmentSetter;
import com.software.util.ResultSetHandler;

public class SingleQueryDaoImpl extends JDBCTemplate implements ISingleQueryDao {

	@Override
	public List<RentalCar> SingleQueryId(String num) throws SQLException {
		List<RentalCar> list = new ArrayList<>();
		String sql = "select ca.id,ca.model,ca.t_comments,b.name,c.name,ca.rent,DECODE(USEABLE,'0','可租','1','不可租')\r\n" + 
				"\r\n"
				+ "from t_car ca,t_brand b,t_category c\r\n"
				+ "where (ca.brand_id=b.id) and (ca.category_id=c.id) and useable=0 and ca.id=?";
		query(sql, new PreperedStatmentSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, num);
			}
		}, new ResultSetHandler() {
			
			@Override
			public void handlerRs(ResultSet rs) throws SQLException {
				try {
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
				} catch (SQLException e) {
					e.printStackTrace();
				}	
			}
		});
		return list;
	}

	@Override
	public List<RentalCar> SingleQueryBrId(String num) throws SQLException {
		List<RentalCar> list = new ArrayList<>();
		String sql = "select ca.id,ca.model,ca.t_comments,b.name,c.name,ca.rent,DECODE(USEABLE,'0','可租','1','不可租')\r\n" 
				+ "from t_car ca,t_brand b,t_category c\r\n"
				+ "where (ca.brand_id=b.id) and (ca.category_id=c.id) and useable=0 and b.id=?";
		query(sql, new PreperedStatmentSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, num);
			}
		}, new ResultSetHandler() {
			
			@Override
			public void handlerRs(ResultSet rs) throws SQLException {
				try {
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
				} catch (SQLException e) {
					e.printStackTrace();
				}	
			}
		});
		return list;
	}
	
	@Override
	public List<RentalCar> SingleQueryCaId(String num) throws SQLException {
		List<RentalCar> list = new ArrayList<>();
		String sql = "select ca.id,ca.model,ca.t_comments,b.name,c.name,ca.rent,DECODE(USEABLE,'0','可租','1','不可租')\r\n"
				+ "from t_car ca,t_brand b,t_category c\r\n"
				+ "where (ca.brand_id=b.id) and (ca.category_id=c.id) and useable=0 and c.id=?";
		query(sql, new PreperedStatmentSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, num);
			}
		}, new ResultSetHandler() {
			
			@Override
			public void handlerRs(ResultSet rs) throws SQLException {
				try {
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
				} catch (SQLException e) {
					e.printStackTrace();
				}	
			}
		});
		return list;
	}
	
	@Override
	public List<RentalCar> AdSingleQueryCaId(String num) throws SQLException {
		List<RentalCar> list = new ArrayList<>();
		String sql = "select ca.id,ca.model,ca.t_comments,b.name,c.name,ca.rent,DECODE(USEABLE,'0','可租','1','不可租'),decode(STATUS,'0','上架','1','下架')\r\n"
				+ "from t_car ca,t_brand b,t_category c\r\n"
				+ "where (ca.brand_id=b.id) and (ca.category_id=c.id) and c.id=?";
		query(sql, new PreperedStatmentSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, num);
			}
		}, new ResultSetHandler() {
			
			@Override
			public void handlerRs(ResultSet rs) throws SQLException {
				try {
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
				} catch (SQLException e) {
					e.printStackTrace();
				}	
			}
		});
		return list;
	}
	
	@Override
	public List<RentalCar> AdSingleQueryBrId(String num) throws SQLException {
		List<RentalCar> list = new ArrayList<>();
		String sql = "select ca.id,ca.model,ca.t_comments,b.name,c.name,ca.rent,DECODE(USEABLE,'0','可租','1','不可租'),decode(STATUS,'0','上架','1','下架')\r\n"
				+ "from t_car ca,t_brand b,t_category c\r\n"
				+ "where (ca.brand_id=b.id) and (ca.category_id=c.id) and b.id=?";
		query(sql, new PreperedStatmentSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, num);
			}
		}, new ResultSetHandler() {
			
			@Override
			public void handlerRs(ResultSet rs) throws SQLException {
				try {
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
				} catch (SQLException e) {
					e.printStackTrace();
				}	
			}
		});
		return list;
	}
	
	
	public List<RentalCar> AdSingleQueryId(String num) throws SQLException {
		List<RentalCar> list = new ArrayList<>();
		String sql = "select ca.id,ca.model,ca.t_comments,b.name,c.name,ca.rent,DECODE(USEABLE,'0','可租','1','不可租'),decode(STATUS,'0','上架','1','下架')\r\n"
				+ "from t_car ca,t_brand b,t_category c\r\n"
				+ "where (ca.brand_id=b.id) and (ca.category_id=c.id) and ca.id=?";
		query(sql, new PreperedStatmentSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, num);
			}
		}, new ResultSetHandler() {
			
			@Override
			public void handlerRs(ResultSet rs) throws SQLException {
				try {
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
				} catch (SQLException e) {
					e.printStackTrace();
				}	
			}
		});
		return list;
	}
	
	@Override
	public List<Car> UserSingleQueryCar(String CarId) throws SQLException{
		List<Car> list = new ArrayList<>();
		String sql = "select * from t_car where useable=0 and id=?";
		query(sql, new PreperedStatmentSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, CarId);
				
			}
		}, new ResultSetHandler() {
			
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
					car.setUseable(rs.getString(10));
					list.add(car);
				}
				
			}
		});
		return list;
	}
}
