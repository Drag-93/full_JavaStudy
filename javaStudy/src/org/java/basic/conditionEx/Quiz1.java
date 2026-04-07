package org.java.basic.conditionEx;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		System.out.println("if~else");
		
		String userId="m111";
		String userPw="1111";
		
		//아이디,비밀번호를 입력 받아서 DB에 저장 되어 있는 userId, userPw와 비교해서
		//일치하면 "즐거운 쇼핑되세요",
		//하나라도 일치 하지 않으면 "로그인 정보가 오류입니다. 다시 로그인해주세요"
		//콘솔에 출력
		//**실제인증(Authentication),권한(Authorization)관리는 Spring Security에서 관리 한다
		
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
		
		System.out.println("아이디 입력: ");
		String id = input.next();
		System.out.println("비밀번호 입력: ");
		String pw = input.next();
		if(id.equals("exit")||pw.equals("exit")) {
			System.out.println("로그인 실행 종료");
			break;
		}else if(!id.equals(userId)||!pw.equals(userPw)){
			System.out.println("로그인 정보가 오류입니다. 다시 로그인해주세요");
		}else{
			System.out.println("즐거운 쇼핑되세요\n -> 쇼핑몰 페이지로 이동합니다");
			break;
		}
		}
		input.close();
	}
}
