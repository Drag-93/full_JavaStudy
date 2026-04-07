package org.java.basic.oopEx;

public class ConstruceEx {

	private int num1;
	private int num2;
	private Operator operator;	// 다른객체
	
	public ConstruceEx() {
		System.out.println("기본생성자");
	}
	public ConstruceEx(int num1, int num2, Operator operator) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.operator = operator;
	}
	public Operator getOperator() {
		return operator;
	}
	public void setOperator(Operator operator) {
		this.operator = operator;
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
	
	
}
