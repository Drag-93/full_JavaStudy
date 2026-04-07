package org.java.java13.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	public static Connection getConnection() {
		Connection conn=null;
		
		//Oracle
		String driver = "oracle.jdbc.driver.OracleDriver";// 드라이버클래스
		String url = "jdbc:oracle:thin:@localhost:1521/xe";// 오라클DB
		String user = "system"; // 계정 아이디
		String password = "1234"; // 계정 비빌번호
		
		
		try {
			//1.Driver 찾기
			Class.forName(driver);
			System.out.println("Driver OK");
			//2.DB연동
			conn= DriverManager.getConnection(url, user, password);
			System.out.println("DB연동 Success");
		}catch(ClassNotFoundException e) {
			System.out.println("Driver Fail");
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("DB연동 Fail");
			e.printStackTrace();
		}
		System.out.println("정상실행");
		return conn;
		
		
	}
}
