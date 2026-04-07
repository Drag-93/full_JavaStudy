package org.java.basic.oopEx;

public class CalculatorEx {

	//캡슐화
	private int num1;
	private int num2;
	private int sum;
	private double avg;
	private String op;

	//@NoArgsConstruct -> 기본생성자(매개변수없는)
	public CalculatorEx() {
		System.out.println("기본생성자");
	}
	public CalculatorEx(int num1, int num2,String op) {
		System.out.println("다른생성자");
		this.num1=num1;
		this.num2=num2;
		this.op=op;
	}
	//@AllArgsConstruct -> 모든 매개변수를 인자로 갖는 생성자(alt+shift+s -> Generate Constructor using Fields 하면 자동으로 나옴)
	public CalculatorEx(int num1, int num2, int sum, double avg, String op) {
//		super(); // 부모클래스의 기본생성자(생략가능)
		this.num1 = num1;
		this.num2 = num2;
		this.sum = sum;
		this.avg = avg;
		this.op = op;
	}

	// setters
	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public void setOp(String op) {
		this.op = op;
	}

	// getters
	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}

	public int getSum() {
		return sum;
	}

	public double getAvg() {
		return avg;
	}

	public String getOp() {
		return op;
	}

}
