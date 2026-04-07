package org.java.basic.operatorEx;

public class OperatorEx8 {
	public static void main(String[] args) {
		System.out.println("단항 연산자 -> 증감연산자");
		int i =10;
		System.out.println("선처리 후증가");
		System.out.println(i++);
		System.out.println(i);
		System.out.println("선증가 후처리");
		System.out.println(++i);
		System.out.println(i);
		System.out.println("선처리 후감소");
		System.out.println(i--);
		System.out.println(i);
		System.out.println("선감소 후처리");
		System.out.println(--i);
		System.out.println(i);
	
		System.out.println();
		// 1~10까지 콘솔에 출력 
		// for문 사용
		
		for(int num=1;num<=10;num++) {
			System.out.println(num);
		}
		System.out.println();
		
		
		//1~100 정수 중에서 5의 배수를 for,if문을 이용해서 콘솔에 출력
		
		for(int j=1;j<=100;j++) {
			if(j%5==0) {
				if(j!=100) {
				System.out.print(j+",");
			}else {
				System.out.print(j);
			}
		}
			
		}
		System.out.println();
		for(int j=1;j<=100;j++) {
			if(j%5==0) {
			String rs= j!=100? j+"," : j+"";
			System.out.print(rs);
		}
		}
		
		
		

	}
}
