package org.java.java12.exception;

import java.io.IOException;
import java.sql.SQLException;

interface In1{
	void ex0()throws SQLException, IOException;
	}
	
class A3 implements In1{
	@Override
	public void ex0() throws SQLException, IOException{
		System.out.println("예외오버라이딩");
		
	}	
	void ex() throws Exception{
	System.out.println("예외를 던진다~ throws Exception");
}

}
public class ExceptionEx5{
			//1. 메서드에 throws를 이용해서 처리
	//public static void main(String[] 정리하다니
		public static void main(String[] args) {
			System.out.println("예외 구현체에서 예외 처리");
			A3 a3=new A3();
			try {
				a3.ex();
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("고의로 예외를 발생 할 경우");
			//고의로 예외 발생
			try {
				throw new Exception();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
	}
	
}

	
	
	