package com.software.dao;

import java.sql.SQLException;
import java.util.List;

import com.software.entity.AllRecord;

public interface IGetRecordDao {
public List<AllRecord> getAllRecord() throws SQLException;
public List<AllRecord> getRecordForUid(String UserName) throws SQLException;
public List<AllRecord> getRecordForCid(String CarId) throws SQLException;	
}
