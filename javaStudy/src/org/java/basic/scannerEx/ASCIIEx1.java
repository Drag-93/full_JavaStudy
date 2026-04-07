package org.java.basic.scannerEx;

public class ASCIIEx1 {
	public static void main(String[] args) {
		System.out.println("아스키코드");
		
		char ch1='A';
		System.out.println(ch1);
		System.out.println(ch1+32); //char+int -> int+int
//		char ch2=ch1+(char)32;//int(위에서 int로 변함) + char -> int + int
		char ch2=(char)(ch1+32);
		System.out.println(ch2);
		System.out.println();
		
		int i1 = 'A'; // 자동형변환, 작은형 -> 큰형 int =char -> int
		System.out.println(i1);
		System.out.println((char)i1);
		System.out.println(i1+32);
		System.out.println((char)(i1+32));
	
		System.out.println();
		
		//대문자 +32 -> 소문자
		System.out.println((char)('A'+32));
		System.out.println((char)('B'+32));
		System.out.println((char)('Z'+32));
		
		//소문자 -32 -> 대문자
		System.out.println((char)('a'-32));
		System.out.println((char)('b'-32));
		System.out.println((char)('z'-32));
		
		System.out.println();
		
		System.out.println("대문자 A부터 Z까지 콘솔에 출력 -> 소문자로 변환");
		//for문을 이용해서
		// A -> a, Z-> z
		
		for(int i =65; i<91;i++) {
			System.out.println((char)i+" -> "+(char)(i+32));}
		
		System.out.println();
		
		for(int j ='A'; j<'Z';j++) {
			System.out.println((char)j+" -> "+(char)(j+32));}
		
		
		System.out.println();
		
		System.out.println("소문자 a에서 z 까지 for문이용해서 출력");
		for(int i =97; i<123; i++) {
			System.out.println((char)i+" -> "+(char)(i-32));}
		
		
		System.out.println("소문자 z에서 a 까지 for문이용해서 출력");
		
		for(int i =122; i>96; i--) {
			System.out.println((char)i+" -> "+(char)(i-32));}
		
		
		
			
		
		
	}

}
