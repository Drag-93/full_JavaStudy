package org.java.java9.service.impl;

import java.util.List;
import java.util.Scanner;

import org.java.java9.dao.MemberDao;
import org.java.java9.service.MemberService;

public class MemerSelectServiceImpl implements MemberService{

	@Override
	public void excuteQueryService() {
		
		MemberDao dao = MemberDao.getInstance();
		Scanner input = new Scanner(System.in);
		while (true) {
			// Scanner 입력
			System.out.println("회원조회실행(q면종료)");
			String q = input.next();

			if (q.equals("q")) {
				System.out.println("종료");
				break;
			}
			
			List<String> rs = dao.findAll();			

			if(rs==null) {
				System.out.println("회원목록이 없습니다.");				
			}else{
				System.out.println("회원목록 조회 성공");
				//List객체의 모든 요소를 조회
				for(String member:rs) {
					
					System.out.println(member);
				}
				
			}
			
			
			
		}
		
	}

}
