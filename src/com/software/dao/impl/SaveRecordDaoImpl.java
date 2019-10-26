package com.software.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.software.dao.ISaveRecordDao;
import com.software.entity.AllRecord;
import com.software.entity.Days;
import com.software.entity.Record;
import com.software.entity.User;
import com.software.util.JDBCTemplate;
import com.software.util.PreperedStatmentSetter;
import com.software.util.ResultSetHandler;

public class SaveRecordDaoImpl extends JDBCTemplate implements ISaveRecordDao {

	@Override
	public int SaveRecord(int UserId,String CarId) throws SQLException {
	String sql = "INSERT INTO t_record (id,user_id,car_id,START_DATE) values (t_record_id_seq.NEXTVAL,?,?,sysdate)";
	int rows = update(sql, new PreperedStatmentSetter() {
		
		@Override
		public void setValues(PreparedStatement pstmt) throws SQLException {
			pstmt.setInt(1, UserId);
			pstmt.setString(2, CarId);
			
		}
	});
	return rows;
	}
	
	@Override
	public  List<User> getUserIdForUserName(String UserName) throws SQLException {
		List<User> list = new ArrayList<>();
		String sql = "select * from t_user where username=?";
		query(sql, new PreperedStatmentSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, UserName);
			}
		}, new ResultSetHandler() {
			
			@Override
			public void handlerRs(ResultSet rs) throws SQLException {
				if(rs.next()) {
					User user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5),rs.getString(6), rs.getString(7),rs.getInt(8));
				list.add(user);
			}
		}
		});
		return list;
	}
	
	
	@Override
	public int SaveReturnRecord(String CarId) throws SQLException {
	String sql = "UPDATE T_RECORD SET RETURN_DATE=SYSDATE WHERE car_id=?";
		int rows = update(sql, new PreperedStatmentSetter() {
		
		@Override
		public void setValues(PreparedStatement pstmt) throws SQLException {
			pstmt.setString(1, CarId);
			
		}
	});
	return	rows;
	}
	
	@Override
	public int returnCarPayment(String CarId,double payment) throws SQLException {
		String sql="UPDATE T_RECORD\r\n" + 
				"SET PAYMENT=?\r\n" + 
				"WHERE Car_ID=?";
		int update = update(sql, new PreperedStatmentSetter() {
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setDouble(1,payment);
				pstmt.setString(2, CarId);
				
			}
		});
		return update;
		
	}
	
	@Override
	public List<Days> getTime(String CarId) throws SQLException {
		List<Days> list = new ArrayList<>();
		Days days = new Days();
		String sql="SELECT RETURN_DATE-START_DATE,c.RENT FROM T_RECORD t,T_CAR c WHERE CAR_ID=c.ID AND t.car_id=?";
		query(sql, new PreperedStatmentSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, CarId);
				
			}
		}, new ResultSetHandler() {
			
			@Override
			public void handlerRs(ResultSet rs) throws SQLException {				
				if (rs.next()) {
					days.setDay(rs.getDouble(1));
					days.setRent(rs.getDouble(2));
					list.add(days);
				}
				
			}
		});
		return list;
	}
	
}
