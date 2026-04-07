package org.java.basic.modifyEx;

public class CClass {
	private int num1;	//같은 클래스
	int num2;			//같은 패키지(default)
	protected int num3;	//같은패키지(상속)
	public int num4;	//같은 프로젝트
	//기본생성자는 컴파일러가 자동 생성
	//다른생성자가 있을 경우 자동생성 해주지 않는다.
	public CClass() {
		System.out.println("기본생성자");
	}
	
	//private 필드
	public CClass(int num1) {
		super();
		this.num1 = num1;
	}

	private void m1() {
		System.out.println("m1");
	}
	
	
		public int getNum1() {
		  return num1;
	  }

	  public void setNum1(int num1) {
		  this.num1 = num1;
	  }
	
	
	
	
	
	
	
}
