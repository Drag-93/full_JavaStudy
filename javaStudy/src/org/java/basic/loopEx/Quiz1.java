package org.java.basic.loopEx;

public class Quiz1 {
	public static void main(String[] args) {
		
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=11;i++){
			if(i <= 6) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			}else {
				for(int j=11;j>=i;j--) {
				System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		int starNum=0;
		for(int i = 1; i<=11;i++) {
			if(i<=6) {
				starNum++;
				
			}else {
				starNum--;
			}
			for(int j =1; j<=starNum; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
