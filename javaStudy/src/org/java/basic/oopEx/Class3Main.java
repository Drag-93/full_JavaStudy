package org.java.basic.oopEx;

import java.time.LocalDateTime;

public class Class3Main {
	public static void main(String[] args) {
		System.out.println("클래스");
//		===============
		//set
		Class3 c3=new Class3();
		c3.setNum1(100);
		c3.setNum2(200);
		
//		private int[] arrInt;
//		int[] arrInt=new int[] {1,2,3,4,5};
//		c3.setArrInt(arrInt);
		c3.setArrInt(new int[] {1,2,3,4,5});
		
//		LocalDateTime.now() -> 현재 날짜+시간
		c3.setLocalDateTime(LocalDateTime.now());
		
//		private CalculatorEx calculatorEx;
//		CalculatorEx cal1=new CalculatorEx();
//		c3.setCalculatorEx(cal1);
		c3.setCalculatorEx(new CalculatorEx());
//		===============
		
//		===============
		//get
		System.out.println(c3.getNum1());
		System.out.println(c3.getNum2());
		System.out.println(c3.getArrInt());
		
		int[] arrInt2= c3.getArrInt();
		//foreach -> 모든배열의 요소를 조회
		for(int i: arrInt2) {
			if(i==arrInt2.length) {
				System.out.print(i);
			}else {
			System.out.print(i+",");}
			
		}
		
		System.out.println();
		
		//시간
		System.out.println(c3.getLocalDateTime());
		
		//클래스
		System.out.println(c3.getCalculatorEx());
		CalculatorEx cal2 = c3.getCalculatorEx();
		cal2.setNum1(100);
		cal2.setNum2(100);
		cal2.setOp("+");
		System.out.println(cal2.getSum());
		
		
		int[] arrInt3 = new int[] {1,2,3,4,5};
		
		for(int i=0;i<arrInt3.length;i++) {
			System.out.print(arrInt3[i]+" ");
		}
		System.out.println();
		
		for(int i: arrInt3) {
			System.out.print(i+" "); // 길이 상관없이 arrInt3 의 요소를 전부 나타냄(int배열)
		}
		System.out.println();
		
	}
}
