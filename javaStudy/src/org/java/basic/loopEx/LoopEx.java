package org.java.basic.loopEx;

public class LoopEx {
	public static void main(String[] args) {
		System.out.println("반복문, 조건문");
		
		//for
		for(int i=2; i<10;i++) {
			System.out.println(i+"단");
			for(int j=1;j<10;j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
		
		System.out.println();
		//while -> 무한루프 조심
		int i2=2;
		while (i2<10) {
			System.out.println(i2+"단");
			int j2=1;
			while(j2<=9) {
			System.out.println(i2+"x"+j2+"="+(i2*j2));
			j2++;
				}
					
			i2++;}
					
		
		
	}
}
