package com.software.util;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 
 * @author Kaizuka-Inaho
 *
 */

public interface PreperedStatmentSetter {
	//����ռλ��
	public void setValues(PreparedStatement pstmt) throws SQLException;
}
