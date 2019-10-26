package com.software.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * @author Kaizuka-Inaho
 * ��˵��  ��װ��ɾ�Ĳ� 
 */
public class JDBCTemplate {
	
	/**
	 * ��װ�ĸ���ģ��
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
		//4.��ռλ����ֵ
		if(setter!=null) {
			setter.setValues(pstmt);
		}
		//5.ִ��
		int rows = pstmt.executeUpdate();
		//6.�ر���Դ
		DBUtils.close(conn, pstmt);
		return rows;	
	}
	
	/**
	 * ��װ�Ĳ�ѯģ��
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
		//4.��ռλ����ֵ
		if(setter!=null) {
			setter.setValues(pstmt);
			}
		//5ִ��
		ResultSet rs = pstmt.executeQuery();
		//������Ĵ���
		if(handler!=null) {
			handler.handlerRs(rs);
		}
		//6.�ر���Դ
		DBUtils.close(conn, pstmt, rs);
		
	}
}
