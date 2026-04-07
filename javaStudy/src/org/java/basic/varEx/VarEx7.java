package org.java.basic.varEx;

public class VarEx7 {

	public static void main(String[] args) {

		System.out.println("객체형(Object)변수=> String");
		// 객체형 변수는 객체의 주소값을 저장
		// 객체참조 변수
		String str1 = new String("문자열1");
		String str2 = new String("문자열1");

		System.out.println(str1 == str2);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str2.length());
		System.out.println(str1.equals(str2));

		System.out.println();

		String str3 = new String("문자열1");
		// 문자열1.equals(문자열2) ,두문자열의 값만 비교
		System.out.println(str3.equals("문자열1"));

		String str4 = "문자열1"; // 리터럴 -> 공유공간
		String str5 = "문자열1"; // 리터럴 -> 공유공간

		System.out.println(str4 == str5);// == 같으냐?
		System.out.println(str3 == str4);

		System.out.println("String값만 비교");
		// 로그인, 회원가입등에는 equals
		System.out.println(str3.equals(str4));
		System.out.println(str4.equals(str5));

		System.out.println();

		String userId = "m1";
		String userPw = "11";
		// userId가"m1"이면 콘솔에 "아이디가 일치합니다"

		if (userId.equals("m1")) {
			System.out.println("아이디가 일치합니다");
		}
		// userPw가"11"이면 콘솔에 "비빌번호가 일치합니다"

		if (userPw.equals("11")) {
			System.out.println("비빌번호가 일치합니다");

		}

		System.out.println();
		// userId가"m1"이고 userPw가"11"이면 콘솔에 "로그인성공"
		// 아니면 "로그인 실패"
		if (userId.equals("m1") && userPw.equals("11")) {
			System.out.println("로그인성공");
		} else {
			System.out.println("로그인실패");
		}

		System.out.println("객체접근 연산자");

		String userName = "m1";
		System.out.println(userName.length()); // 문자열의 길이
		System.out.println(userName.charAt(0)); // 문자열의 인덱스 조회
		System.out.println(userName.contains("m"));// 포함되어 있느냐?

	}
}
