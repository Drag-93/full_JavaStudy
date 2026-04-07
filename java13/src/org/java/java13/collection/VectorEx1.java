package org.java.java13.collection;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.java.java13.constraint.Role;
import org.java.java13.dto.MemberDto;


public class VectorEx1 {
	public static void main(String[] args) {

		System.out.println("Vector");
//		Vector<MemberDto> members =new Vector<MemberDto>();
		List<MemberDto>members  =new Vector<MemberDto>();
		//회원등록 5명
		members.add(new MemberDto(1, "m1@email.com", "1111", "m1", Role.ROLE_MEMBER, LocalDateTime.now(), null));
		members.add(new MemberDto(2, "m2@email.com", "1111", "m2", Role.ROLE_MEMBER, LocalDateTime.now(), null));
		members.add(new MemberDto(3, "m3@email.com", "1111", "m3", Role.ROLE_MEMBER, LocalDateTime.now(), null));
		members.add(new MemberDto(4, "m4@email.com", "1111", "m4", Role.ROLE_MEMBER, LocalDateTime.now(), null));
		members.add(new MemberDto(5, "m5@email.com", "1111", "m5", Role.ROLE_MEMBER, LocalDateTime.now(), null));
		System.out.println(members.size());
		System.out.println(members.get(0));
		System.out.println(members.get(0).getUserEmail());
		System.out.println(members.get(0).getCreateTime());
		//반복문, foreach,Iterator
		//DB 테이블의 레코드
		System.out.println("foreach");
		//모든 요소를 get -> 회원목록 조회
		for(MemberDto member: members) {
			System.out.println(member.getMemberId()+", "+member.getUserEmail()+", "
								+ member.getUserPw()+", "
								+ member.getUserName()+", "
								+ member.getUserRole()+", "
					);
			System.out.println("Iterator");
			Iterator<MemberDto> iterator =members.iterator();
			
			
								
								
								
								
								
								
		
		
		
		}		
		
		
		
		
		
		
		
		
		
	}
}
