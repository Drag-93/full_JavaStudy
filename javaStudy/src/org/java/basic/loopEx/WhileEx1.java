package org.java.basic.loopEx;

public class WhileEx1 {
	public static void main(String[] args) {
		
		System.out.println("while");
		
		int i=0;
		while(i<10) {
			if(i==9) {
				System.out.println(i+1);
				break;
			}
			System.out.println(i+1+",");
			i++;
		}
		
		
	}
}
