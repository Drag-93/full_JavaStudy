package org.java.basic.conditionEx;

import java.util.Scanner;

public class Quzi7 {

	public static void main(String[] args) {
		System.out.println(" if~else");
		
		/*
		- 아이디, 비빌번호를 입력 받아서 DB에 저장 되어 있는
		 userId,userPw와 비교해서 일치 하면 " 즐거운 쇼핑되세요!!"
		 하나라도 일치 하지 않으면 " 로그인 정보가 오류입니다!, 다시 로그인해주세요"
		 내용을 콘솔에 출력 해보세요.1
		 if~else, Scanner
		 exit -> 종료 ,while문 이용
		// *** 실제 인증(Authentication),권한(Authorization) 관리는
		// Spring Security에서 관리 한다
		// DB(데이터베이스)의 저장된(등록된,회원가입된) 정보를 가져와서 비교
		*/
		
		// DB에 저장 되어 있는
		String userId="m111";
		String userPw="1111";
		
		Scanner input = new Scanner(System.in);	
		
		while(true) {
			System.out.println("로그인 실행 하시겠습니까?(no->종료) ");			
			String rs=input.next();
			
			if(rs.equals("no")) {
				System.out.println("로그인 실행 X");
				break;
			}
			System.out.print("아이디: ");
			String id = input.next();
			
			System.out.print("비빌번호: ");
			String pw = input.next();
			
			if (id.equals(userId) && pw.equals(userPw)) {
				System.out.println("즐거운 쇼핑되세요!! \n-> 쇼핑몰 페이지로 이동합니다 ");
				break;
			} else {				
				System.out.println("로그인 정보가 오류입니다!, 다시 로그인해주세요");
			}
			System.out.println();
		}
		input.close();

	}
		
}
