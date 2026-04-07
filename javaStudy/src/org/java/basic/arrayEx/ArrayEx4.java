package org.java.basic.arrayEx;

public class ArrayEx4 {
	public static void main(String[] args) {
		System.out.println("배열-> 다차원배열");
	
		int[][] arrInts=new int[3][4];
		
		System.out.println(arrInts);
		//행
		System.out.println(arrInts[0]);
		System.out.println(arrInts[1]);
		System.out.println(arrInts[2]);
		//길이
		System.out.println(arrInts.length);
		System.out.println(arrInts[0].length);
		//총 요소 개수
		System.out.println(arrInts.length*arrInts[0].length);
		//열
		System.out.println("0행");
		System.out.println(arrInts[0][0]);
		System.out.println(arrInts[0][1]);
		System.out.println(arrInts[0][2]);
		System.out.println(arrInts[0][3]);
		System.out.println("1행");
		System.out.println(arrInts[1][0]);
		System.out.println(arrInts[1][1]);
		System.out.println(arrInts[1][2]);
		System.out.println(arrInts[1][3]);
		System.out.println("2행");
		System.out.println(arrInts[2][0]);
		System.out.println(arrInts[2][1]);
		System.out.println(arrInts[2][2]);
		System.out.println(arrInts[2][3]);
		
		//1~12까지 초기화 하고 출력
		int num=1;
//		for(int i=0;i<arrInts.length;i++) {
//			for(int j=0;j<arrInts[i].length;j++) {
//				arrInts[i][j]=num;
//				num++;
//			}
//		}
		
		
		
		for(int i=0;i<arrInts.length;i++) {
			for(int j=0;j<arrInts[i].length;j++) {
				arrInts[i][j]=num;
				num++;
				System.out.print(arrInts[i][j]+" ");
			}
			System.out.println();
		}
	}
}
