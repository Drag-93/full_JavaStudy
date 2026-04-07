package org.java.collectionEx;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.java.project.dto.BoardDto;
import org.java.project.dto.MemberDto;
import org.java.project.entity.BoardEntity;
import org.java.project.entity.MemberEntity;
import org.java.project.role.Role;

public class StreamEx4 {

	public static void main(String[] args) {

		System.out.println("Stream");

		List<MemberEntity> members = new ArrayList<MemberEntity>();
		// MemberEntity -> 5명 추가
		members.add(new MemberEntity(1L, "m0@email.com", "11", 10, "서울", Role.ROLE_MEMBER, LocalDateTime.now(), null));
		members.add(new MemberEntity(2L, "m1@email.com", "11", 20, "서울", Role.ROLE_MEMBER, LocalDateTime.now(), null));
		members.add(new MemberEntity(3L, "m2@email.com", "11", 30, "서울", Role.ROLE_MEMBER, LocalDateTime.now(), null));
		members.add(new MemberEntity(4L, "m3@email.com", "11", 40, "서울", Role.ROLE_MEMBER, LocalDateTime.now(), null));
		members.add(new MemberEntity(5L, "m4@email.com", "11", 50, "서울", Role.ROLE_MEMBER, LocalDateTime.now(), null));

		members.forEach(System.out::println);
		System.out.println();
		// List<MemberEntity> -> List<MemberDto> -> for~each이용해서
		List<MemberDto> memberDtoList = new ArrayList<MemberDto>();

		for (MemberEntity memberEntity : members) {
			// Entity -> Dto
			MemberDto memberDto = MemberDto.toMemberDto(memberEntity);
			// memberDtoList 추가 List
			memberDtoList.add(memberDto);
		}
		// 모든 리스트 요소 조회
		memberDtoList.forEach(System.out::println);
		System.out.println();

		// List<MemberEntity> -> List<MemberDto 스트림.map(요소 -> return)
		List<MemberDto> memberDtos2 = members.stream().map(el -> {// MemberEntity -> MemberDto
			MemberDto memberDto = MemberDto.toMemberDto(el);
			return memberDto;
		}).collect(Collectors.toList());// Lsit화
//					
		// List<MemberEntity> -> List<MemberDto> 스트림.map(요소 -> return)
		List<MemberDto> memberDtos3 = members.stream() // Stream화
				// Stream의 모든요소를 MemberDto의 toMemberDto매서드의 인자로
				// Entity-> Dto
				.map(MemberDto::toMemberDto).collect(Collectors.toList()); /// Stream-> List화
		members.forEach(System.out::println);
		System.out.println();
		memberDtos2.forEach(System.out::println);
		System.out.println();
		memberDtos3.forEach(System.out::println);
		System.out.println();

		System.out.println(" stream.map.collect().forEach");
		members.stream().map(MemberDto::toMemberDto).collect(Collectors.toList()).forEach(System.out::println);

		System.out.println();

		System.out.println("List<BoardEntity> ");
//		// List<BoardDto> -> List<BoardEntity>
//
////		 List<BoardEntity> -> 게시글 5개 작정		
		List<BoardEntity> boardEntities = new ArrayList<BoardEntity>();

		boardEntities.add(new BoardEntity(1l, "제목1", "내용11", 0, "일반", 1L, LocalDateTime.now(), null));
		boardEntities.add(new BoardEntity(2l, "제목2", "내용12", 0, "일반", 1L, LocalDateTime.now(), null));
		boardEntities.add(new BoardEntity(3l, "제목3", "내용13", 0, "비빌", 1L, LocalDateTime.now(), null));
		boardEntities.add(new BoardEntity(4l, "제목4", "내용14", 0, "비빌", 2L, LocalDateTime.now(), null));
		boardEntities.add(new BoardEntity(5l, "제목5", "내용15", 0, "일반", 2L, LocalDateTime.now(), null));

		boardEntities.forEach(System.out::println);
		// 게시글 조회 DB조회 -> Enity
		System.out.println();

		List<BoardDto> boardDtos = boardEntities.stream() // Stream화
				.map(BoardDto::toBoardDto) // Entity-> Dto
				.collect(Collectors.toList()); /// List화

		boardDtos.forEach(System.out::println);

	}
}
