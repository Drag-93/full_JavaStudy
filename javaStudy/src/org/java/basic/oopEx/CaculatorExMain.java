package org.java.basic.oopEx;

public class CaculatorExMain {

	public static void main(String[] args) {
		System.out.println("setters,getters");
		
		CaculatorEx cal1=new CaculatorEx();
		cal1.setNum1(100);
		cal1.setNum2(5);
		cal1.setSum(cal1.getNum1()+cal1.getNum2());
		cal1.setAvg(cal1.getSum()/2.0);
		
		System.out.println(cal1.getSum());
		System.out.println(cal1.getAvg());
		
		System.out.println();
		
		System.out.println("생성자를 통해서 private 맴버(필드)에 접근");
		
		CaculatorEx cal2= new CaculatorEx(500, 100, "-");
		cal2.setSum(cal2.getNum1()+cal2.getNum2());
		cal2.setAvg(cal2.getSum()/2.0);
	
		System.out.println(cal2.getSum());
		System.out.println(cal2.getAvg());
		System.out.println(cal2.getOp());
		System.out.println(cal2.getCaculator());
			
		
	} 
	
}
