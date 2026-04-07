package org.java.project.controller;

import java.util.Scanner;

import org.java.project.constraint.Role;
import org.java.project.dto.MemberDto;
import org.java.project.service.MemberService;
import org.java.project.service.impl.MemberServiceImpl;


// @Controller     -> 페이지이동O +데이터   기본
// @RestController -> 페이지이동X + 데이터  React+Spring -> SPA
// @WebServlet  -> 컨트롤러 역할(Servlet)  -> MVC 
public class MemberController {

	public static void main(String[] args) throws Exception {

		System.out.println("MemberController");

		Scanner input = new Scanner(System.in);
		boolean bool = false;
		MemberService service = null;

		while (!bool) {
		  service = new MemberServiceImpl();

			System.out.println("프로그램 시작?(exit)");
			String q = input.next();

			if (!q.equals("exit")) {

				while (!bool) {
					System.out.println("쿼리문 입력(insert,update,delete,select,detail,email)?(exit)");

					String query = input.next();
					if (query.equals("insert")) {
						// 회원가입
						// id
//						System.out.println("id: ");
//						Long memberId = input.nextLong();
						// userEmail
						System.out.println("userEmail: ");
						String userEmail = input.next();
						// userPw
						System.out.println("userPw: ");
						String userPw = input.next();
						// age
						System.out.println("age: ");
						int age = input.nextInt();
						// address
						System.out.println("address: ");
						String address = input.next();

						MemberDto memberDto = service.memberEmail(userEmail);

						if (memberDto != null) {
							System.out.println("이미 이메일이 존재 합니다!");
						} else {

							int rs = service.insertMember(
									new MemberDto(1L, userEmail, userPw, age, address, Role.MEMBER, null, null));

							if (rs == 1) {
								System.out.println("회원가입 성공! 로그인페이지로 이동!");
							}else {
								System.out.println("회원가입실패!");
							}

						}

					} else if (query.equals("exit")) {
						System.out.println("종료!!");
						bool = true;
					}
				}

			} else {
				System.out.println("종료!!");
				bool = true;
			}

		}

	}
}
