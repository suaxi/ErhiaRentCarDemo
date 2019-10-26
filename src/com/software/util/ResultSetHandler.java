package com.software.util;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * @author Kaizuka-Inaho
 *
 */

public interface ResultSetHandler {
	//处理结果集的方法
	public void handlerRs(ResultSet rs) throws SQLException;
}
