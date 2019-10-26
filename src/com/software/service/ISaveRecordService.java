package com.software.service;

import java.sql.Timestamp;
import java.util.List;

import com.software.entity.AllRecord;
import com.software.entity.Days;
import com.software.entity.Record;
import com.software.entity.User;

public interface ISaveRecordService {
	public void SaveRecord(int UserId,String CarId);
	public User getUserIdForUserName(String UserName);
	public void SaveReturnRecord(String CarId);
	public double getPayment(String CarId);
	public void returnCarPayment(String CarId,double payment);
}