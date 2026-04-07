package org.java.project.controller;

import java.util.List;
import java.util.Scanner;

import org.java.project.constraint.Role;
import org.java.project.dto.MemberDto;
import org.java.project.service.MemberService;
import org.java.project.service.impl.MemberServiceImpl;

public class MemberController {
	public static void main(String[] args) {
		System.out.println("회원 서비스");
		
		Scanner input =new Scanner(System.in);
		
		Boolean bool =false;
		
		MemberService service= null;
		
			
		while(!bool) {
			System.out.print("회원 서비스 실행(exit: 종료)");
			String q=input.next();
			if(!q.equals("exit")) {
				service=new MemberServiceImpl();
				while(!bool) {
					System.out.print("쿼리문 입력");
					String query=input.next();
					if(query.equals("delete")){
						System.out.println("회원 탈퇴");
						System.out.print("id: ");
						Long memberId=input.nextLong();
						int rs=service.deleteMember(memberId);
						if(rs==1) {
							System.out.println("회원 탈퇴 성공");
						}else {
							System.out.println("회원 탈퇴 실패");
						}
						
				}else if (query.equals("detail")) {
							System.out.println("회원조회(상세)");
							System.out.print("id: ");
							Long memberId = input.nextLong();
							MemberDto memberDto = service.memberDetail(memberId);
							System.out.println(memberDto);
					
					 }else if (query.equals("select")) {
						System.out.println("회원조회(목록)");
						List<MemberDto> memberDtos = service.memberList();
						if (memberDtos != null) {
							memberDtos.forEach(System.out::println);
						}
						
				}else if(query.equals("update")){
						System.out.print("변경할 ID: ");
						Long memberId=input.nextLong();
						System.out.print("userEmail: ");
						String userEmail=input.next();
						System.out.print("userPw: "); 
						String userPw=input.next();
						System.out.print("age: "); 
						int age=input.nextInt();
						System.out.print("address: "); 
						String address=input.next(); 
						System.out.print("role: ");
						String str =input.next().toUpperCase();
						Role role=Role.valueOf(str);
						
						int rs=service.updateMember(new MemberDto(memberId, userEmail, userPw, age, address, role, null, null));
						if(rs==1) {
							System.out.println("회원정보 수정 성공");
						}else {
							System.out.println("회원정보 수정 실패");
						}
						
				}else if(query.equals("insert")){
						System.out.print("userEmail: ");
						String userEmail=input.next();
						System.out.print("userPw: "); 
						String userPw=input.next();
						System.out.print("age: "); 
						int age=input.nextInt();
						System.out.print("address: "); 
						String address=input.next(); 
						System.out.print("role: ");
						String str =input.next().toUpperCase();
						Role role=Role.valueOf(str);
						
						
						int rs=service.insertMember(new MemberDto(1L, userEmail, userPw, age, address, role, null, null));
						if(rs==1) {
							System.out.println("회원가입 성공");
						}else {
							System.out.println("회원가입 실패");
						}
						
					}else if(query.equals("exit")) {
						System.out.println("서비스 종료");
						bool=true;
					}else {
						System.out.println("쿼리문 입력 오류");
					}
				}
				
			}else {
			System.out.println("서비스 종료");
			bool=true;
			}
		}
	
	
	
	
	input.close();
	}
}
