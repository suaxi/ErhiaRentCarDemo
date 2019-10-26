package com.software.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * @author Kaizuka-Inaho
 * 类说明  封装增删改查 
 */
public class JDBCTemplate {
	
	/**
	 * 封装的更新模板
	 * @param sql
	 * @param setter
	 * @return
	 * @throws SQLException
	 */
	public int update(String sql,PreperedStatmentSetter setter) throws SQLException {
		//1,2
		Connection conn = ConnectionFactory.getConnection();
		//	3
		PreparedStatement pstmt = conn.prepareStatement(sql);
		//4.给占位符赋值
		if(setter!=null) {
			setter.setValues(pstmt);
		}
		//5.执行
		int rows = pstmt.executeUpdate();
		//6.关闭资源
		DBUtils.close(conn, pstmt);
		return rows;	
	}
	
	/**
	 * 封装的查询模板
	 * @param sql
	 * @param setter
	 * @param handler
	 * @throws SQLException
	 */
	public void query(String sql,PreperedStatmentSetter setter,
			ResultSetHandler handler) throws SQLException {
		//1,2
		Connection conn = ConnectionFactory.getConnection();
		//3
		PreparedStatement pstmt = conn.prepareStatement(sql);
		//4.给占位符赋值
		if(setter!=null) {
			setter.setValues(pstmt);
			}
		//5执行
		ResultSet rs = pstmt.executeQuery();
		//结果集的处理
		if(handler!=null) {
			handler.handlerRs(rs);
		}
		//6.关闭资源
		DBUtils.close(conn, pstmt, rs);
		
	}
}
