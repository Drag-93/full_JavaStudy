package org.java.collectionEx;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.java.project.dto.MemberDto;
import org.java.project.role.Role;

public class StreamEx2 {

	public static void main(String[] args) {

		System.out.println("Stream");
		List<MemberDto> memberDtos = new ArrayList<MemberDto>();
		// 회원 3명 추가 ->
		memberDtos.add(new MemberDto(1L, "m1@email.com", "11", 10, "서울", Role.ROLE_MEMBER, LocalDateTime.now(), null));
		memberDtos.add(new MemberDto(2L, "a2@email.com", "21", 10, "서울", Role.ROLE_MEMBER, LocalDateTime.now(), null));
		memberDtos.add(new MemberDto(3L, "m3@email.com", "31", 10, "서울", Role.ROLE_MEMBER, LocalDateTime.now(), null));

		System.out.println("for~each");
		for (MemberDto memberDto : memberDtos) {
			System.out.println(memberDto);
		}
		System.out.println();
		System.out.println("forEach");
		System.out.println("람다식");
		memberDtos.forEach(el -> {
			System.out.println(el);
		});
		memberDtos.forEach(el -> System.out.println(el));
		System.out.println("매서드 참조");
		memberDtos.forEach(System.out::println);
		System.out.println();
		System.out.println("Stream화 => memberDtos.stream()");
		// Stream -> List<>
		List<MemberDto> memberDtos2 = memberDtos.stream().collect(Collectors.toList());
//		memberDtos2.forEach(el-> System.out.println(el));
		memberDtos2.forEach(System.out::println);

	}
}
