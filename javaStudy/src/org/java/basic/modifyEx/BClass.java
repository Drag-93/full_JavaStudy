package org.java.basic.modifyEx;

public class BClass {
	//class BClass{
	public int b1; //public -> 모든 클래스에서 접근 가능
	int b2;
	private int year; //private->같은 클래스 내에서만 접근 가능
	protected int b3;
	
	//@NoArgsConstruct
	public BClass() {
		System.out.println("기본생성자");
	}
	//@AllArgsConstruct
	public BClass(int b1, int b2, int year, int b3) {
		super();
		this.b1 = b1;
		this.b2 = b2;
		this.year = year;
		this.b3 = b3;
	}
	
	//setters //getters
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
