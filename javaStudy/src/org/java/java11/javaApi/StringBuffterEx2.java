package org.java.java11.javaApi;

public class StringBuffterEx2 {

	public static void main(String[] args) {
		//대량의 데이터(문자열)를 get ->공공데이터등
		System.out.println("StringBuffter");
		
		System.out.println();
		StringBuffer sb1 = new StringBuffer("java");
		StringBuffer sb2 = new StringBuffer("Mysql");
		StringBuffer sb3 = new StringBuffer("java Project 2026");
		StringBuffer sb4 = new StringBuffer(" Spring boot JPA Security ");		
		
		// 삭제 -> 원문자열이 삭제
		System.out.println(sb3);
		System.out.println(sb3.delete(0, 5));// 0번지부터 5번지 -1 -> 4번지
		System.out.println(sb3);
		System.out.println();		
		
		// 추가 -> 원문자열이 추가(특정위치)
		System.out.println(sb3.insert(0, "JAVA "));// 0번지 부터 문자열 추가
		System.out.println(sb3);
		System.out.println();		

		// 역순-> 정렬
		System.out.println(sb3.reverse());/// 정령 역순 정력
		System.out.println(sb3);

		System.out.println();
		

		System.out.println("문자열 길이");
		System.out.println(sb1.length());
		System.out.println(sb2.length());
		System.out.println(sb3.length());
		System.out.println(sb4.length()); // 공란이 포함

		System.out.println();

		// 문자열 비교 -> 사전먼저 나오면 -,늦게 나오면 +, 동일 0
		System.out.println("b".compareTo("ba"));
		System.out.println();
		System.out.println(sb1.compareTo(sb2));
		System.out.println(sb1); // 0번지~ 4-1 번지
		System.out.println(sb1.replace(0, 4, "JAVA"));// java->JAVA
		// 원문자열의 변화
		System.out.println(sb1);
		System.out.println(sb1.toString().concat("추가"));//원문자열이 변경
		System.out.println(sb1);
		System.out.println();
		////////////////////////////////////////////
		System.out.println(sb1.substring(2));
		String str1 = sb1.substring(2);
		System.out.println(str1 + " << String");
		////////////////////////////////////////////
		System.out.println(sb1);
		System.out.println(sb1);
		
		System.out.println();		
				
		
		// OpenApi(공공데이터포털) -> JSON,XML
		StringBuffer responseBody = new StringBuffer();
		
		responseBody.append("[ \n");
		
		for (int i = 0; i < 5; i++) {
			responseBody.append("\t{'moveTitle': move" + i + "} \n");
		}
		responseBody.append("]");
		System.out.println(responseBody);
		
		System.out.println();
		
		String dbMovieData = responseBody.toString();
		System.out.println(dbMovieData);
		
		
		
	}
}
