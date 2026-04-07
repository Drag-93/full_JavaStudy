package org.java.basic.conditionEx;

//사용자 정의 타입 -> class
public class UserRole {
	
	//멤버 -> 필드 + 매서드, 생성자
	//필드
	public int num1; //인스턴스 멤버 -> 객체를 생성한 후에 접근가능 new
	public String name;
	public int age;
	//공용, 공유 클래스-> static 멤버
	// -> 객체생성(new)과 상관없이 클래스명.static멤버명으로 접근 가능
	public static final String ROLE_ADMIN = "ROLE_ADMIN"; //static 멤버
	public static final String ROLE_MANAGER = "ROLE_MANAGER"; //static 멤버
	public static final String ROLE_MEMBER = "ROLE_MEMBER"; //static 멤버
	
	//생성자 -> 객체생성에 도움을 주는 매서드
	//클래스와 이름이 똑같다.
	//return타입이 모두 void->생략
	
	public UserRole() {
		System.out.println("기본생성자");
	}
	
	// 매서드
	//인스턴스 매서드  
	//접근지정자 반환타입 매서드명(){}
	public void instanceMethod() {
		System.out.println("인스턴스 매서드");
//		return;
	}	
	public int sum() {
		return 100;
	}		
	//static매서드 ->  static 맴버 
	public static void staticMethod() {
		System.out.println("static매서드(클래스매서드)");
	}
	
		
	
}
