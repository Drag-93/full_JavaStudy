package org.java.basic.loopEx;

public class WhileEx2 {
	public static void main(String[] args) {
		System.out.println("while -> 구구단");
		
		//구구단 2단~9단
		
		int i = 2;
		
		while(i<=9) {
			System.out.println(i+"단");
			int j = 1;
		while(j<=9) {
			if(j==9) {
			System.out.print(i+"x"+j+"="+(i*j));
			}else {
				System.out.print(i+"x"+j+"="+(i*j)+",");
			}
			j++;
				
	}
		i++;
		System.out.println();
		}
	}
}