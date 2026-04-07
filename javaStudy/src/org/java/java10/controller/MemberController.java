package org.java.java10.controller;

import java.util.Scanner;

import org.java.java10.service.MemberService;
import org.java.java10.service.impl.MemberInsertServiceImpl;

public class MemberController {

	public static void main(String[] args) {
		
		System.out.println("사용자 요청 정보 입니다.(*.mb 입력)");
		Scanner input = new Scanner(System.in);
		
		MemberService service;

		while (true) {
			System.out.print("요청 정보입력: ");
			String order = input.next();
			String rsOrder = order.substring(order.length() - 3);// 끝 3,요처URL
			System.out.println(order+" , "+rsOrder);
			if (rsOrder.equals(".mb")) {				
				String url = order.substring(0, order.length() - 3);
				// System.out.println(".mb 제외 -> "+url);
				if (url.equals("/insert")) {
					service=new MemberInsertServiceImpl();
					service.executeQueryService();
				
				} else if (url.equals("/update")) {
					System.out.println("회원수정");
				} else if (url.equals("/select")) {
					System.out.println("회원조회");
				} else if (url.equals("/delete")) {
					System.out.println("회원탈퇴");
				} else {
					System.out.println("URL입력오류-> 다시 입력 해주세요"); // 404(페이지 존재하지않는 예러)
				}
			} else if (order.equals("exit")) {
				System.out.println("서비스 종료");
				break;
			} else {
				System.out.println("다시 입력 해주세요");
			}

		}
		
		input.close();
		
	}
}