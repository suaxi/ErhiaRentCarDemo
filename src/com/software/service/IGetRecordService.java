package com.software.service;

import java.util.List;

import com.software.entity.AllRecord;

public interface IGetRecordService {
public List<AllRecord> getAllRecord();
public List<AllRecord> getRecordForUid(String UserName);
public List<AllRecord> getRecordForCid(String CarId);

}
