package com.software.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.software.dao.impl.GetRecordDaoImpl;
import com.software.entity.AllRecord;
import com.software.service.IGetRecordService;

public class GetRecordServiceImpl implements IGetRecordService {

	@Override
	public List<AllRecord> getAllRecord() {
		List<AllRecord> list = null;
		GetRecordDaoImpl getRecordDaoImpl = new GetRecordDaoImpl();
		try {
			list = getRecordDaoImpl.getAllRecord();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}


	@Override
	public List<AllRecord> getRecordForUid(String UserName){
		List<AllRecord> list = null;
		GetRecordDaoImpl getRecordDaoImpl = new GetRecordDaoImpl();
		try {
			list = getRecordDaoImpl.getRecordForUid(UserName);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public List<AllRecord> getRecordForCid(String CarId){
		List<AllRecord> list = null;
		GetRecordDaoImpl getRecordDaoImpl = new GetRecordDaoImpl();
		try {
			list = getRecordDaoImpl.getRecordForCid(CarId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
}
