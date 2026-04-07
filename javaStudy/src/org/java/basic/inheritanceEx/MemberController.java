package org.java.basic.inheritanceEx;

import java.util.Scanner;

public class MemberController {

	public static void main(String[] args) {
		System.out.println("컨트롤러");

//		MemberService service=null;
		MemberService service;
		// 다형성을 이용해서 ~
		System.out.println("회원가입->서비스");

		Scanner input = new Scanner(System.in);
		System.out.println("쿼리문입력");

		String query = input.next();
		// if~else if을 사용
		// "insert"-> 회원가입
		// "update"-> 회원수정
		// "select"-> 회원저회
		// "delete"-> 회원탈퇴
		if (query.equals("insert")) {
			System.out.println("회원가입>서비스");;
			service = new MemberInsertImpl();
			service.excuteQueryService();
		} else if (query.equals("update")) {
			System.out.println("회원수정->서비스");
			service = new MemberUpdateImpl();
			service.excuteQueryService();
		} else if (query.equals("select")) {
			System.out.println("회원조회->서비스");
			service = new MemberSelectImpl();
			service.excuteQueryService();
		} else if (query.equals("delete")) {
			System.out.println("회원탈퇴>서비스");
			service = new MemberDeleteImpl();
			service.excuteQueryService();
		}else if (query.equals("exit")) {
			System.out.println("서비스 종료");
		}else {
			System.out.println("쿼리문 입력오류-> 다시 입력해주세요");
		}

	}
}