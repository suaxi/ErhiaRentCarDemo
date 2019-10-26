package com.software.util;

/**
 * 
 * @author Kaizuka-Inaho
 * ��˵��  �������������ȡ���Ӷ���
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
	//��̬�����:���౻����ʱִ��,ֻ��ִ��һ��
	
	static {
		//1.����һ��Properties����
		Properties prop = new Properties();		
		try {
			//����properties�ļ�������
			//����Class�����getResourceAsStream,���Է���ͬһ����
			//����Դ�������ֽ���
			prop.load(ConnectionFactory.class.getResourceAsStream("jdbcinfo.properties"));
			//��ȡ����Ӧ��ֵ
			driver = prop.getProperty("driver");
			url = prop.getProperty("url");
			username = prop.getProperty("username");
			password = prop.getProperty("password");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//���1,2����,�������Ӷ���
	public static Connection getConnection() {
		Connection conn=null;
		/*try {
				//1.ע�����ݿ�����
				Class.forName("oracle.jdbc.driver.OracleDriver");			
				//2.�����ݿ⽨������
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
