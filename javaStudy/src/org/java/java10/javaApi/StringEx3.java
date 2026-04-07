package org.java.java10.javaApi;

import java.util.Scanner;

public class StringEx3 {

	public static void main(String[] args) {
		
		// JAVA  -> Servlet + JSP +  WAS + Mysql(Oracle)    ->  Spring
		
		String query1="/insert.do";
		String query2="/list.do";
		String query3="/update.do";
		String query4="/memberDelete.do";
		
		// .do 제외한 나머지 문자열	 /insert 	 /list /update /memberDelete
		// substring(시작,끝) -> 시작번지부터 끝번지 앞까지 문자열 추출
		// 단. 하나의 식으로 작성
		System.out.println(query1.substring(0,7));
		System.out.println(query1.substring(0,query1.length()-3));
		
		System.out.println(query2.substring(0,5));
		System.out.println(query2.substring(0,query2.length()-3));
		
		System.out.println(query3.substring(0,7));
		System.out.println(query3.substring(0,query3.length()-3));

		System.out.println(query4.substring(0,13));
		System.out.println(query4.substring(0,query4.length()-3));
		
//				
	}
}