package com.software.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.software.dao.IModifyInfoDao;
import com.software.util.JDBCTemplate;
import com.software.util.PreperedStatmentSetter;

public class ModifyInfoDaoImpl extends JDBCTemplate implements IModifyInfoDao {

	@Override
	public int ModifyCarNumber(String CarId, String CarNumber) throws SQLException {
		String sql = "UPDATE t_car set car_number=? where id=?";
		int rows = update(sql, new PreperedStatmentSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, CarNumber);
				pstmt.setString(2, CarId);
			}
		});
		return rows;
	}

	@Override
	public int ModifyColor(String CarId, String Color) throws SQLException {
		String sql="update t_car set color=? where id=?";
		int rows=update(sql, new PreperedStatmentSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, Color);
				pstmt.setString(2, CarId);	
				
			}
		});
		return rows;
	}

	@Override
	public int ModifyBrandId(String CarId, int BrandId) throws SQLException {
		String sql = "UPDATE t_car set Brand_id=? where id=?";
		int rows = update(sql, new PreperedStatmentSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setInt(1, BrandId);
				pstmt.setString(2, CarId);
			}
		});
		return rows;
	}
	
	@Override
	public int ModifyModel(String CarId,String Model) throws SQLException {
		String sql = "UPDATE t_car set model=? where id=?";
		int rows = update(sql, new PreperedStatmentSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, Model);
				pstmt.setString(2, CarId);
			}
		});
		return rows;
	}
	
	@Override
	public int ModifyCategoryId(String CarId,int CategoryId) throws SQLException {
		String sql = "UPDATE t_car set CATEGORY_ID where id=?";
		int rows = update(sql, new PreperedStatmentSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setInt(1, CategoryId);
				pstmt.setString(2, CarId);
			}
		});
		return rows;
	}
	@Override
	public int ModifyTComments(String CarId,String TComments) throws SQLException {
		String sql = "UPDATE t_car set T_COMMENTS=? where id=?";
		int rows = update(sql, new PreperedStatmentSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, TComments);
				pstmt.setString(2, CarId);
			}
		});
		return rows;
	}
	@Override
	public int ModifyPrice(String CarId,double Price) throws SQLException {
		String sql = "UPDATE t_car set PRICE=? where id=? and useable=0";
		int rows = update(sql, new PreperedStatmentSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setDouble(1, Price);
				pstmt.setString(2, CarId);
			}
		});
		return rows;
	}
	@Override
	public int ModifyRent(String CarId,double Rent) throws SQLException {
		String sql = "UPDATE t_car set RENT=? where id=?";
		int rows = update(sql, new PreperedStatmentSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setDouble(1, Rent);
				pstmt.setString(2, CarId);
			}
		});
		return rows;
	}
	@Override
	public int ModifyStatus(String CarId,int Status) throws SQLException {
		String sql = "UPDATE t_car set STATUS=? where id=?";
		int rows = update(sql, new PreperedStatmentSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setInt(1, Status);
				pstmt.setString(2, CarId);
			}
		});
		return rows;
	}
	
	@Override
	public int ModifyUseable(String CarId,int Useable) throws SQLException {
		String sql = "UPDATE t_car set USEABLE=? where id=?";
		int rows = update(sql, new PreperedStatmentSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setInt(1, Useable);
				pstmt.setString(2, CarId);
			}
		});
		return rows;
	}
}

