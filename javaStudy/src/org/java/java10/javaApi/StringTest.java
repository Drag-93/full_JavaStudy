package org.java.java10.javaApi;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		
		// Scanner이용해서 입력값이 ".do" 면 회원관리 실행(while)
		// 입력값이 "exit" -> 전제while문 종료
		// 입력값이 .do, exit이외의 값을 입력하면 -> 다시 입력 콘솔
		// ".do" 면 회원관리 실행
		// "/insert.do" 입력되면 /insert -> "회원가입" 콘솔
		// "/select.do" 입력되면 /select-> "회원조회" 콘솔
		// "/udpate.do" 입력되면 /udpate-> "회원수정" 콘솔
		// "/delete.do" 입력되면 /delete-> "회원탈퇴" 콘솔
		// "/fdsafda.do" 잘못 /fdsafd -> "다시 입력 해주세요"
		// "/exit.do" 입력되면 /exit-> 전체while문이 종료
		
		System.out.println("사용자 요청 정보 입니다.(/inset.do 입력)");
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.print("요청정보입력: ");
			String order = input.next();
			String rsOrder = order.substring(order.length() - 3);// 끝 3,요처URL
			// ".do" -> 회원, ".board"-> 게시판, ".sh" -> 상품, ".ad"-> 관리자			
			if (rsOrder.equals(".do")) {				
				String url = order.substring(0, order.length() - 3);
				// System.out.println(".do 제외 -> "+url);
				if (url.equals("/insert")) {
					System.out.println("회원가입");
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