package org.java.java13.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.java.java13.constraint.Role;
import org.java.java13.dto.MemberDto;
import org.java.java13.service.impl.MemberServiceImpl;

public class MemberController {
	public static void main(String[] args) throws SQLException,IOException {
//		MemberController 클래스
		//쿼리문을 입력하세요(insert,update,select,delete): 
		//while문  Scanner 이용,다형성 
		//insert ->회원가입 
		//update ->회원수정
		//select ->회원조회
//			-> 5명의 회원 목록조회 ->  Dao활용
		//delete ->회원삭제
		
		Scanner input=new Scanner(System.in);
		MemberServiceImpl service=new MemberServiceImpl();
		List<MemberDto>members=new ArrayList<MemberDto>();
		
		while(true) {
			System.out.println("회원 서비스를 시작하시겠습니까?(exit종료)");
			String q=input.next();
			if(!q.equals("exit")) {
				while(true) {
					System.out.println("쿼리문을 입력해주세요(exit종료)");
					String query=input.next();
					
					if(query.equals("insert")) {
						System.out.println("회원가입 실행");
						System.out.println("memberId: ");
						int memberId=input.nextInt();
						System.out.println("userEmail: ");
						String userEmail=input.next();
						System.out.println("userPw: ");
						String userPw=input.next();
						System.out.println("userName: ");
						String userName=input.next();
						
						MemberDto member=new MemberDto(memberId, userEmail, userPw, userName, Role.ROLE_MEMBER, LocalDateTime.now(), null); 
						members.add(member);
						try {
							service.save(member);
						} catch (SQLException e) {
							System.out.println("DB연동 Fail");
							e.printStackTrace();
						} catch (IOException e) {
							System.out.println("입력 오류");
							e.printStackTrace();
						}
						
					}
					else if(query.equals("update")) {
						
						
					}
					else if(query.equals("delete")) {
						
					}
					else if(query.equals("select")) {
						List<MemberDto> memberList = service.findAll();

						for (MemberDto member : memberList) {
							System.out.println(member.getMemberId() + ", " + member.getUserEmail() + ", "
									+ member.getUserPw() + ", " + member.getUserName() + ", " + member.getUserRole() + ", "
									+ member.getCreateTime());
						}
						
					}
					else if(query.equals("exit")) {
						System.out.println("프로그램 종료");
						break;
					}
					else {
						System.out.println("쿼리문 입력 오류");
						System.out.println("다시 입력해 주세요");
					}
				}
				
			}
			else {
				System.out.println("회원 서비스 종료");
				break;
			}
//			System.out.println("전체 회원 목록");
//			for(MemberDto i:members) {
//				System.out.println(i+" ");
//			}
		}
		
		
		
		
		
		
		input.close();
		
		
		
		
	}
	
	
	
	
		
		
		
		
		
		
		
		
		
}
