package org.java.basic.oopEx;

public class ConstructEx {

	private int num1;
	private int num2;
	private String op;
	
	//생성자
	public ConstructEx() {
		// TODO Auto-generated constructor stub
	}
	
	public ConstructEx(int num1) {
		//부모클래스의 기본생성자(쌍속관계에서 부모클래스->
		//클래스를 만들면 자동으로 Object(클래스)를 상속받는다
		//생략가능하다
		super();
		this.num1 = num1;
	}

	public ConstructEx(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public ConstructEx(int num1, int num2, String op) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.op = op;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	@Override
	public String toString() {
		return "ConstructEx [num1=" + num1 + ", num2=" + num2 + ", op=" + op + "]";
	} 

	
	
	
	
	
	
	
	
}
