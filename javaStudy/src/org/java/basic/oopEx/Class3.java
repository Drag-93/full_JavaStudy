package org.java.basic.oopEx;

import java.time.LocalDateTime;


public class Class3 {
	//인스턴스 멤버
	private int num1;
	private int num2;
	private int[] arrInt;// 배열
	private LocalDateTime dateTime;
	private CalculatorEx calculatorEx; // 다른 클래스
	
	//기본생성자
	public Class3() {
		System.out.println("기본생성자");
	}
	//모든매개인자를 갖는 생성자

	public Class3(int num1, int num2, int[] arrInt, LocalDateTime dateTime, CalculatorEx calculatorEx) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.arrInt = arrInt;
		this.dateTime = dateTime;
		this.calculatorEx = calculatorEx;
	}
	//setters,getters
	public int getNum1() {
		return num1;
	}
	public int getNum2() {
		return num2;
	}
	public int[] getArrInt() {
		return arrInt;
	}
	public LocalDateTime getLocalDateTime() {
		return dateTime;
	}
	public CalculatorEx getCalculatorEx() {
		return calculatorEx;
	}
	
	
	public void setNum1(int num1) {
		this.num1=num1;
	}
	public void setNum2(int num2) {
		this.num2=num2;
	}
	public void setArrInt(int[] arrInt) {
		this.arrInt=arrInt;
	}
	public void setLocalDateTime(LocalDateTime dateTime) {
		this.dateTime=dateTime;
	}
	public void setCalculatorEx(CalculatorEx calculatorEx) {
		this.calculatorEx=calculatorEx;
	}

	
	
	
}
