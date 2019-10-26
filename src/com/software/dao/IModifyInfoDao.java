package com.software.dao;

import java.sql.SQLException;


public interface IModifyInfoDao {
	public int ModifyCarNumber(String CarId,String CarNumber) throws SQLException;
	public int ModifyColor(String CarId,String Color) throws SQLException;
	public int ModifyBrandId(String CarId,int Brandid) throws SQLException;
	public int ModifyModel(String CarId,String Model) throws SQLException;
	public int ModifyCategoryId(String CarId,int CategoryId) throws SQLException;
	public int ModifyTComments(String CarId,String TComments) throws SQLException;
	public int ModifyPrice(String CarId,double Price) throws SQLException;
	public int ModifyRent(String CarId,double Rent) throws SQLException;
	public int ModifyStatus(String CarId,int Status) throws SQLException;
	public int ModifyUseable(String CarId,int Useable) throws SQLException;
}
