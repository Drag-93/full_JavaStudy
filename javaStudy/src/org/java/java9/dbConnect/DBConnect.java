package org.java.java9.dbConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnect {

		public static Connection getConnection() {
			//DB연동 객체
			Connection conn=null;
			
			String driver="oracle.jdbc.driver.OracleDriver";
			String url="jdbc:oracle:thin:@localhost:1521/xe"; //DB경로
			String user="system";//아이디
			String password="1234";//비밀번호
			
			try {
				//1. 드라이버찾기
				Class.forName(driver);
				System.out.println("Driver OK");
				//2. DB연동확인
				conn= DriverManager.getConnection(url, user, password);
				System.out.println("DB연동 success");
			}catch(ClassNotFoundException e) {
				//클래스가 없으면 예외 발생
				e.printStackTrace();
				System.out.println("Driver Fail");
			}catch(SQLException e) {
				//연결설정이 에러면 예외 발생
				e.printStackTrace();
				System.out.println("DB연동 Fail");
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			return conn;
		} 
}
