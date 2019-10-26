package com.software.dao;

import java.sql.SQLException;
import com.software.entity.User;

public interface IUserRegisterDao {
	public int register(User user) throws SQLException;
}
