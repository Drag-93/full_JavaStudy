package org.java.java12.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import org.java.java12.constraint.Role;
import org.java.java12.dto.MemberDto;
import org.java.java12.service.MemberService;
import org.java.java12.service.impl.MemberServiceImpl;

public class MemberController {
	public static void main(String[] args) throws SQLException, IOException {
		
		System.out.println("사용자 요청 정보 입니다.(*.mb 입력)");
		Scanner input = new Scanner(System.in);
		
		MemberServiceImpl service=new MemberServiceImpl();

		while (true) {
			System.out.print("요청 정보입력: ");
			String order = input.next();
			if (order.equals("insert")) {				
					System.out.println("회원가입 실행");
					System.out.println("아이디: ");
					int memberId=input.nextInt();
					System.out.println("이메일: ");
					String userEmail=input.next();
					System.out.println("비밀번호: ");
					String userPw=input.next();
					System.out.println("이름: ");
					String userName=input.next();
					System.out.println("권한: ");
					String roleStr=input.next().toUpperCase();
					
					Role role=Role.valueOf(roleStr);
					
					
					service.insert(new MemberDto(memberId, userEmail, userPw, userName, role, LocalDateTime.now(), null));
					
				
				} else if (order.equals("update")) {
					System.out.println("회원수정");
				} else if (order.equals("select")) {
					System.out.println("회원조회");
				} else if (order.equals("delete")) {
					System.out.println("회원탈퇴");
				} else if (order.equals("exit")) {
				System.out.println("서비스 종료");
				break;
			} else {
				System.out.println("다시 입력 해주세요");
			}
		}
		
		
		
		
		
		
		
	}
}
