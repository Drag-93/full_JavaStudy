package org.java.basic.loopEx;

import java.util.Scanner;

public class ForEx2 {
	public static void main(String[] args) {
		System.out.println("for");
		//두 수를 입력받아서 -> 작은 수부터 큰 수까지 콘솔에 출력
		//두 수를 입력 받는다, 반드시 첫번째 숫자 <=두번째 숫자
		//Scanner, for, if
		//5 10
		for(int i=5; i<=10; i++) {
			System.out.print(i+" ");
		}
		System.err.println();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("숫자1 입력: ");
		int num1=input.nextInt();
		System.out.println("숫자2 입력: ");
		int num2=input.nextInt();
		
		if(num1>num2) {
			for(int i=num2; i<=num1; i++) {
				if(i==num1) {
					System.out.println(i);
					break;
				}
				System.out.print(i+",");}
		}else if(num2>num1){
			for(int i=num1; i<=num2; i++){
				if(i==num2) {
					System.out.println(i);
					break;
				}
				System.out.print(i+",");}
		}else if(num1 == num2) {
		System.out.println(num1 + "="+ num2);
			
		}
		
		
	}
}
