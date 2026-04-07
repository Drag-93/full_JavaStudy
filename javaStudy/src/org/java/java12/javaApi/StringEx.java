package org.java.java12.javaApi;

public class StringEx {

	public static void main(String[] args) {
		System.out.println("===== String =====");
		// 1. immutable(불변)
		// 2. new , ""
		// 3. 웹개발 -> form(입력), 데이터 출력, 기본적인 문자열에 사용
		// 4. 대용량 문자열 데이터, Open API에서 제공 되어지는
		// 실시간 문자열 데이터 권장하지 않는다. -> StringBuffer, StringBuilder

		String str1 = new String("문자열1");
		String str2 = "문자열1"; // String pool -> 고유공간
		System.out.println(str1 == str2);
		System.out.println(str2.concat("<<< 추가"));
		System.out.println(str2);
		// 문자열 -> Wrapper
		String num1 = "100";
		// 박싱
		Integer i1 = Integer.parseInt(num1); // 숫자형의 문자열
		// String -> int
		int i2 = Integer.parseInt(num1);
		// int -> Integer -> String
		String i1Str = i1.toString();
		System.out.println(i1 + ", " + i2 + ", " + i1Str);

		String itemTitle = "상품A";
		String search = "상품";
		System.out.println(itemTitle.contains(search)); // Spring JPA
		System.out.println(itemTitle.concat(search));
		// 양수 -> 앞, 음수 -> 뒤, 같으면 -> 같은무자열
		System.out.println(itemTitle.compareTo(search)); // 사전순서 나중+
		System.out.println(search.compareTo(itemTitle)); // 사전순서 먼저-
		// 대소문자
		String str4 = "Abc";
		System.out.println(str4.toLowerCase());
		System.out.println(str4.toUpperCase());
		// 공백
		String str5 = " Abc ";
		System.out.println(str5);
		System.out.println(str5.length());
		System.out.println(str5.trim());
		System.out.println(str5.trim().length());

		System.out.println("substring -> 특정문자열 추출");
		String query1 = "insert.do";
		String query2 = "memberDelete.do";
		String query3 = "update.do";
		// insert.do, memberDelete.do, update.do
		// .do를 제외한 문자열 추출
		// 0 번지 부터 길이 -3 번지 앞 -> (전체길이-2번지)
		System.out.println(query1.substring(0, query1.length() - 3));
		System.out.println(query2.substring(0, query2.length() - 3));
		System.out.println(query3.substring(0, query3.length() - 3));

		System.out.println("========== StringBuffer ===========");

		StringBuffer sb = new StringBuffer("문자열1");
		// 원 문자열의 변경
		// 1. 문자열을 추가하거나 변경할 때 주로 사용하는 자료형
		// 2. 생성된 이후에도 문자열의 내용을 계쏙 수정 가능
		System.out.println(sb);
		sb.append("추가문자열");
		System.out.println(sb);
		sb.delete(0, 1);
		System.out.println(sb);
		sb.insert(0, "2025");
		System.out.println(sb);

		System.out.println("========= StringBuilder ==========");
		// 원 문자열의 변경
		StringBuilder sf = new StringBuilder("문자열1");
		// 1. StringBuffer 사용법은 동일
		// 2. 일반적인 데이터 처리, Open API, 예제
		System.out.println(sf);
		sf.append("추가문자열");
		System.out.println(sf);
		sf.delete(0, 1);
		System.out.println(sf);
		sf.insert(0, "2025");
		System.out.println(sf);

	}

}
