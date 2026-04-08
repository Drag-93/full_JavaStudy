package org.project.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.project.dto.MemberDto;
import org.project.service.MemberService;
import org.project.service.impl.MemberServiceImpl;

public class MemberController {

	public static void main(String[] args) {

		System.out.println("MemberController");

		Scanner input = new Scanner(System.in);

		boolean bool = false;

		while (!bool) {
			System.out.println("프로그램 시작?(exit)");
			String q = input.next();

			MemberService service = new MemberServiceImpl();
			if (!q.equals("exit")) {

				while (!bool) {

					System.out.println("쿼리문 입력(insert,update,delete,select,email,detail(id))?(exit)");

					String query = input.next();
					if (query.equals("insert")) {
						// 회원가입
						//name
						System.out.println("name: ");
						String name = input.next();
						// email
						System.out.println("email: ");
						String email = input.next();
						// userPw
						System.out.println("password: ");
						String password = input.next();
						// address
						System.out.println("address: ");
						String address = input.next();

						int rs = service.memberInsert(new MemberDto(null, email,password,name,   address));

						if (rs == 1) {
							System.out.println("회원가입 성공! 로그인페이지로 이동!");
						}

					} else if (query.equals("email")) {
						//이메일체크
						System.out.print("email: ");
						String email=input.next();
						MemberDto memberDto=service.emailChecked(email);
						System.out.println(memberDto);
					} else if (query.equals("update")) {
						//회원유무체크
						System.out.print("memberId: ");
						Long memberId=input.nextLong();
						MemberDto memberDto=service.memberDetail(memberId);
						System.out.print("email: ");
						String email=input.next();
						System.out.print("password: ");
						String password=input.next();
						System.out.print("name: ");
						String name=input.next();
						System.out.print("address: ");
						String address=input.next();
						
						MemberDto memberDto2=new MemberDto(memberId, email, password, name, address);
						
						service.memberUpdate(memberDto2);
						
						
					} else if (query.equals("select")) {
						Map<String, List<MemberDto>> map = new HashMap<String, List<MemberDto>>();

						List<MemberDto> memberDtos = service.memberList();

						// Controller -> return (조회-> 회원리스트)
						map.put("memberList", memberDtos);
						// View, React
						map.get("memberList").forEach(member -> System.out.println(member));

					} else if (query.equals("delete")) {
						// id
						System.out.print("memberId: ");
						Long memberId=input.nextLong();
						MemberDto memberDto=service.memberDetail(memberId);
						// 회원삭제
						service.memberDelete(memberId);
						
					} else if (query.equals("detail")) {
						// 회원상세조회
						System.out.println("memberId: ");
						Long memberId = input.nextLong();
						MemberDto memberDto = service.memberDetail(memberId);
						System.out.println(memberDto);
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
