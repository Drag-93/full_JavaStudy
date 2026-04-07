package org.java.basic.operatorEx;

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		//성적관리 프로그램
		//국어(kor),영어(eng),수학(math) 점수를 입력받아서 총점(sum),평균(avg)를 계산하고,
		//평균이90이상이면 "A", 80이상이면 "B", 70이상이면"C", 60이상이면"D", 60미만이면 "F" 출력
		//단, 제약조건(contraint)-> 입력 점수는 정수 0~100까지 if문을 활용하여 만들어 볼 것
		//ex) 국어 80, 영어 70, 수학 60, 총점 210 , 평균 70 , -> C 출력
		
		Scanner input = new Scanner(System.in);
//		Boolean bool=true;
		while(true) {
		System.out.println("국어 점수: ");
		int kor = input.nextInt();
		System.out.println("영어 점수: ");
		int eng = input.nextInt();
		System.out.println("수학 점수: ");
		int math = input.nextInt();
		
		
		//입력 점수 유효성 검사
		//0<=kor<=100  ->   (0<=kor && kor<=100)
//		if(kor<0||kor>100||eng<0||eng>100||math<0||math>100) {
//			System.out.println("제약조건 위반 0~100까지의 정수만 입력해 주세요");
//			input.close();
//			return;
//		}
		
		
		if(kor>100||eng>100||math>100) {
			System.out.println("0~100까지의 정수만 입력해 주세요");
//			break;
		}else if(kor<0||eng<0||math<0){
			System.out.println("0~100까지의 정수만 입력해 주세요");
//			break;
		}else {
		
		int sum = kor+eng+math;
		
		double avg = sum/3.0;
				 
		String grade ="";
		if(avg>=90) {
			if(avg>=95) {
				grade="A+";
			}else {
				grade="A";}
		}else if(avg>=80) {
			if(avg>=85) {
				grade="B+";
			}else {
				grade="B";}
		}else if(avg>=70) {
			if(avg>=75) {
				grade="C+";
			}else {
				grade="C";}
		}else if(avg>=60) {
			if(avg>=65) {
				grade="D+";
			}else {
				grade="D";}
		}else {
			 grade="F";
		}
		System.out.println("국어: "+kor+" 영어: "+eng+" 수학: "+math+" 총점: "+sum+" 평균: "+String.format("%.1f", avg)+" 학점: "+grade);
		break;
		}
		}
//		if(avg>=90) {
//			String grade="A";
//			System.out.println("국어: "+kor+" 영어: "+eng+" 수학: "+math+" 총점: "+sum+" 평균: "+avg+" 학점: "+grade);
//		}else if(avg>=80) {
//			String grade="B";
//			System.out.println("국어: "+kor+" 영어: "+eng+" 수학: "+math+" 총점: "+sum+" 평균: "+avg+" 학점: "+grade);
//		}else if(avg>=70) {
//			String grade="C";
//			System.out.println("국어: "+kor+" 영어: "+eng+" 수학: "+math+" 총점: "+sum+" 평균: "+avg+" 학점: "+grade);
//		}else if(avg>=60) {
//			String grade="D";
//			System.out.println("국어: "+kor+" 영어: "+eng+" 수학: "+math+" 총점: "+sum+" 평균: "+avg+" 학점: "+grade);
//		}else {
//			String grade="F";
//			System.out.println("국어: "+kor+" 영어: "+eng+" 수학: "+math+" 총점: "+sum+" 평균: "+avg+" 학점: "+grade);
//		}

		
		
		
		
		input.close();
		
		
		
	}
}
