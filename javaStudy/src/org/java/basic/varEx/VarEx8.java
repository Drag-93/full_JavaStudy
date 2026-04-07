package org.java.basic.varEx;

public class VarEx8 {

	public static void main(String[] args) {
		TeamPublic.round2();
		System.out.println(Math.round(11.11));		
		
		// final상수
		System.out.println(TeamPublic.PRJECTNAME);
		System.out.println("최대값-> " + TeamPublic.MAX_NUMBER);
		System.out.println("최소값-> " + TeamPublic.MIN_NUMBER);

		//객체참조변수 t1
		// 인스턴스화,객체화
		TeamPublic t1= new TeamPublic();
		t1.num1=100;
		
	}
}
