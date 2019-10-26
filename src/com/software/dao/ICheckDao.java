package com.software.dao;

import java.sql.SQLException;
import java.util.List;

import com.software.entity.User;

public interface ICheckDao {
	public List<User> Check(String userName) throws SQLException;
	public List<User> Checkid(String idNumber) throws SQLException;
}
