package org.java.java9.service.impl;

import java.util.Scanner;

import org.java.java9.dao.MemberDao;
import org.java.java9.service.MemberService;

public class MemerDeleteServiceImpl implements MemberService {

	@Override
	public void excuteQueryService() {
		System.out.println("회원탈퇴");

		MemberDao dao = MemberDao.getInstance();
		Scanner input = new Scanner(System.in);
		while (true) {

			// Scanner 입력

			System.out.println("회원삭제실행(q면종료)");
			String q = input.next();

			if (q.equals("q")) {
				System.out.println("종료");
				break;
			}

			System.out.print("아이디입력: ");
			int memberId = input.nextInt();

			int rs = dao.deleteById(memberId);			

			if(rs!=1) {
				System.out.println("회원수정 실패");
				
			}else{
				System.out.println("회원수정 성공");
			}
			
			
			
		}

	}

}
