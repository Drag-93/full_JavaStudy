package org.java.basic.scannerEx;

import java.util.Scanner;

public class ScannerEx4 {

	public static void main(String[] args) {
		
		System.out.println("국어,영어,수학점수(정수)입력 후 평균을 계산");
		
		/*
		 국어,영어 , 수학 점수 입력
		 총점, 평균 구하고 평균은 소수 둘째자리까지 표시
		 평균이 90이상이면  A
		 평균이 80이상이면  B
		 평균이 70이상이면  C
		 평균이 60이상이면  D
		 평균이 60미만이면  F
		 를 콘솔에 출력하시오.
		 Scanner,if~else if  ~else 이용, 		  
		 */		
		Scanner input=new Scanner(System.in);

		System.out.print("국어점수: ");
		int kor = input.nextInt();

		System.out.print("영어점수: ");
		int eng = input.nextInt();

		System.out.print("수학점수: ");
		int math = input.nextInt();

//		double avg = (kor + eng + math) /  3;// (int+int+int)/int
		double avg = (kor + eng + math) /  (double)3;// (int+int+int)/double-> double
										// 소수둘째자리까지 실수 -> String
		System.out.println("총점: " + (kor + eng + math));
		System.out.println("평균: " + String.format("%.2f", avg));

		if (avg >= 90) {
			System.out.println("A");
		} else if (avg >= 80) {
			System.out.println("B");
		} else if (avg >= 70) {
			System.out.println("C");
		} else if (avg >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		
		input.close();
		
		
	}
}
