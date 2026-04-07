package org.java.java12.exception;
import java.io.IOException;
import java.sql.SQLException;

interface In1 {
	void ex0() throws SQLException,IOException;
}

class A3 implements In1 {

	@Override
	public void ex0() throws IOException {
		System.out.println("예외 오버라이딩");
	}
	// 반드시 구현클래스에서 예외를 처리 해주어야 한다.
	void ex() throws Exception {
		System.out.println("예외를 던진다~ throws Exception");
	}
	
}

public class ExceptionEx5 {
							// 1. 메서드에 throws를 이용해서 처리 - 처리할게 많을땐 이런식으로하면 유리
//	public static void main(String[] args) throws Exception {
	public static void main(String[] args) {
		
		System.out.println("예외 구현체에서 예외처리");
		
		A3 a3 = new A3();
		
		// 2. 메서드에 try~catch를 이용해서 처리
		try {
			a3.ex();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("고의로 예외를 발행 할 경우1");
		// ** 고의로 예외를 발생 시킬 수 있다.
		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
