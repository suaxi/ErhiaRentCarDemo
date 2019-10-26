package com.software.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.software.dao.ICheckDao;
import com.software.entity.User;
import com.software.util.JDBCTemplate;
import com.software.util.PreperedStatmentSetter;
import com.software.util.ResultSetHandler;

public class CheckDaoImpl extends JDBCTemplate implements ICheckDao {

	@Override
	public List<User> Check(String userName) throws SQLException {
		List<User> list = new ArrayList<>();
		String sql = "select * from t_user where username=?";
		query(sql, new PreperedStatmentSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, userName);
				
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
	public List<User> Checkid(String idNumber) throws SQLException {
		List<User> list = new ArrayList<>();
		String sql = "select * from t_user where id_number=?";
		query(sql, new PreperedStatmentSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, idNumber);
				
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
}
