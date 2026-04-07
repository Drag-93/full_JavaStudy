package org.java.basic.oopEx;

public class CalculatorExMain {

	public static void main(String[] args) {
		System.out.println("setters,getters");
		
		CalculatorEx cal1=new CalculatorEx();
		cal1.setNum1(100);
		cal1.setNum2(5);
		cal1.setSum(cal1.getNum1()+cal1.getNum2());
		cal1.setAvg(cal1.getSum()/2.0);
		
		System.out.println(cal1.getSum());
		System.out.println(cal1.getAvg());
		
		
		System.out.println("생성자를 통해서 private 멤버(필드)에 접근");
		
		CalculatorEx cal2= new CalculatorEx(500,100,"-");
		cal2.setSum(cal2.getNum1()+cal2.getNum2());
		cal2.setAvg(cal2.getSum()/2.0);
		
		System.out.println(cal2.getSum());
		System.out.println(cal2.getAvg());
		System.out.println(cal2.getOp());
		
		
		
		
		
		
	} 
	
}
