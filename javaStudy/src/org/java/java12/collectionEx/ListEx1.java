package org.java.java12.collectionEx;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Vector;

import org.java.java12.dto.MemberDto;

public class ListEx1 {

	public static void main(String[] args) {
		
		System.out.println("List");
		
		List<MemberDto> memberList = new Vector<MemberDto>();
//		MemberDto member = new MemberDto(0, null, null, null, null, null, null);
		// 1. 추가 add
		memberList.add(new MemberDto(1, "m1@email.com", "1111", "m1", null, LocalDateTime.now(), null));
		memberList.add(new MemberDto(2, "m2@email.com", "1111", "m1", null, LocalDateTime.now(), null));
		memberList.add(new MemberDto(3, "m3@email.com", "1111", "m1", null, LocalDateTime.now(), null));
		memberList.add(new MemberDto(4, "m4@email.com", "1111", "m1", null, LocalDateTime.now(), null));
		memberList.add(new MemberDto(5, "m5@email.com", "1111", "m1", null, LocalDateTime.now(), null));
		// 2. foreach로 조회 -> 모든 요소 조회 memberList 추출
		for(MemberDto member:memberList) {
			System.out.print(member.getMemberId()+" ");
			System.out.print(member.getUserEmail()+" ");
			System.out.print(member.getUserName()+" ");
			System.out.print(member.getUserPw()+" ");
			System.out.print(member.getCreateTime()
					);
		}
		
	}
	
}
