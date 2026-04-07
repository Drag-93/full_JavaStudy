package org.java.java9.service.impl;

import java.time.LocalDateTime;
import java.util.Scanner;

import org.java.java9.dao.MemberDao;
import org.java.java9.role.Role;
import org.java.java9.service.MemberService;

public class MemberInsertServiceImpl implements MemberService{
	@Override
	public void excuteQueryService() {
		System.out.println("회원 가입");
		
	
		
	MemberDao dao=MemberDao.getInstance();
	
	Scanner input=new Scanner(System.in);
	
	while(true) {
		System.out.println("회원가입 실행(q면 종료)");
		String q=input.next();
		if(q.equals("q")) {
			System.out.println("종료");
			break;
		}
		System.out.print("아이디 입력: ");
		int memberId=input.nextInt();
		
		System.out.print("이메일 입력: ");
		String userEmail=input.next();
		
		System.out.print("비밀번호 입력: ");
		String userPw=input.next();
		
		System.out.print("권한 입력: ");
		String roleStr = input.next().toUpperCase();
		//String->Role
		Role role= Role.valueOf(roleStr);
		
		int rs=dao.save(memberId, userEmail, userPw, role, LocalDateTime.now(), null);
		System.out.println(rs);
	
	
	if(rs!=1) {
		System.out.println("회원가입 실패");
		
	}else {
		System.out.println("회원가입 성공");
	}
	}
	input.close();
}
}