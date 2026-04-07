package org.java.basic.operatorEx;

public class OperatorEx2 {
	public static void main(String[] args) {
		System.out.println("비교 연산자(>,>=,<,<=,==,!=)");
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(num1>num2);
		System.out.println(num1>=num2);
		System.out.println(num1<num2);
		System.out.println(num1<=num2);
		System.out.println(num1==num2);
		System.out.println(num1!=num2);

		
		System.out.println("====String====");
		
		String s1= new String("문자열");
		String s2= new String("문자열");
		
		System.out.println("객체비교->같은지");
		System.out.println(s1==s2);
		
		System.out.println("값만 비교");
		System.out.println(s1.equals(s2));
		//반대
		System.out.println(!s1.equals(s2));
		
		System.out.println();
		String s3="문자열";
		String s4="문자열";
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		System.out.println();
		
		System.out.println("====조건문과 같이 사용====");
		if(s1.equals(s2)) {
			System.out.println("값이 일치한다");
		}else {
			System.out.println("값이 일치하지 않는다");
		}
		
	
		
		
		
		
	}
}
