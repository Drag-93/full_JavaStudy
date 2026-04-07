package org.java.basic.conditionEx;

public class IfEx1 {
	public static void main(String[] args) {
		System.out.println("if문");
		
		int i = 10;
		
		if(i>=10) {
			System.out.println("10보다 크거나 같다");
		}
		if(i>=10)System.out.println("10보다 크거나 같다");
		
		
		//이메일체크 
		//이메일 중복체크 -> 입력이메일이 DB저장 이메일과 일치하면 << 회원가입 불가
		String email="m1@email.com"; //DB저장 이메일
		
		System.out.println("회원가입");
		if(email.equals("m1@email.com")) {
			System.out.println("중복된 이메일입니다 다시 확인 후 입력해주세요");
		}
		
		if(!email.equals("m1@email.com")) {
			System.out.println("사용 가능한 이메일입니다");
		}
		
		//로그인
		
		System.out.println("로그인");
		String userPw="1111";
		String userEmail="m1@email.com";
		if(!userEmail.equals("m1@email.com")) {
			System.out.println("로그인 실패 이메일을 다시 확인해주세요");
		}
		if(userEmail.equals("m1@email.com")&&userPw.equals("1111")) {
			System.out.println("로그인 성공");
		}
		if(!userEmail.equals("m1@email.com")||!userPw.equals("1111")) {
			System.out.println("로그인 실패");
		}
	}
}
