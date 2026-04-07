package org.java.java11.javaApi;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		System.out.println("StringTokenizer");
		/*
			** 토큰 -> 구분기호(구분자 -,)를 통해서 분리된 문자열
			1. 하나의 문자열에서 여러 토큰(Token)을 생성
			2. 지정된 분리자(delimiters)를 사용
			3. 기본 분리자는 \t\n\r\f 으로 공백문자와 탭(\t)과 같은 4개의 제어문자
			4. 다른 분리자를 지정하고 싶다면 StringTokenizer의 생성자에서 2번째 인자에 기술
			기본적으로 분리자를 토큰에 속하지 않게 분리한다
			5. 분리자를 토큰에 포함시키려면 StringTokenizer의 생성자에서 3번째 인자를 true로 지정
		*/
		// 서버 -> http://localhost:8085
		String url = "http://localhost:8090/webProjectModel2_0320/insert.member?userEmail=m2%40email.com&userPw=1111&userName=m2&age=44";
		
		System.out.println();
		//문자열에서 특정문자의 인덱스
		System.out.println(url.indexOf('?'));
		int index=url.indexOf('?');
		System.out.println(index);
		System.out.println(url.substring(index+1));//인덱스는 0번지부터~
		System.out.println();		
			
		
//		String formData = "userEmail=m2%40email.com&userPw=1111&userName=m2&age=44";
		String formData = url.substring(index+1);
		System.out.println(formData);
		System.out.println();		
		System.out.println();		
		StringTokenizer token = new StringTokenizer(formData, "&");
		System.out.println(token);
		// userEmail=m1@email.com
		// userPw=1111
		// userName=m2
		// age=44		
		int size = token.countTokens(); // 토큰의 길이
		System.out.println(size);		
		// token이 존재 하면 -> while실행
		// 모든 token을 조회 ->		
		while (token.hasMoreTokens()) {
			// token요소를 하나씩 조회
			String tokenStr = token.nextToken();
			System.out.println(tokenStr);
		}		
		System.out.println();		
		System.out.println("ex2===> ");
		String phone = "010-1234-4568";
		// phone를 구분기호 "-" 제외한 나머지 token을
		// while문이용해서 콘솔에 출력
		StringTokenizer token2 = new StringTokenizer(phone, "-");

		while (token2.hasMoreTokens()) {
			String token2Str = token2.nextToken();
			System.out.println(token2Str);

		}
		
	}
}