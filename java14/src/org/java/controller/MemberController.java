package org.java.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

import org.java.constraint.Role;
import org.java.dto.MemberDto;
import org.java.service.MemberService;
import org.java.service.impl.MemberServiceImpl;

public class MemberController {

	public static void main(String[] args) {
		System.out.println("MemberController");
		
		Scanner input= new Scanner(System.in);
		
		MemberService service=null;
		
		while (true) {
			System.out.print("예제를 실행 하시겠습니다!(exit-> 종료): ");
			String quest = input.next();
			if (!quest.equals("exit")) {
				System.out.print("쿼리문을 입력하세요(insert,update,select,delete): ");
				String query = input.next();
				// 다형성 -> 부모타입의 객체 참조변수
				service = new MemberServiceImpl();

				if (query.equals("insert")) {
					// while, Scanner입력 -> 회원가입
					// 사용자의 입력정보를 -> Controller-> Service에 전달 -> DAO-> DB저장
					System.out.println("회원가입 실행! ");
					System.out.print("아이디: ");
					Long memberId = input.nextLong();
					
					System.out.print("userEmail: ");
					String userEmail = input.next();
					System.out.print("userPw: ");
					String userPw = input.next();
					
					System.out.print("age");
					int age = input.nextInt();
					
					System.out.print("address");
					String address = input.next();					
					
					service.memberInsert(new MemberDto(memberId, userEmail, userPw,age, address, null, null, null));
					
					
					
				} else if (query.equals("select")) {
					
					List<MemberDto> memberDtos = service.memberList();

					for (MemberDto member : memberDtos) {
						System.out.println(member.getMemberId() + ", " + member.getUserEmail() + ", "
								+ member.getUserPw() + ", " + member.getAddress() + ", " + member.getAge() + ", "
								+member.getRole() + ", "
								+ member.getCreateTime());
					}

				}  else if (query.equals("exit")) {
					System.out.println("예제를 종료하겠습니다!");
					break;
				} else {
					System.out.println("쿼리문 입력오류입니다!!");
				}
			} else {
				System.out.println("예제를 종료하겠습니다!");
				break;
			}

		}
		
		input.close();
	}
}
