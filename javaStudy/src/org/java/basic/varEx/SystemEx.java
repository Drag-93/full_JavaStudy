package org.java.basic.varEx;

public class SystemEx {

	public static void main(String[] args) {
		
		System.out.println("print ->  출력매서드");
				
		//System.out.print(), 줄바꿈없음
		System.out.print(111);
		System.out.print(222);
		System.out.print("국어점수: ");
		
		//System.out.println(), 줄바꿈있음
		System.out.println();
		System.out.println(111);
		System.out.println(222);
		System.out.println("국어점수: ");
		
		System.out.println("prinf");
		int n1=10;
		int n2=3;		
		// System.out.printf("서식문자", 변수);
		/*
			서식		의미
			%d		정수
			%f		실수
			%.3f	소수점 3자리
			\n		줄바꿈
		*/
		System.out.printf("%d / %d=%.3f \n", n1, n2, (double)n1/n2);		
		System.out.println(n1+"/"+n2+"="+((double)n1/n2));
				
		double d = Math.round(((double) n1 / n2) * 1000) / 1000.0;
		// Math.round() -> 일의자리까지 반올림, 소수첫째자리에서 반올림 
		// Math.round(3.333333333333335*1000)// 소수첫째자리에서 반올림
		// Math.round(3333.333333333335) -> 3333
		// 3333/1000.0 -> 3.3333
		System.out.println(n1 + "/" + n2 + "=" + d); // 10/3=3.333
			
		// 결과 -> String(문자열)		
		String rs = String.format("%.3f", (double) n1 / n2); // "3.333" -> String
		System.out.println(rs);
				
		
	}
}
	