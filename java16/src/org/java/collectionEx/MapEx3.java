package org.java.collectionEx;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.java.project.dto.BoardDto;


public class MapEx3 {

	public static void main(String[] args) {

		System.out.println("Map<K,V>");

		//게시글 5개작성 
		// BoardDto, List이용해서 각각 5개요소를 추가		
		// 일반게시판 -> post:"일반"
		List<BoardDto> board1 = new ArrayList<BoardDto>();
		board1.add(new BoardDto(1L, "제목1", "내용1", 0, "일반",1L, LocalDateTime.now(), null));
		board1.add(new BoardDto(2L, "제목2", "내용2", 0, "일반",1L, LocalDateTime.now(), null));
		board1.add(new BoardDto(3L, "제목3", "내용3", 0, "일반",2L, LocalDateTime.now(), null));
		board1.add(new BoardDto(4L, "제목4", "내용4", 0, "일반",2L, LocalDateTime.now(), null));
		board1.add(new BoardDto(5L, "제목5", "내용5", 0, "일반",3L, LocalDateTime.now(), null));
//		board1.forEach(el -> System.out.println(el));
		board1.forEach(System.out::println); //List
		
		System.out.println();
		// 비빌게시판 -> post:"비빌"
		List<BoardDto> board2 = new ArrayList<BoardDto>();
		board2.add(new BoardDto(6L, "제목12", "내용12", 0, "비빌",1L, LocalDateTime.now(), null));
		board2.add(new BoardDto(7L, "제목22", "내용22", 0, "비빌", 1L,LocalDateTime.now(), null));
		board2.add(new BoardDto(8L, "제목32", "내용32", 0, "비빌",2L, LocalDateTime.now(), null));
		board2.add(new BoardDto(9L, "제목42", "내용42", 0, "비빌", 2L,LocalDateTime.now(), null));
		board2.add(new BoardDto(10L, "제목52", "내용52", 0, "비빌",3L, LocalDateTime.now(), null));
//		board2.forEach(el -> System.out.println(el));
		board1.forEach(System.out::println);

		Map<String, List<BoardDto>> boardMap = new HashMap<String, List<BoardDto>>();
		boardMap.put("일반게시판", board1);
		boardMap.put("비빌게시판", board2);

		System.out.println(boardMap);
		System.out.println();
		System.out.println();

		//일반게시판만 조회
		System.out.println("일반게시판만 조회");
		Set<String> set = boardMap.keySet(); //키값 ->Set
		Iterator<String> iterator = set.iterator();//Iterator ->직렬화
		while (iterator.hasNext()) {
			String keyStr = iterator.next();

//			if (!keyStr.equals("비빌게시판")) {
				if (keyStr.equals("일반게시판")) {
//				List<BoardDto> boardDtos = boardMap.get(keyStr);
//				for (BoardDto boardDto : boardDtos) {
//					System.out.println(boardDto);
//				}
//				boardMap.get(keyStr).forEach(board -> System.out.println(board));//List
//				System.out.println();
				boardMap.get(keyStr).forEach(System.out::println);//매서드참조,List
			}
			System.out.println();

		}

	}
}
