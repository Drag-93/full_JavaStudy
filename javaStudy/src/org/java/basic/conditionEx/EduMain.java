package org.java.basic.conditionEx;

import java.util.Scanner;

public class EduMain {
	public static void main(String[] args) {
		System.out.println("Edu main");
		
		Edu edu1=new Edu(50,100,80);
		System.out.println("국어점수: "+edu1.kor);
		System.out.println("영어점수: "+edu1.eng);
		System.out.println("수학점수: "+edu1.math);
		
		String rs=edu1.gradeMethod();
		
		System.out.println(rs);
		
		System.out.println();
		
		Edu edu2=new Edu(100,100,80);
		System.out.println("국어점수: "+edu2.kor);
		System.out.println("영어점수: "+edu2.eng);
		System.out.println("수학점수: "+edu2.math);
		System.out.println(edu2.gradeMethod());
		
		System.out.println();
		
		Edu edu3=new Edu();
		edu3.kor=100;
		edu3.eng=100;
		edu3.math=100;
		String rs3=edu3.gradeMethod();
		System.out.println(rs3);
		
		System.out.println();
		
		//Scanner 이용
		Edu edu4=new Edu();
		
		Scanner input=new Scanner(System.in);
		
//		System.out.println("국어점수: ");
//		edu4.kor=input.nextInt();
//		System.out.println("영어점수: ");
//		edu4.eng=input.nextInt();
//		System.out.println("수학점수: ");
//		edu4.math=input.nextInt();
//		
//		String rs4=edu4.gradeMethod();
//		System.out.println("총점: "+edu4.sum+","+"평균: "+String.format("%.1f",edu4.avg)+"\n->"+rs4);
//		
		
		System.out.println();
		
		System.out.println("국어,영어,수학점수를 입력하시오");
		
		System.out.println("국어점수: ");
		int kor2=input.nextInt();
		System.out.println("영어점수: ");
		int eng2=input.nextInt();
		System.out.println("수학점수: ");
		int math2=input.nextInt();
		
		
		
		Edu edu5=new Edu(kor2,eng2,math2);
		String rs5=edu5.gradeMethod();
		
		System.out.println(rs5);
		
		
		
		
		
		
				input.close();
		
	}
}
