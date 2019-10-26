package com.software.util;

/**
 * 
 * @author Kaizuka-Inaho
 * 类说明  利用这个类来获取连接对象
 */

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	private static String driver;
	private static String url;
	private static String username;
	private static String password;
	//静态代码块:在类被加载时执行,只会执行一次
	
	static {
		//1.创建一个Properties对象
		Properties prop = new Properties();		
		try {
			//加载properties文件的数据
			//利用Class对象的getResourceAsStream,可以返回同一个包
			//下资源的输入字节流
			prop.load(ConnectionFactory.class.getResourceAsStream("jdbcinfo.properties"));
			//获取键对应的值
			driver = prop.getProperty("driver");
			url = prop.getProperty("url");
			username = prop.getProperty("username");
			password = prop.getProperty("password");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//完成1,2两步,返回连接对象
	public static Connection getConnection() {
		Connection conn=null;
		/*try {
				//1.注册数据库驱动
				Class.forName("oracle.jdbc.driver.OracleDriver");			
				//2.与数据库建立连接
				conn = DriverManager.getConnection(
							"jdbc:oracle:thin:@localhost:1521:XE", 
							"easybuy",
							"123456");
				} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}*/
		
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
				
			
	}
}
