package org.java.basic.operatorEx;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		System.out.println("논리연산자 퀴즈");
		
		//while문을 이용해서 로그인을 구현하시오
		//	
		//로그인 실행하고 exit 입력시 while문 종료, 로그인 실행 안할 시 while문 종료
		
		//아이디, 비밀번호를 입력 받아서 DB에 저장되어있는
		//아이디, 비밀번호가 일치하면 "로그인 성공, 즐거운 쇼핑되세요"
		//일치하지 않으면 "회원정보가 틀립니다! 다시 로그인 해주세요"
		//콘솔에 표시하는 프로그래밍
		//아이디, 비밀번호 -> 문자열, 적절한 매서드, next()...
		//조건문 if문을 이용 &&,||,! 적절한 연산자 사용
		
		String dbId="m111";
		String dbPw="1111";
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("로그인 하시겠습니까?(yes/no)");
		String login = input.next();
		boolean bool = true;
		boolean state = false;
		if(login.equals("yes")) {
			while(bool){
				System.out.println("아이디 입력: ");
				String id=input.next();
				System.out.println("비밀번호 입력: ");
				String pw=input.next();
				
				if(id.equals(dbId)&& pw.equals(dbPw)) {
					System.out.println("로그인 성공, 즐거운 쇼핑되세요");
					bool=false;
					state=true;
					
					while(state) {System.out.println("로그인을 종료하시겠습니까?(eixt): ");
					String exit=input.next();
						if(exit.equals("exit")) {
							state=false;
							bool=true;
						}
					}
				
				}else {
					System.out.println("회원정보가 틀립니다! 다시 로그인 해주세요");
//					bool=false;
				}
			}
		}else if(login.equals("no")) {
			while(bool) {
				System.out.println("로그인 실행을 종료합니다.");
				bool=false;
			}
		}

		
		
		input.close();
		
	}
}
