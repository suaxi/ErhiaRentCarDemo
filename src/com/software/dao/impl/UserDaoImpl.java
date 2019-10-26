package com.software.dao.impl;



/**
 * 
 * @author Kaizuka-Inaho
 *
 */

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.software.dao.IUserDao;
import com.software.entity.User;
import com.software.util.JDBCTemplate;
import com.software.util.PreperedStatmentSetter;
import com.software.util.ResultSetHandler;



public class UserDaoImpl extends JDBCTemplate implements IUserDao {

	@Override
	public List<User> getUser(String userName, String passWord) throws SQLException {
		List<User> list = new ArrayList<>();
		String sql = "select * from t_user where username=? and password=?";
		query(sql, new PreperedStatmentSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, userName);
				pstmt.setString(2, passWord);
				
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
	
	

	//÷ÿ÷√√‹¬Î
	@Override
	public int resetPassword(String userName, String idNumber,String passWord) throws SQLException {
		
		String sql = "update t_user set password=? where username=? and id_number=?";
		int rows = update(sql, new PreperedStatmentSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, passWord);
				pstmt.setString(2, userName);
				pstmt.setString(3, idNumber);
			}
		});
		return rows;
}
}
	

    
