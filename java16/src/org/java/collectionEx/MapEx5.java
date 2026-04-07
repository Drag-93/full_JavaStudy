package org.java.collectionEx;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.java.project.dto.MemberDto;
import org.java.project.role.Role;

public class MapEx5 {

	public static void main(String[] args) {
		System.out.println("Map");


		List<MemberDto> members = new ArrayList<MemberDto>();

		members.add(new MemberDto(1L, "m0@email.com", "11", 10, "서울", Role.ROLE_MEMBER, LocalDateTime.now(), null));
		members.add(new MemberDto(2L, "m1@email.com", "11", 20, "서울", Role.ROLE_MEMBER, LocalDateTime.now(), null));
		members.add(new MemberDto(3L, "m2@email.com", "11", 30, "서울", Role.ROLE_MEMBER, LocalDateTime.now(), null));
		members.add(new MemberDto(4L, "m3@email.com", "11", 40, "서울", Role.ROLE_MEMBER, LocalDateTime.now(), null));
		members.add(new MemberDto(5L, "m4@email.com", "11", 50, "서울", Role.ROLE_MEMBER, LocalDateTime.now(), null));

		Map<String, List<MemberDto>> memberList = new HashMap<String, List<MemberDto>>();
		memberList.put("memberList", members);

		System.out.println(memberList.get("memberList"));
		// 1. Set으로 키값저장
		// 2. Iterator롤 모든 memberList출력
		// 3. 이메일이 m2@email.com인 회원의 정보만 출력
		Set<String> kSet = memberList.keySet();
		Iterator<String> iterator = kSet.iterator(); //Set을 직렬화
		//키가 있으면
		while (iterator.hasNext()) {
			//키를 조회
			String keyStr = iterator.next();
			List<MemberDto> memberDtos = memberList.get(keyStr);
//			memberDtos.forEach(member-> System.out.println(member));			
			memberDtos.forEach(System.out::println);
			System.out.println();
			for (MemberDto member : memberDtos) {
				if (member.getUserEmail().equals("m2@email.com")) {
					System.out.println(member);
				}
			}
		}

	}
}
