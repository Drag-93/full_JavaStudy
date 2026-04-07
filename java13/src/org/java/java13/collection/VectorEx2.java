package org.java.java13.collection;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

import org.java.java13.constraint.Role;
import org.java.java13.dto.MemberDto;

public class VectorEx2 {
public static void main(String[] args) {
	
	
	Scanner input = new Scanner(System.in);
	//다형성 이용
	List<MemberDto> members = new Vector<MemberDto>();
	
	while(true) {
		System.out.println("회원 서비스를 시작하시겠습니까?(exit 종료)");
		String q = input.next();
		
		if(!q.equals("exit")) {
			while(true) {
				System.out.println("쿼리문을 입력해주세요(insert)(exit 종료)");
				String query=input.next();
				
				
				if(query.equals("insert")) {
					System.out.println("회원가입 -> ");
					System.out.print("memberId: ");
					int memberId = input.nextInt();
					System.out.print("userEmail: ");
					String userEmail = input.next();
					System.out.print("userPw: ");
					String userPw = input.next();
					System.out.print("userName: ");
					String userName = input.next();
					
					members.add(new MemberDto(memberId, userEmail, userPw, userName, Role.ROLE_MEMBER, LocalDateTime.now(), null));
				}else if(query.equals("exit")) {
					System.out.println("프로그램 종료");
					break;
				}else {
					System.out.println("쿼리문 입력 오류");
				}
		
			}
			System.out.println("foreach 출력");
			for(MemberDto i :members ) {
				System.out.println(i+" ");
			}
		}else{
			System.out.println("회원 서비스를 종료합니다");
			break;
		}
	}
	input.close();
}
}

