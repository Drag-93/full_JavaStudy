package org.java.basic.loopEx;

import java.util.Scanner;

public class ForEx3 {
	public static void main(String[] args) {
		System.out.println("for, 다중 for");
		
		//구구단 2~9단까지 for이용해서
		
		for(int i =2; i<=9;i++) {
			System.out.println(i+"단");
			for(int j=1; j<=9; j++) {
				if(j==9) {
				System.out.print(i+"x"+j+"="+i*j);
				break;
				}else {
					System.out.print(i+"x"+j+"="+i*j+",");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i =9; i>=2;i--) {
			System.out.println(i+"단");
			for(int j=1; j<=9; j++) {
				if(j==9) {
				System.out.print(i+"x"+j+"="+i*j);
				break;
				}else {
					System.out.print(i+"x"+j+"="+i*j+",");
				}
			}
			System.out.println();
		}
		
		
		//시작단, 끝단을 입력받아서 -> 콘솔에 출력 
		//ex) 시작단4, 끝단 5 -> 4*1=4, 4*2=8 ,,, 5*9=45
		//반드시 시작단 <= 끝단
		//Scanner, for, if
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("시작단: ");
		int start = input.nextInt();
		System.out.println("끝단: ");
		int end = input.nextInt();
		
		if(start>=10||end>=10) {
			System.out.println("단 수는 9를 넘어갈 수 없습니다.");
		}else {		
		if(start<=end) {
			for(int i=start;i<=end;i++) {
				System.out.println(i+"단");
				for(int j=1;j<=9;j++) {
					if(j==9) {
						System.out.print(i+"x"+j+"="+(i*j));
						break;
					}
					System.out.print(i+"x"+j+"="+(i*j)+",");
				}
				System.out.println();
			}
		}else {
			System.out.println("끝단은 시작단 보다 큰 수여야 합니다.");
		}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
