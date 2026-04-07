package org.java.basic.arrayEx;

public class ArrayEx1 {
	public static void main(String[] args) {
			System.out.println("배열");
			
			//1. 배열생성
			System.out.println("배열선언과 초기화");
			int[] arrInt1=new int[5];
			//배열의 길이
			System.out.println(arrInt1.length);
			arrInt1[0]=10;
			arrInt1[1]=20;
			arrInt1[2]=30;
			arrInt1[3]=40;
			arrInt1[4]=50;
			
			System.out.println(arrInt1);
			System.out.println(arrInt1[0]);
			System.out.println(arrInt1[1]);
			System.out.println(arrInt1[2]);
			System.out.println(arrInt1[3]);
			System.out.println(arrInt1[4]);
						
			System.out.println("for문 이용");
			//for
			for(int i=0;i<arrInt1.length;i++) {
				arrInt1[i]=100*i+100;
				System.out.println(arrInt1[i]);
			}
			
			
			
			
			//2.배열생성
			System.out.println("배열선언과 초기화2");
			int[] arrInt2=new int[] {10,20,30,40,50};
			System.out.println(arrInt2[0]);
			System.out.println(arrInt2[1]);
			System.out.println(arrInt2[2]);
			System.out.println(arrInt2[3]);
			System.out.println(arrInt2[4]);
			
			System.out.println("for문 활용");
			for(int i=0;i<arrInt2.length;i++) {
				System.out.println(arrInt2[i]);
			}
			
			//3.배열생성
			System.out.println("배열선언과 초기화3");
			
			int[] arrInt3= {10,20,30,40,50};
			
			System.out.println("for문 활용");
			System.out.println(arrInt3.length);
			
			for(int i=0;i<arrInt3.length;i++) {
				System.out.println(arrInt3[i]);
			}
			
			
			
			
			
	}
}
