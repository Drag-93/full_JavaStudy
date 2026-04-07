package org.java.java10.javaApi;
class A2 { //일반클래스 , 타입을 미리결정
	int a;
	void m1(int a) {
		this.a = a;
	}
}
class A3 { //일반클래스 , 타입을 미리결정
	String a;
	void m2(String a) {
		this.a = a;
	}
}
//제네릭타입 클래스  -> 객체를 생성 할 때 타입을 결정 
//타입은 객체 -> 컬렉션프레임워크 객체 -> 제레릭타입
class G1<T> {
	T a;
	void m3(T a) {
		this.a = a;
	}
}
public class GenericEx {
	public static void main(String[] args) {
		// 객체를 생성할 때 타입을 결정
		G1<String> g1 = new G1<String>();
		g1.a="String";
		g1.equals("String");
		// 반드시 객체형 int -> Integer
		G1<Integer> g2= new G1<Integer>();
		g2.a=100;
		g2.m3(300);
		

		A2 a2 = new A2();
		a2.a = 10;
		a2.m1(100);

		A3 a3 = new A3();
		a3.a = "문자열";
		a3.m2("문자열");

	}
}
