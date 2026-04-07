package org.java.project.controller;

import java.util.List;
import java.util.Scanner;

import org.java.project.constraint.Role;
import org.java.project.dto.MemberDto;
import org.java.project.service.MemberService;
import org.java.project.service.impl.MemberServiceImpl;

public class MemberController {
	public static void main(String[] args) {
		System.out.println("MemberController");
		
		Scanner input = new Scanner(System.in);
		MemberService service=null;
		boolean bool=false;
		MemberDto memberDto=new MemberDto();
		while(!bool) {
			service = new MemberServiceImpl();
			System.out.print("프로그램 실행(종료: exit)");
			String q = input.next();
			
			if(!q.equals("exit")) {
				while(!bool) {
					System.out.println("쿼리문 입력");
					String query=input.next();
					if(query.equals("update")) {
						System.out.println("회원 수정 서비스");
						System.out.print("memberId: ");
						Long memberId = input.nextLong();
						System.out.print("userEmail: ");
						String userEmail = input.next();
						System.out.print("userPw: ");
						String userPw = input.next();
						System.out.print("role: ");
						String str = input.next();
						Role role=Role.valueOf(str.toUpperCase());
						
						int rs=service.updateMember(new MemberDto(memberId, userEmail, userPw, role, null, null));
						
						if(rs==1) {
							System.out.println("회원 정보를 수정 했습니다");
						}else {
							System.out.println("회원 정보 수정 실패");
						}
						
					}	else if(query.equals("select")) {
						System.out.println("회원 목록 조회 서비스");
						List<MemberDto> members = service.memberList();
						for(MemberDto memberDto1:members) {
							System.out.println(memberDto1);
						}
//						members.forEach(el->System.out.println(el));
						
					}
					
					else if(query.equals("detail")) {
						System.out.println("회원 상세 조회 서비스");
						System.out.print("memberId: ");
						Long memberId=input.nextLong();
						
						memberDto = service.memberDetail(memberId);
						
						if(memberDto!=null) {
							System.out.println(memberDto.toString());
						}else {
							System.out.println("회원이 존재하지 않습니다");
						}
					}else if(query.equals("exit")) {
						System.out.println("종료");
						bool=true;
					}else{
						System.out.println("쿼리문 입력 오류-> 다시 입력해 주세요");
					}
				}
			}
			
			
		}
		
		
		
		
		
	}
}
