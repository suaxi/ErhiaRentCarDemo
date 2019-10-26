package com.software.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.management.Query;

import com.software.dao.IGetRecordDao;
import com.software.entity.AllRecord;
import com.software.entity.RentalCar;
import com.software.util.JDBCTemplate;
import com.software.util.PreperedStatmentSetter;
import com.software.util.ResultSetHandler;

public class GetRecordDaoImpl extends JDBCTemplate implements IGetRecordDao {

	@Override
	public List<AllRecord> getAllRecord() throws SQLException {
		List<AllRecord> list = new ArrayList<>();
		String sql = "select re.id,ca.id,ca.model,u.id,u.username,ca.rent,re.payment,ca.t_comments,b.name,c.name,re.start_date\r\n"
				+"from t_car ca,t_brand b,t_category c,T_RECORD re,t_user u\r\n"
				+"where (ca.brand_id=b.id) and (ca.category_id=c.id) and (re.user_id=u.id) and (re.car_id=ca.id)";
		query(sql, null, new ResultSetHandler() {

			@Override
			public void handlerRs(ResultSet rs) throws SQLException {
				while (rs.next()) {
					AllRecord record = new AllRecord();
					record.setId(rs.getInt(1));
					record.setCar_id(rs.getInt(2));
					record.setModel(rs.getString(3));
					record.setUser_id(rs.getInt(4));
					record.setUserName(rs.getString(5));
					record.setRent(rs.getInt(6));
					record.setPayment(rs.getDouble(7));
					record.setT_comments(rs.getString(8));
					record.setBrand_name(rs.getString(9));
					record.setCategory_name(rs.getString(10));
					record.setStart_date(rs.getTimestamp(11));
					list.add(record);
				}

			}
		});
		return list;
	}
	
	@Override
	public List<AllRecord> getRecordForUid(String UserName) throws SQLException {
		List<AllRecord> list = new ArrayList<>();
		String sql = "select re.id,ca.id,ca.model,u.id,u.username,ca.rent,re.payment,ca.t_comments,b.name,c.name,re.start_date\r\n"
				+"from t_car ca,t_brand b,t_category c,T_RECORD re,t_user u\r\n"
				+"where (ca.brand_id=b.id) and (ca.category_id=c.id) and (re.user_id=u.id) and (re.car_id=ca.id) and u.username=?";
		query(sql, new PreperedStatmentSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, UserName);
				
			}
		}, new ResultSetHandler() {

			@Override
			public void handlerRs(ResultSet rs) throws SQLException {
				while (rs.next()) {
					AllRecord record = new AllRecord();
					record.setId(rs.getInt(1));
					record.setCar_id(rs.getInt(2));
					record.setModel(rs.getString(3));
					record.setUser_id(rs.getInt(4));
					record.setUserName(rs.getString(5));
					record.setRent(rs.getInt(6));
					record.setPayment(rs.getDouble(7));
					record.setT_comments(rs.getString(8));
					record.setBrand_name(rs.getString(9));
					record.setCategory_name(rs.getString(10));
					record.setStart_date(rs.getTimestamp(11));
					list.add(record);
				}

			}
		});
		return list;
	}
	
	@Override
	public List<AllRecord>  getRecordForCid(String CarId) throws SQLException {
		List<AllRecord> list = new ArrayList<>();
		String sql = "select re.id,ca.id,ca.model,u.id,u.username,ca.rent,re.payment,ca.t_comments,b.name,c.name,re.start_date\r\n"
				+"from t_car ca,t_brand b,t_category c,T_RECORD re,t_user u\r\n"
				+"where (ca.brand_id=b.id) and (ca.category_id=c.id) and (re.user_id=u.id) and (re.car_id=ca.id) and ca.id=?";
		query(sql, new PreperedStatmentSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, CarId);
				
			}
		}, new ResultSetHandler() {

			@Override
			public void handlerRs(ResultSet rs) throws SQLException {
				while (rs.next()) {
					AllRecord record = new AllRecord();
					record.setId(rs.getInt(1));
					record.setCar_id(rs.getInt(2));
					record.setModel(rs.getString(3));
					record.setUser_id(rs.getInt(4));
					record.setUserName(rs.getString(5));
					record.setRent(rs.getInt(6));
					record.setPayment(rs.getDouble(7));
					record.setT_comments(rs.getString(8));
					record.setBrand_name(rs.getString(9));
					record.setCategory_name(rs.getString(10));
					record.setStart_date(rs.getTimestamp(11));
					list.add(record);
				}

			}
		});
		return list;
	}

}
