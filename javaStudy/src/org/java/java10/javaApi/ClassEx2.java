package org.java.java10.javaApi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//JDBC 드라이버 연동
class DBConnectEx {

	//java DB 연결 커넥터
	public static Connection getConnection() {

		Connection conn = null;
		// 오라클
		String driver = "oracle.jdbc.driver.OracleDriver"; // driver 클래스
		String url = "jdbc:oracle:thin:@localhost:1521/xe";// DB url
		String user = "system";// 계정
		String password = "1234";// 비빌번호

		try {
			// 1.드라이버 찾기
			Class.forName(driver);
			System.out.println("드라이버 OK!");
			// 2.DB연동
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB Success!");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 NO!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB Fail!");
			e.printStackTrace();
		}
		return conn;
	}
}

public class ClassEx2 {

	public static void main(String[] args) {
		System.out.println(" Class.forName ");
		DBConnectEx.getConnection();
		
	}
}