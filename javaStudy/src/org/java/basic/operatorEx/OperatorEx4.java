package org.java.basic.operatorEx;

public class OperatorEx4 {
	public static void main(String[] args) {
		System.out.println("대입,복합대입연산자");
		
		
		int num=10;
		
		num+=10;
		System.out.println(num);
		num-=10;
		System.out.println(num);
		num*=10;
		System.out.println(num);
		num/=10;
		System.out.println(num);
		num%=10;
		System.out.println(num);

		//OpenApi -> 공공데이터포털 데이터 -> 문자열 JSON,XML
		//가져온 데이터(문자열)가공할 때 주로 사용
		String str="문자열";
		str +=str;
		System.out.println(str);
		
		
		
		
	}
}
