package org.java.utilEx;

public class MathEx {

	public static void main(String[] args) {
		System.out.println("==== Math(java.lang) ====");

		// 0 >= Math.random() < 1
		System.out.println(Math.random());
		// 비교 작은수
		System.out.println(Math.min(10, 20));
		// 비교 큰수
		System.out.println(Math.max(10, 20));
		// 절대값 -> 양수(음수 -> 양수변환)
		System.out.println(Math.abs(-500));
		// Paging -> 올림수(0을 제외하고 올림) 12
		System.out.println(Math.ceil(11.1));
		// Paging -> 내림수(0을 제외하고 내림) 12
		System.out.println(Math.floor(12.999));
		// 반올림 -> "~까지 반올림" -> 일의 자리까지~
		System.out.println(Math.round(12.999));
		System.out.println(Math.round(12.499));
		// 원주율 static final-> 3.14159265358979323846
		System.out.println(Math.PI);
				

	}
}
