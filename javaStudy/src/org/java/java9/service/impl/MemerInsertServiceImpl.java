package org.java.java9.service.impl;

import java.util.Scanner;


import org.java.java9.dao.MemberDao;
import org.java.java9.role.Role;
import org.java.java9.service.MemberService;

public class MemerInsertServiceImpl implements MemberService{

	@Override
	public void excuteQueryService() {
		System.out.println("회원가입 실행");
		//싱글톤 
		MemberDao dao= MemberDao.getInstance();
		
		Scanner input= new Scanner(System.in);
		
		while(true) {

			// Scanner 입력
			
			System.out.println("회원가입실행(q면종료)");
			String q=input.next();
			
			if(q.equals("q")) {
				System.out.println("종료");
				break;
			}
			System.out.print("아이디입력: ");
			int memberId= input.nextInt();
			
			System.out.print("이메일입력: ");			
			String userEmail= input.next();
			
			System.out.print("비빌번호 입력: ");			
			String userPw= input.next();
			
			System.out.print("권한 입력: ");			
			String roleStr=input.next().toUpperCase();
			// String -> Role
			Role role = Role.valueOf(roleStr);
			
			int rs=dao.save(memberId, userEmail, userPw, role, null, null);

			if(rs!=1) {
				System.out.println("회원가입 실패");
				
			}else{
				System.out.println("회원가입 성공");
			}
			
		}
		
				
	}

}
