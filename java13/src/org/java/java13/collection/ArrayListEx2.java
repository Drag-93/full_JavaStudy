package org.java.java13.collection;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.java.java13.constraint.Role;
import org.java.java13.dto.MemberDto;

public class ArrayListEx2 {
public static void main(String[] args) {
	System.out.println("ArrayList");
	
	List<MemberDto> members=new ArrayList<MemberDto>();
	members.add(new MemberDto(1, "m1@email.com", "1111", "m1", Role.ROLE_MEMBER, LocalDateTime.now(), null));
	members.add(new MemberDto(2, "m2@email.com", "1111", "m2", Role.ROLE_MEMBER, LocalDateTime.now(), null));
	members.add(new MemberDto(3, "m3@email.com", "1111", "m3", Role.ROLE_MEMBER, LocalDateTime.now(), null));
	members.add(new MemberDto(4, "m4@email.com", "1111", "m4", Role.ROLE_MEMBER, LocalDateTime.now(), null));
	members.add(new MemberDto(5, "m5@email.com", "1111", "m5", Role.ROLE_MEMBER, LocalDateTime.now(), null));
	System.out.println(members.size());
	System.out.println(members.get(0));
	System.out.println(members.get(0).getUserEmail());
	System.out.println(members.get(0).getCreateTime());
	//반복문, forEach,Iterator
	System.out.println("=============회원 조회(목록)=============");
	System.out.println("forEach -> 확장형 for문");
	for(MemberDto member:members) {
		System.out.println(member.getMemberId()+", "+member.getUserEmail()+", "+member.getUserPw()+", "+member.getUserName()+", "+member.getUserRole()+", "+member.getCreateTime());
	}
	System.out.println("Iterator");
	Iterator<MemberDto> iterator=members.iterator();
	while(iterator.hasNext()) {
		MemberDto member=iterator.next();
		System.out.println(member.getMemberId()+", "+member.getUserEmail()+", "+member.getUserPw()+", "+member.getUserName()+", "+member.getUserRole()+", "+member.getCreateTime());		
	}
	
	System.out.println("=============회원 상세 조회=============");
	for(MemberDto member: members) {//이메일이 "m1@email.com"인 회원 상세 조회
		if(member.getUserEmail().equals("m1@email.com")) {
			System.out.println(member.getMemberId()+", "+member.getUserEmail()+", "+member.getUserPw()+", "+member.getUserName()+", "+member.getUserRole()+", "+member.getCreateTime());
		}
	}
	
	System.out.println("=============회원 상세 조회=============");
	for(MemberDto member: members) {//이메일이 "m2@email.com"인 회원 상세 조회
		if(member.getUserEmail().equals("m2@email.com")) {
			System.out.println(member.getMemberId()+", "+member.getUserEmail()+", "+member.getUserPw()+", "+member.getUserName()+", "+member.getUserRole()+", "+member.getCreateTime());
		}
	}
	
	
	
	
	
	
	
	
	
}
}
