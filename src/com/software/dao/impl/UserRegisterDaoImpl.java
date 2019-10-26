package com.software.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.software.dao.IUserRegisterDao;
import com.software.entity.User;
import com.software.util.JDBCTemplate;
import com.software.util.PreperedStatmentSetter;

public class UserRegisterDaoImpl extends JDBCTemplate implements IUserRegisterDao {

	@Override
	public int register(User user) throws SQLException {
		List<User> list = new ArrayList<>();
		String sql = "INSERT INTO t_user VALUES(t_user_id_seq.NEXTVAL,?,?,?,?,?,?,0)";
		int rows = update(sql, new PreperedStatmentSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, user.getUsername());
				pstmt.setString(2, user.getPassword());
				pstmt.setInt(3, user.getSex());
				pstmt.setString(4, user.getIdnumber());
				pstmt.setString(5, user.getTel());
				pstmt.setString(6, user.getAddr());
			}
		});
		return rows;
	}

}
