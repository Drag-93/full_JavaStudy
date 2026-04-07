package org.java.basic.operatorEx;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		System.out.println("비교연산자, 조건문");
		
		//아이디, 비밀번호를 입력 받아서 DB에 저장되어있는
		//아이디, 비밀번호가 일치하면 "로그인 성공, 즐거운 쇼핑되세요"
		//일치하지 않으면 "회원정보가 틀립니다! 다시 로그인 해주세요"
		//콘솔에 표시하는 프로그래밍
		//아이디, 비밀번호 -> 문자열, 적절한 매서드, next()...
		//조건문 if문을 이용 &&,||,! 적절한 연산자 사용
		//String ==, 문자열1.equals(문자열2)
		
		
		String dbId="m111";
		String dbPw="1111";
		Scanner input=new Scanner(System.in);
		
		System.out.println("아이디 입력: ");
		String id =input.next();
		
		System.out.println("비밀번호 입력: ");
		String pw=input.next();
		
		//두 조건 모두 true
		if(id.equals(dbId)&&pw.equals(dbPw)) {
			System.out.println("로그인 성공, 즐거운 쇼핑되세요");
		}else{System.out.println("회원정보가 틀립니다! 다시 로그인 해주세요");}
		
		//아이디, 비밀번호 하나라도 false일 때 로그인 실패 -> 실무에서 더 많이 씀(조건이 더 엄격함)
		if(!id.equals(dbId)||!pw.equals(dbPw)) {
			System.out.println("회원정보가 틀립니다! 다시 로그인 해주세요");
		}else {System.out.println("로그인 성공, 즐거운 쇼핑되세요");}
		
		System.out.println();
		
		if(id.equals(dbId)) {
			if(pw.equals(dbPw)) {
				System.out.println("로그인 성공, 즐거운 쇼핑되세요");}
			else {
				System.out.println("비밀번호가 틀립니다! 다시 입력해주세요");
			}	
		}else {System.out.println("아이디가 틀립니다! 다시 입력해주세요");
			
	}
	
		input.close();
		
	}
}	
		
		
