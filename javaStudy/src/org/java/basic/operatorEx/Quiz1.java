package org.java.basic.operatorEx;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Quiz 홀짝
		//정수를 2로 나누었을 때 0이면 짝수, 나머지 홀수 출력
		//단, 정수입력값은 반드시 1보다 커야한다.
		// - 0일경우 "0 입니다 -> 제약조건에 맞지않습니다"
		// - 음수일 경우"음수 입니다 -> 제약조건에 맞지않습니다"
			
		System.out.println("숫자를 입력해 주세요(정수)");
		int num=input.nextInt();
		
		if(num==0) {System.out.println("0 입니다 -> 제약조건에 맞지않습니다");}
		else if(num<0) {System.out.println("음수(-) 입니다 -> 제약조건에 맞지않습니다");}
		else if((num&2)==0) {System.out.println("짝수");}
		else {System.out.println("홀수");}
					
//		if(num>0) {
//			if(num%2==0) {
//				System.out.println("짝수");
//			}else {System.out.println("홀수");}
//		}else {
//			if(num==0) {
		//제약조건 -> constraint
//				System.out.println("0 입니다 -> 제약조건에 맞지않습니다");
//			}else {System.out.println("음수(-) 입니다 -> 제약조건에 맞지않습니다");}
//		}
		

	}
}
