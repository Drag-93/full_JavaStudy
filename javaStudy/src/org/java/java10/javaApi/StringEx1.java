package org.java.java10.javaApi;

public class StringEx1 {

	public static void main(String[] args) {
		System.out.println("String");
		// String 생성밥법
		// 1. new
		String str1 = new String("문자열1"); // heap
		String str2 = new String("문자열1"); // heap
		String str3 = new String("문자열1"); // heap
		// 2. 리터럴 "" -> String pool
		String str4 = "문자열1";
		String str5 = "문자열1";
		System.out.println("주소값 비교");
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str2 == str3);
		System.out.println(str1 == str4);
		System.out.println(str4 == str5);// String pool
		System.out.println("값만 비교");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
		System.out.println(str3.equals(str4));
		System.out.println();
		// 3. char[] -> char배열 -> String
		char[] arrCh = { 'j', 'a', 'v', 'a', '2', '0', '2', '6' };
		String strArrCh = new String(arrCh);
		System.out.println(strArrCh);
		// 4. Wrapper 정수-> String
		System.out.println(Integer.toString(1000));

		String intStr = Integer.toString(1000);
		System.out.println(intStr);

		// 5. ObjectMapper -> JSON-> Object -> 추후 스프링에서 적용(라이브러리: Jackson)

	}
}