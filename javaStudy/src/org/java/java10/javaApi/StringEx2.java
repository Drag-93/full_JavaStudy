package org.java.java10.javaApi;

import java.util.Scanner;

public class StringEx2 {

	public static void main(String[] args) {
		
		System.out.println("String");
		String s1 = "java";
		String s2 = "Mysql";
		String s3 = "java Project 2026";
		String s4 = " Spring boot JPA Security ";
		System.out.println("문자열 길이");
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		System.out.println(s4.length()); // 공란이 포함
		// 배열의 인텍스에 해당하는 문자
		System.out.println(s2.charAt(1));// 배열 -> 0번지
		System.out.println(s2.charAt(2));// 배열 -> 2번지
		System.out.println(s2.codePointAt(0));// 배열 -> 0번지

		System.out.println("문자열 비교 -> 사전");
		// 두 스트링이 같으면 0, 앞이면 음수, 아니면 양수 리턴
		System.out.println(s1.compareTo(s2));
		System.out.println("a".compareTo("b"));
		System.out.println("b".compareTo("a"));
		System.out.println("a".compareTo("a"));
		System.out.println("A".compareTo("a"));		
		// 두문자열을 합친다. ->원 문자열은 유지된다.
		System.out.println("=====concat=====");
		String s12 = s1.concat(s2);
		System.out.println(s1.concat(s2));
		System.out.println(s1);
		System.out.println(s12);
		System.out.println(s3);
		System.out.println();
		System.out.println("=====replace=====");
		//특정문자열을 변환 ->원 문자열은 유지된다.
		System.out.println(s3);//"java Project 2026";
		System.out.println(s3.replace("java", "Spring"));
		System.out.println(s3);
		String s32 = s3.replace("java", "Spring");
		System.out.println(s32);		
		System.out.println();		
		System.out.println("=====contains -> 포함되어 있느냐? 검색");
		String jpaStr="Spring boot JPA";
		System.out.println(jpaStr.contains("JPA"));
		System.out.println();
		System.out.println("=====split=====");
		//특정 기호롤 분리 -> 배열
		// "Spring boot JPA"
		System.out.println(jpaStr);
		System.out.println(jpaStr.split(" "));
		String[] jpaStrArr = jpaStr.split(" ");
		System.out.println(jpaStrArr);		
		System.out.println(jpaStrArr[0]);		
		System.out.println(jpaStrArr[1]);		
		System.out.println(jpaStrArr[2]);		
		System.out.println();		
//		// 확장형 for -> 객체형 반복문 -> 그룹화된객체를 조회 foreach, stream
//		// for 타입 변수 : 배열 객체
//		// 모든 배열의 요소를 조회
		for (String str : jpaStrArr) {
			System.out.print(str + " ");
		}
		System.out.println();
		for (int i = 0; i < jpaStrArr.length; i++) {
			System.out.print(jpaStrArr[i] + " ");
		}
		System.out.println();//		
		String phone="010-1234-5678";
		System.out.println(phone);		
		String[] arrPhone=phone.split("-");
		//배열의 모든 요소를 조회
		for(String el: arrPhone) {
			System.out.print(el+" ");
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		System.out.println("=====substring1=======");
		
		// String s4 = " Spring boot JPA Security ";//
		System.out.println(s4);
		System.out.println(s4.substring(0));// index~
		System.out.println("1");
		System.out.println(s4.substring(1));// index~
		System.out.println();
		System.out.println(s4.substring(13));// index~
		System.out.println();		
		String query="memberInsert.do";
		System.out.println(query.substring(12));
		System.out.println("memberInsert".length());		
		System.out.println(query.substring("memberInsert".length()));
				
		System.out.println();
		// "spring_first","spring_second"
		System.out.println("spring_first".substring(7));// first
		System.out.println("spring_second".substring(7));// second	
				
		System.out.println("=====substring2=======");
//		// subString(int 시작번지, 끝번지) : 문자열을 시작번지부터 끝번지 앞까지 추출
		System.out.println(s4); //" Spring boot JPA Security "
		System.out.println(s4.substring(0, 6)); // 0번지 부터 6번지 앞
		System.out.println(s4.substring(1, 7));// 1번지 부터 7번지 앞
		System.out.println(s4.substring(1, 12));// 1번지 부터 12번지 앞 
		System.out.println(s4);
		String s42 = s4.substring(1, 12);
		System.out.println(s42);
		
		System.out.println("======대.소문자,trim======");		
		// 소문자
		System.out.println(s4.toLowerCase());
		// 대문자
		System.out.println(s4.toUpperCase());
		// 공백제거 -> 문자열 좌/우 공백 제거
		System.out.println(s4);
		System.out.println(s4.length());
		System.out.println(s4.trim());
		System.out.println(s4.trim().length());

	}
}