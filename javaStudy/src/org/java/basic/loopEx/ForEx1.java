package org.java.basic.loopEx;

public class ForEx1 {
	public static void main(String[] args) {
		System.out.println("for");
		
		//1~10까지 출력
		//10은 "," 생기지 않게 if문, break이용 
		for(int i=0; i<10; i++) {
			if(i==9) {
				System.out.println(i+1);
				break;
			}else {
			System.out.print((i+1)+",");}
		}
		
		
		for(int i=1; i<=10;i++) {
			if(i<10) {
				System.out.print(i+",");
			}else {
				System.out.print(i);
				break;
			}
		}
		System.out.println();
		
		//1~100까지중에서 짝수를 출력  -> 2, 4, ,,,, 100
		for(int i=1; i<=100; i++) {
			if(i%2==0&&i!=100) {
				System.out.print(i+",");
			}else if(i==100) {
				System.out.println(i);
				break;
			}
		}
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				if(i==100) {
					System.out.print(i);
					break;
				}
				System.out.print(i+",");
			}
		}
		System.out.println();
		
		System.out.println("=====continue====");
		for (int i = 0; i<=100; i++) {
			System.out.println(i+"<<<i");
			if(i>9) {
				continue;
//				break;
			}
			//continue -> 위 조건에 맞는걸 수행 하고 이어서 아래 실행
			//break -> 아래 실행 안함
			System.out.println(i+", &&");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
