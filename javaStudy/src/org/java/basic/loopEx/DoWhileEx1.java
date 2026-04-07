package org.java.basic.loopEx;

public class DoWhileEx1 {
	public static void main(String[] args) {
		System.out.println("do~while 문");
		
		System.out.println("for -> 조건에 만족 못하면 한번도 실행 못할 수도 있다.");
		for(int i=0;i>10;i++) {
			System.out.println(i);
		}
				
		System.out.println("for -> 조건에 만족 못하면 한번도 실행 못할 수도 있다.");
		int j=0;
		while(j>10) {
			j++;
			System.out.println(j);
		}
		
		System.out.println("do~while -> 조건에 만족 못해도 한번은 실행.");
		int h=0;
		do {
			System.out.println(h);
			h++;
		}while(h>10);
	}
}
