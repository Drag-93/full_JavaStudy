package org.java.basic.oopEx;

public class ClassMethodeEx extends Object {
	// 필스
	public int num1;// 인스턴스맴버
	public int num2;// 인스턴스맴버
	public int sum;// 인스턴스맴버
	public double avg;// 인스턴스맴버
	public String op;// 인스턴스맴버

	// 생성자 -> 오버로딩
	public ClassMethodeEx() {
//		this(100,200,"+"); //다른생성자 호출
		System.out.println("기본생성자");
	}

	// 오버로딩 -> 매서드명이 같고 매개변수가 다른매서드
	public ClassMethodeEx(int num1, int num2, String op) {
//		this();// 기본생성자 호출
		System.out.println("다른생성자");
		this.num1 = num1;
		this.num2 = num2;
		this.op = op;
	}

	// return X -> void
	public void m1() {
		System.out.println("m1매서드");
//		return;
	}

	// 매서드 오버로딩 -> 매개인자 갯수
	public void m1(int i) {
		System.out.println("m1매서드 오버로딩 i-> " + i);
//		return;
	}

	// 매서드 오버로딩 -> 매개인자 갯수
	public void m1(int i, String str) {
		System.out.println("m1매서드 오버로딩 " + str + " " + i);
//		return;
	}

	// 매서드 오버로딩 -> 매개인자 타입
	public void m1(String i, int str) {
		System.out.println("m1매서드 오버로딩 " + str + " " + i);
//		return;
	}
	// 매서드오버로딩 허용 하지 않음
//	public void m1(String str,int i) {
//		System.out.println("m1매서드 오버로딩");
//	}	
	// 매서드 오버로딩 허용하지 않는다 -> return타입과 상관없다.
//	public int m1(String i,int str) {
//		System.out.println("m1매서드 오버로딩");
//		return 1;//
//	}
//	

	// return 값이 있으면
	// return int
	public int m12() {
		System.out.println("m12매서드");
		return 10;/// int형 return
	}

	// return String
	public String m13() {
		System.out.println("m13매서드");
		return "String";/// String형 return
	}

	// return String+매개인자 O
	public String m2(String op) {
		return op;
	}

	// return int+매개인자 2개
	public int m3(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

	// return 객체
	public MemberDto members() {
		return new MemberDto();
	}

	// return int
	public int m4(int num1, int num2, String op) {
		int rs = 0;
		if (op.equals("+")) {
//			return num1 + num2;
			rs = num1 + num2;
		} else if (op.equals("-")) {
//			return num1 - num2;
			rs = num1 - num2;
		} else if (op.equals("/")) {
//			return num1 / num2;
			rs = num1 / num2;
		} else if (op.equals("*")) {
//			return /um1 * num2;
			rs = num1 * num2;
		}
//		return 0;
		return rs;
	}

	// 클래스 맴버
	public static String staticMethod() {
//		num1=10; // static매서드는 static필드만 허용
		return "static 매서드";
	}

	// ToString(클래스의 정보)
	@Override // 상속을 통해서 부모의 매서드를 재정의 -> 다형셩
	public String toString() {
		return "ClassMethodeEx [num1=" + num1 + ", num2=" + num2 + ", sum=" + sum + ", avg=" + avg + ", op=" + op + "]";
	}

}
