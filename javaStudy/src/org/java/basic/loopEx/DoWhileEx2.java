package org.java.basic.loopEx;

import java.util.Scanner;

public class DoWhileEx2 {
	public static void main(String[] args) {
		System.out.println("do~while");
		//구구단
		
		int i=2;
		do {
			System.out.println(i+"단");
			int j=1;
			do {
				System.out.println(i+"*"+j+"="+(i*j));	
				j++;
			}while(j<10);

			i++;
		}while(i<10);
		
		System.out.println();
		
		//시작단과 끝단을 입력, 시작단부터 끝단까지 출력
		//시작단<=끝단, 2~9(정수) <- 조건
		//do~while , if, Scanner 이용
		
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("구구단");
						
			System.out.print("시작단: ");
			int start=input.nextInt();
			System.out.print("끝단: ");
			int end=input.nextInt();
			
			do {
				System.out.println(start+"단");
				int j2=1;
				do {
					System.out.println(start+"*"+j2+"="+(start*j2));
					j2++;
				}while(j2<10);
				
				start++;
			}while(start<=end);
			
			if(start>9&&end>9&&start<2&&end<2&&start>end) {
				System.out.println("조건이 맞지 않습니다");
				break;
			}

		}while(true);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
