package org.java.java10.javaApi;

public class ClassEx1 {

	public static void main(String[] args) {

		System.out.println("Class-> java.lang.Class");

		try {
			// 예외가 발생 할것 같은 코드
			Class.forName("org.java.java10.innerClass.InnerClassEx");
			System.out.println("클래스 Yes");
		} catch (ClassNotFoundException e) {
			// 예외가 발생 되면 처리 -> 정상실행
			System.out.println("클래스 No");
			e.printStackTrace();
		}

		System.out.println("정상실행");
	}
}