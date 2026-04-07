package org.java.java12.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Scanner;

import org.java.java12.connect.DBConnect;
import org.java.java12.constraint.Role;
import org.java.java12.dto.MemberDto;
import org.java.java12.service.MemerService;
import org.java.java12.service.impl.MemberServiceImpl;


public class MemberController {

	public static void main(String[] args) throws SQLException, IOException {
		
		System.out.println("MemberController");
		
		Scanner input = new Scanner(System.in);
		
		MemerService service =null;
		
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
					int memberId = input.nextInt();
					System.out.print("userEmail: ");
					String userEmail = input.next();
					System.out.print("userPw: ");
					String userPw = input.next();
					System.out.print("UserName");
					String UserName = input.next();
					System.out.print("userRole: ");
					String userRole = input.next();
					
					service.insert(new MemberDto(memberId, userEmail, userPw, UserName,
							Role.ROLE_MEMBER,
							LocalDateTime.now(), null));
				} else if (query.equals("update")) {
					service.update(new MemberDto(0, query, quest, query, null, null, null));
				} else if (query.equals("select")) {
					service.members();
				} else if (query.equals("delete")) {
					service.delete("userEmail");
				} else if (query.equals("exit")) {
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
