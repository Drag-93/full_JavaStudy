package org.java.basic.controller;

import java.util.Scanner;

import org.java.basic.constaint.Role;
import org.java.basic.dto.MemberDto;

public class MemberController {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		for(int i =1;i<=5;i++) {
			System.out.println("회원가입 실행(insert/exit): ");
			String cmd=input.next();
			if(cmd.equals("exit")) {
				System.out.println("종료");
				break;
			}else if(cmd.equals("insert")) {
				while(i<=5) {
					MemberDto dto=new MemberDto();
					System.out.println(i+"번째");
					System.out.print("아이디: ");
					int inpId=input.nextInt();
					System.out.print("이메일: ");
					String inpEmail=input.next();
					System.out.print("비밀번호: ");
					String inpPw=input.next();
					System.out.print("권한(관리자,매니저,일반): ");
					String inpRole=input.next();
					
					if(inpRole.equals("관리자")) {
							Role role=Role.ROLE_ADMIN;
							dto.setRole(role);}
						else if(inpRole.equals("매니저")) {
							Role role=Role.ROLE_MANAGER;
							dto.setRole(role);}
						else if(inpRole.equals("일반")) {
							Role role=Role.ROLE_USER;
							dto.setRole(role);}
						else {
							System.out.println("잘못 입력하셨습니다");
							continue;
						}			
						dto.setMemberId(inpId);
						dto.setUserEmail(inpEmail);
						dto.setUserPw(inpPw);
						System.out.println("회원가입 성공");
						System.out.println(dto.toString());
						i++;
				}	
			}
			else {
				System.out.println("정확하게 입력해 주세요");
				i--;
			}
			
		}
	}
}


