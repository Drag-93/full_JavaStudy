package org.java.basic.oopEx;

//public class CaculatorEx extends Object {
public class CaculatorEx {

	// 캡슐화
	private int num1;
	private int num2;
	private int sum;
	private double avg;
	private String op;

	// @NoArgsConstruct -> 기본생성자(매개변수없는)
	public CaculatorEx() {
		System.out.println("기본생성자");
	}

	public CaculatorEx(int num1, int num2, String op) {
		System.out.println("다른생성자");
		this.num1 = num1;
		this.num2 = num2;
		this.op = op;
	}

	// @AllArgsConstruct -> 모든 매개변수를 인자로 갖는 생성자
	public CaculatorEx(int num1, int num2, int sum, double avg, String op) {
//		super();// 부모클래스의 기본생성자
		this.num1 = num1;
		this.num2 = num2;
		this.sum = sum;
		this.avg = avg;
		this.op = op;
	}
	
	// setters, getters

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

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public String getCaculator() {
		
		String rs = "";
		
		sum = this.getSum();// 합계
		avg = sum / 2.0;
		
		if (op.equals("+")) {
//			rs=num1+"+"+num2+"="+(num1+num2);
			rs = num1 + "+" + num2 + "=" + sum;
		} else if (op.equals("-")) {
			rs = num1 + "-" + num2 + "=" + (num1 - num2);
		} else if (op.equals("*")) {
			rs = num1 + "*" + num2 + "=" + (num1 * num2);
		} else if (op.equals("/")) {
			rs = num1 + "/" + num2 + "=" + (num1 / num2);
		} else if (op.equals("평균")) {
			rs = num1 + ", " + num2 + ", 평균 -> " + avg;
		} else if (op.equals("exit")) {
			rs = "종료";
		} else {
			rs = "입력값 오류! 다시 입력하세요";
		}
		
		return rs;
	}
}
