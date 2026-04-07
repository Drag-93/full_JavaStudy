package org.java.basic.arrayEx;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		while(true) {
			for(int i=0;i<100;i++) {
			int number=1;
			System.out.println("번호: "+number);
			System.out.println("국어 점수: ");
			int kor=input.nextInt();
			System.out.println("영어 점수: ");
			int eng=input.nextInt();
			System.out.println("수학 점수: ");
			int math=input.nextInt();
			System.out.println("과학 점수: ");
			int sci=input.nextInt();
			System.out.println("추가 입력 하시겠습니까(yes/no)");
			String more = input.next();
			if(more.equals("no")) {
				i=100;
			}				
			break;}
		}
	
		
	
	}
}
