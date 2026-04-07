package org.java.basic.oopEx;

public class ClassMethodEx {
	public int num1;
	public int num2;
	public int sum;
	public double avg;
	public String op;
	
	//생성자 -> 오버로딩
	public ClassMethodEx() {
//		this(100,200,"+");//다른생성자 호출
		System.out.println("기본생성자");
	}
	//오버로딩 -> 메서드명이 같고 매개변수가 다른 메서드
	public ClassMethodEx(int num1, int num2, String op) {
		this(); //기본생성자 호출->무조건 처번째 줄에서 호출 -> 둘 다 호출하면 오류남
		this.num1=num1;
		this.num1=num2;
		this.op=op;
	}
	
	//return X -> void
	public void m1() {
		System.out.println("m1메서드");
//		return; -> 리턴이 void ->없음 -> 생략 가능
	}
	
	//메서드 오버로딩 -> 매개인자 개수
	public void m1(int i) {
		System.out.println("m1메서드 오버로딩 i-> "+i);
//		return; -> 리턴이 void ->없음 -> 생략 가능
	}
	
	//메서드 오버로딩 -> 매개인자 개수
	public void m1(int i, String str) {
		System.out.println("m1메서드 오버로딩 i-> "+str+" "+i);
//		return; -> 리턴이 void ->없음 -> 생략 가능
	}
	
	//메서드 오버로딩 -> 매개인자 타입
	public void m1(String i, int str) {
		System.out.println("m1메서드 오버로딩 i-> "+str+" "+i);
//		return; -> 리턴이 void ->없음 -> 생략 가능
	}

	/*
	//메서드 오버로딩을 허용하지 않음
	//타입은 같고 이름만 다른경우
	public void m1(String str, int i) {
		System.out.println("m1메서드 오버로딩 i-> "+str+" "+i);
//		return; -> 리턴이 void ->없음 -> 생략 가능
	}
	//리턴값 타입 상관 없이 매개인자가 같으면 오버로딩 X
	public int m1(String i, int str) {
		System.out.println("m1메서드 오버로딩");
		return 1;
	}
	*/
	
	//return 값이 있으면
	//return int
	public int m12() {
		System.out.println("m12 메서드");
		return 10;// int형 return
	}
	//return String
	public String m13() {
		System.out.println("m12 메서드");
		return "String";// String형 return
	}
	//return String+매개인자 O
	public String m2(String op) {
		return op;
	}
	
	//return int+매개인자 2개
	public int m3(int num1,int num2) {
		int sum=num1+num2;
		return sum;
	}
	
	//return 객체
	public MemberDto members() {
		return new MemberDto();
	}
	
	//return int
	public int m4(int num1, int num2, String op) {
		int rs=0;
		if(op.equals("+")) {
//			return num1+num2;
			rs=num1+num2;
		}else if(op.equals("-")) {
//			return num1-num2;
			rs=num1-num2;
		}else if(op.equals("*")) {
//			return num1*num2;
			rs=num1*num2;
		}else if(op.equals("/")) {
//			return num1/num2;
			rs=num1/num2;
		}
//		return 0; //0이라도 꼭 써줘야함
		return rs;
	}
	
	//클래스 멤버
	public static String staticMethod() {
//		num1=10; // static메서드는 static필드만 허용
		return "static 메서드";
	}
	
	//ToString(클래스의 정보)
	@Override // 상속을 통해서 부모의 메서드를 재정의 -> 다형성
	public String toString() {
		return "ClassMethodEx [num1=" +num1+ ", num2=" + num2 +", sum="+ sum+", avg="+avg+", op="+op+"]";
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
