package org.java.basic.oopEx;

import java.util.Scanner;

public class MemberDtoMain {
	
	public static void main(String[] args) {
		System.out.println("클래스");
		
		MemberDto memberDto= new MemberDto();
		//Long<-1l
		memberDto.setId(1l);
		memberDto.setUserEmail("m1@email.com");
		memberDto.setUserPw("1111");
		memberDto.setUserName("m1");
		memberDto.setAge(33);
		memberDto.setRole(Role.ROLE_USER);
		
		System.out.println(memberDto.getId());
		System.out.println(memberDto.getUserEmail());
		System.out.println(memberDto.getUserPw());
		System.out.println(memberDto.getUserName());
		System.out.println(memberDto.getAddr());
		System.out.println(memberDto.getAge());
		System.out.println(memberDto.getRole());
		
		System.out.println();
		
		MemberDto memberDto2= new MemberDto(2l,"m2@email.com","2222","M2","서울 노원구",55,Role.ROLE_MANAGER);
		System.out.println(memberDto2.toString());
		
		
		//Scanner, while문 이용 "exit"가 입력되면 종료
		//회원가입을 수행
		//생성자는 선택해서
		//출력예서 ) 아이디: ~, 비밀번호: ~, 이름: ~
		//회원가입 후 회원정보는 콘솔에 출력
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("회원가입");
			System.out.println();
			
			System.out.print("이메일: ");
			String email3= input.next();
			if(email3.equals("exit")){
				System.out.println("회원가입 종료");
				break;
			}else {
			System.out.print("비밀번호: ");
			String pw3= input.next();
			if(pw3.equals("exit")){
				System.out.println("회원가입 종료");
				break;
			}
			System.out.print("이름: ");
			String name3= input.next();
			if(name3.equals("exit")){
				System.out.println("회원가입 종료");
				break;
			}else {
			System.out.print("주소: ");
			  input.nextLine();
			String addr3= input.nextLine();
			if(addr3.equals("exit")){
				System.out.println("회원가입 종료");
				break;
			}else {
			System.out.print("나이: ");
			int age3= input.nextInt();
			System.out.print("권한(관리자, 매니저, 일반): ");
			String inputRole= input.next();
			if(inputRole.equals("exit")){
				System.out.println("회원가입 종료");
				break;
			}else {
				MemberDto memberDto3=new MemberDto();
				Long id3=3l; 
				memberDto3.setId(id3);
				memberDto3.setUserEmail(email3);
				memberDto3.setUserPw(pw3);
				memberDto3.setUserName(name3);
				memberDto3.setAddr(addr3);
				memberDto3.setAge(age3);
				if(inputRole.equals("관리자")){
					Role role3=Role.ROLE_ADMIN;
					memberDto3.setRole(role3);
				}else if(inputRole.equals("매니저")){
					Role role3=Role.ROLE_MANAGER;
					memberDto3.setRole(role3);
				}else if(inputRole.equals("일반")){
					Role role3=Role.ROLE_USER;
					memberDto3.setRole(role3);
				}
				System.out.println("회원가입 성공");
				System.out.println(memberDto3.toString());
			}
			}}}
			System.out.println();
			
			
			break;
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
