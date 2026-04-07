package org.java.java12.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	// DB연동 객체
	public static Connection getConnection() {
		Connection conn = null;
		
		// Oracle
		String driver = "oracle.jdbc.driver.OracleDriver"; // driver 클래스
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String user = "system";
		String password = "1234";
		
		try {
			Class.forName(driver);
			System.out.println("드라이버 성공");
			
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB 성공");
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 실패");
			e.printStackTrace();
			
		} catch (SQLException e) {
			System.out.println("DB 실패");
			e.printStackTrace();
		}
		
		return conn;
		
	}

}
