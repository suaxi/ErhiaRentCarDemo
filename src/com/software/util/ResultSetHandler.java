package com.software.util;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * @author Kaizuka-Inaho
 *
 */

public interface ResultSetHandler {
	//���������ķ���
	public void handlerRs(ResultSet rs) throws SQLException;
}
