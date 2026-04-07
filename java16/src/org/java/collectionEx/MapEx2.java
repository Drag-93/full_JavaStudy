package org.java.collectionEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.java.project.dto.BoardDto;
import org.java.project.dto.MemberDto;


public class MapEx2 {

	public static void main(String[] args) {
		
		System.out.println("Map<K,V>");
		
		// 기본형
		Map<String,Integer> map=new HashMap<String, Integer>();
		map.put("one", 1);
		map.put("tow", 2);
		//하나의 객체
		Map<String, MemberDto> map0 = new HashMap<String, MemberDto>();
		Map<String, BoardDto> map1 = new HashMap<String, BoardDto>();
		// List객체
		Map<String, List<BoardDto>> map2 = new HashMap<String, List<BoardDto>>();
		
		//모든객체타입을 Map으로 저장 할 수 있다.
		Map<String, Object> mapObj = new HashMap<String, Object>();
		
		mapObj.put("member", new MemberDto(null, null, null, 0, null, null, null, null));
		mapObj.put("board", new BoardDto(null, null, null, 0, null,1L, null, null));		
		
		System.out.println(mapObj);
		System.out.println(mapObj.get("member"));
		System.out.println(mapObj.get("board"));
		
		System.out.println();		
		System.out.println();			
		
		
		Map<String, List<String>> boardMap = new HashMap<String, List<String>>();
		// 일반게시글, 비빌게시글 키로 -> Map에 추가
		List<String> board1 = new ArrayList<String>();
		board1.add("일반게시글1");
		board1.add("일반게시글2");
		board1.add("일반게시글3");
		board1.add("일반게시글4");
		board1.add("일반게시글5");
		System.out.println(board1);
		
		List<String> board2 = new ArrayList<String>();
		board2.add("비밀게시글1");
		board2.add("비밀게시글2");
		board2.add("비밀게시글3");
		board2.add("비밀게시글4");
		board2.add("비밀게시글5");
		System.out.println(board2);
		System.out.println();
		
		boardMap.put("일반게시판", board1);
		boardMap.put("비밀게시판", board2);
		System.out.println(boardMap);

		System.out.println();
		
		// keySet이용해서 Map board1, board2의 게시글 모두 콘솔에 출력
		Set<String> boardKeys = boardMap.keySet(); //일반게시판,비밀게시판
		Iterator<String> iterator2 = boardKeys.iterator();
		
		System.out.println("===========모든게시판 출력===========");
		while (iterator2.hasNext()) {
			String key = iterator2.next(); //key String
			System.out.println("key-> "+key);			
			List<String> boardLists0 = boardMap.get(key); //키값저장 value-> List<String>
			//모든게시판
			System.out.println("==========확장형for(foreach)============");
			for(String el: boardLists0) {
				System.out.println(el);
			}
			System.out.println("==========확장형for(foreach)============");
			System.out.println("==========forEach============");			
			boardLists0.forEach(el -> System.out.println(el));			
			System.out.println("==========forEach============");
			
			System.out.println("==========매서드참조============");
			boardLists0.forEach(System.out::println);			
			System.out.println("==========매서드참조============");

			System.out.println();			
			System.out.println("========================================");
			
			// 일반게시판 콘솔에 출력
			if(key.equals("일반게시판")) {
				System.out.println("일반게시판만 조회");				
				boardLists0.forEach(System.out::println);
			}
			System.out.println("========================================");
			

			System.out.println();
		}
		System.out.println();

	}
}
