package com.software.dao;

import java.sql.SQLException;
import java.util.List;

import com.software.entity.AllRecord;
import com.software.entity.Days;
import com.software.entity.Record;
import com.software.entity.User;

public interface ISaveRecordDao {
	public int SaveRecord(int User,String CarId) throws SQLException;
	public int SaveReturnRecord(String CarId) throws SQLException;
	public List<User> getUserIdForUserName(String UserName) throws SQLException;
	public List<Days> getTime(String CarId) throws SQLException;
	public int returnCarPayment(String CarId,double payment) throws SQLException;
}
