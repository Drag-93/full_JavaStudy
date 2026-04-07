package org.java.collectionEx;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.java.project.dto.BoardDto;
import org.java.project.dto.MemberDto;
import org.java.project.role.Role;

public class MapEx6 {

	public static void main(String[] args) {

		// 다른 타입의 List객체를 저장 할수 있다.
		System.out.println("Map-> Map<String, List<Object>>");

		Map<String, List<Object>> projectList = new HashMap<String, List<Object>>();

		List<Object> memberList = new ArrayList<Object>();
		// 회원 5명 -> 추가
		// projectList -> "memberList"로 저장
		memberList.add(new MemberDto(1L, "m0@email.com", "11", 10, "서울", Role.ROLE_MEMBER, LocalDateTime.now(), null));
		memberList.add(new MemberDto(2L, "m1@email.com", "11", 20, "서울", Role.ROLE_MEMBER, LocalDateTime.now(), null));
		memberList.add(new MemberDto(3L, "m2@email.com", "11", 30, "서울", Role.ROLE_MEMBER, LocalDateTime.now(), null));
		memberList.add(new MemberDto(4L, "m3@email.com", "11", 40, "서울", Role.ROLE_MEMBER, LocalDateTime.now(), null));
		memberList.add(new MemberDto(5L, "m4@email.com", "11", 50, "서울", Role.ROLE_MEMBER, LocalDateTime.now(), null));

		projectList.put("memberList", memberList);

		List<Object> boardList = new ArrayList<Object>();
		// 게시글 5개 -> 추가
		// projectList -> "boardList"로 저장
		boardList.add(new BoardDto(1L, "1제목1", "내용1", 0, "일반", 1L, LocalDateTime.now(), null));
		boardList.add(new BoardDto(2L, "1제목2", "내용2", 0, "일반", 1L, LocalDateTime.now(), null));
		boardList.add(new BoardDto(3L, "2제목3", "내용3", 0, "일반", 1L, LocalDateTime.now(), null));
		boardList.add(new BoardDto(4L, "2제목4", "내용4", 0, "일반", 1L, LocalDateTime.now(), null));
		boardList.add(new BoardDto(5L, "3제목5", "내용5", 0, "일반", 1L, LocalDateTime.now(), null));

		projectList.put("boardList", boardList);
		// projectList ->
		// 1. Set으로 키값저장
		// 2. Iterator롤 모든 출력
		Set<String> kSet = projectList.keySet();
		Iterator<String> iterator = kSet.iterator();
		while (iterator.hasNext()) {
			String keyStr = iterator.next();
			List<Object> objects = projectList.get(keyStr);

//			objects.forEach(System.out::println);
//			objects.forEach(obj-> System.out.println(obj));			
			System.out.println();
			for (Object obj : objects) {
				System.out.println(obj);
			}
		}
		System.out.println();
		// 간단히 -> 최신 Map->
		projectList.forEach((key, list) -> {
			System.out.println("==== " + key + " ====");
			list.forEach(System.out::println);
		});

	}
}
