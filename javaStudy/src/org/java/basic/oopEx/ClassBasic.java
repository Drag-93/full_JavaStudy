// 패키지 
package org.java.basic.oopEx;

//접근제한자(접근지정자) class 클래스명{
//modify
public class ClassBasic {

	// 맴버  -> 필드+매서드+생성자
	
	// 필드,속성, 프로퍼티
	public int num1; // 인스턴스맴버 new Heap
	public int num2; // 인스턴스맴버 new Heap
	public String name; // 인스턴스맴버 new Heap
	public static int staticNum; // 클래스맴버 클래스명.맴버 newX Method

	// static final -> 반드시 값을 초기화 -> 대문자로 작성, 한번만 초기화
	public static final int MAXNUM = 1000;// 클래스맴버 클래스명.맴버 newX Method

	// 생성자 -> 객체생성을 위한 특별한 매서드
	// 클래스명과 동일
	// 반환타입 void -> 생략
	// ** 객체의 타입을 결정 할 수 있다.
	// 생략이 가능 -> 자동으로 컴파일러가 기본생성자를 생성해 준다.
	//기본생성자
	public ClassBasic() {
		System.out.println("생성자(construct) -> 기본생성자");
	}
	//다른생성자 
	public ClassBasic(int num1,int num2, String name) {
		this.num1=num1;
		this.num2=num2;
		this.name=name;
	}

	// 매서드
	/*
	 * 선언부 Declaration 접근제한자 반환타입 매서드명(){ 
	 * // Implementation //구현부, 처리부,실행부(명령어)
	 * return;//반드시 -> return값을 반환하고 메모리에서 사라진다 }
	 */

	// 인스턴스 맴버 -> new Heap	
	// 선언부 Declaration
	public String instanceMethod() {
		//Implementation //구현부, 처리부,실행부(명령어)
		System.out.println("인스턴스 매서드");
		return "문자열";
	}

	// 클래스(static) 맴버 Method
	public static void classMathod() {
		System.out.println("클래스(static)매서드");
	}

}
