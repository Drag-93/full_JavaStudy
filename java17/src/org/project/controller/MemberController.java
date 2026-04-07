package org.project.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

import org.project.constraint.Role;
import org.project.dto.MemberDto;
import org.project.entity.MemberEntity;
import org.project.service.MemberService;
import org.project.service.impl.MemberServiceImpl;

// @Controller     -> 페이지이동O +데이터   기본
// @RestController -> 페이지이동X + 데이터  React+Spring -> SPA
// @WebServlet  -> 컨트롤러 역할(Servlet)  -> MVC 
public class MemberController {

	public static void main(String[] args) throws Exception {

		System.out.println("MemberController");
		Scanner input = new Scanner(System.in);
		boolean bool = false;

		while (!bool) {
			System.out.println("회원 서비스를 시작하시겠습니까?(exit종료)");
			String q = input.next();
			MemberService service = new MemberServiceImpl();

			if (!q.equals("exit")) {

				while (true) {

					System.out.println("쿼리문을 입력해주세요(insert,update,select,delete,email,detail)(exit종료)");
					String query = input.next();

					if (query.equals("insert")) {
						System.out.println("회원가입 -> ");
						service = new MemberServiceImpl();
						// query insert -> Scanner memberId,userEmail,userPw,LocalDateTime
						System.out.print("memberId: ");
						Long memberId = input.nextLong();

						System.out.print("userEmail: ");
						String userEmail = input.next();

						System.out.print("userPw: ");
						String userPw = input.next();

						System.out.print("age: ");
						int age = input.nextInt();

						System.out.print("address: ");
						String address = input.next();
						
						// 1. 이메일 체크 -> 회원가입시 먼저 체크 -> 시큐리티 
						MemberDto memberDto = service.memberEmail(userEmail);

						if (memberDto == null) {
							System.out.println("이메일이 없다! 회원가입 계속!!");
							// 2.회원가입, 이메일 동시 체크
							service.insertMember(new MemberDto(memberId, userEmail, userPw, age, address, Role.MEMBER,
									LocalDateTime.now(), null));
						} else {
							System.out.println("이메일이 존재하는 회원!!");
							System.out.println(memberDto);
						}

					}  else if (query.equals("email")) {
						System.out.println("이메일 조회");

						System.out.print("userEmail: ");
						String userEmail = input.next();

						// 1. 이메일 체크
						MemberDto memberDto = service.memberEmail(userEmail);

						if (memberDto == null) {
							System.out.println("이메일이 없다! 회원가입 계속!!");
						} else {
							System.out.println("이메일이 존재하는 회원!!");
							System.out.println(memberDto);
						}

					} else if (query.equals("select")) {
						List<MemberDto> members = service.memberList();
						
						for(MemberDto memberDto: members) {
							System.out.println(memberDto);
						}
						
						System.out.println();
						//forEach(람다식)
						members.forEach(el-> System.out.println(el));
						
						System.out.println();
						// 매서드 참조
						members.forEach(System.out::println);
//						System.out.println(members);

					} else if (query.equals("detail")) {
						System.out.println("회원상세 조회");
						System.out.print("memberId: ");
						Long memberId = input.nextLong();						
						// 1. 아이디체크
						MemberDto memberDto = service.memberDetail(memberId);

						if (memberDto == null) {
							System.out.println(" 회원이 존재 하지 않습니다!!");
						} else {
							System.out.println("조회할 회원은 회원!!");
							System.out.println(memberDto);
														
						}

					}else if (query.equals("delete")) {						
						// 회원아이디가 일치 하면 회원삭제 
						
						

					} else if (query.equals("update")) {

					} else if (query.equals("exit")) {
						System.out.println("전체 프로그램 종료!!");
						bool = true;
						break;
					} else {
						System.out.println("쿼리문 입력오류!!");
					}
				}

			} else {
				System.out.println("종료합니다!!");
				bool = true;
			}
		}

		input.close();

	}
}
