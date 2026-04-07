package org.java.basic.conditionEx;

import java.util.Scanner;

public class IfEx3 {
	public static void main(String[] args) {
		System.out.println("if-> 조건 2개 이상");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("국어점수: ");
		int kor = input.nextInt();
		
		System.out.println("영어점수: ");
		int eng = input.nextInt();
		
		System.out.println("수학점수: ");
		int math = input.nextInt();
		
		int sum=kor+eng+math;
		double avg=sum/3.0;
		
		//학점 계산
		//학점 계산 A(90이상), B(80이상), C(70이상), D(60이상), F(60미만)
		//if else if
		String grade = "";
		if(avg>=90) {
			grade="A";
		}else if(avg>=80) {
			grade="B";
		}else if(avg>=70) {
			grade="C";
		}else if(avg>=60) {
			grade="D";
		}else {
			grade="F";
		}
		System.out.println(grade);
		
		
		input.close();
	}
}
