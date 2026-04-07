package org.java.java12.exception;

public class ExceptionEx2 {

	public static void main(String[] args) {
		System.out.println("Exception");
		
		int[] arrInt=new int[5]; //0~4번지
		
		try {
		for(int i=0; i<6; i++) { //5번지 없음 -> 예외 발생
			arrInt[i]=i+10;
			System.out.println(i+"-> "+arrInt[i]+" ");
		}
		System.out.println("예외발생 X");
		//배열, 인덱스 예외			
		}catch(ArrayIndexOutOfBoundsException e) {
			//예외 처리
			e.printStackTrace();
		}finally {
			System.out.println("기본실행");
		}
		
		System.out.println("정상 실행");
		
		
		
	}
}
