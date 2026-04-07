package org.java.basic.conditionEx;

public class IfEx2 {
	public static void main(String[] args) {
		System.out.println("if문 -> 조건 2");
		
		int i=10;
		if(i>=10) {
			System.out.println("10이상");
		}else { //나머지 ~
			System.out.println("10이상을 제외한 나머지");
		}
		
		if(i>=10) {
			System.out.println("10이상");
		}else if(i<10){
			System.out.println("10미만");
		}
		
	}
}
