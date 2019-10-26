package com.software.util;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 
 * @author Kaizuka-Inaho
 *
 */

public interface PreperedStatmentSetter {
	//处理占位符
	public void setValues(PreparedStatement pstmt) throws SQLException;
}
