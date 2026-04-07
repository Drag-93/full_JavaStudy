package org.java.collectionEx;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.java.project.dto.BoardDto;

public class MapEx4 {

	public static void main(String[] args) {
		System.out.println("Map<K,V>");

		List<BoardDto> boardList = new ArrayList<BoardDto>();
		boardList.add(new BoardDto(1L, "1제목1", "내용1", 0, "일반", 1L, LocalDateTime.now(), null));
		boardList.add(new BoardDto(2L, "1제목2", "내용2", 0, "일반", 1L, LocalDateTime.now(), null));
		boardList.add(new BoardDto(3L, "2제목3", "내용3", 0, "일반", 1L, LocalDateTime.now(), null));
		boardList.add(new BoardDto(4L, "2제목43", "내용4", 0, "일반", 1L, LocalDateTime.now(), null));
		boardList.add(new BoardDto(5L, "3제목5", "내용5", 0, "일반", 1L, LocalDateTime.now(), null));
		boardList.add(new BoardDto(6L, "4제목12", "내용6", 0, "비빌", 2L, LocalDateTime.now(), null));
		boardList.add(new BoardDto(7L, "5제목22", "내용7", 0, "비빌", 2L, LocalDateTime.now(), null));
		boardList.add(new BoardDto(8L, "6제목32", "내용8", 0, "비빌", 2L, LocalDateTime.now(), null));
		boardList.add(new BoardDto(9L, "7제목42", "내용9", 0, "비빌", 1L, LocalDateTime.now(), null));
		boardList.add(new BoardDto(10L, "8제목52", "내용10", 0, "비빌", 1L, LocalDateTime.now(), null));

		Map<String, List<BoardDto>> boardMap = new HashMap<String, List<BoardDto>>();
		boardMap.put("boardList", boardList);
		
		
		System.out.println(boardMap);
		// post -> "일반"인 리스트만 출력
		Set<String> set = boardMap.keySet();
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String keyStr = iterator.next();
			List<BoardDto> boardDtos = boardMap.get(keyStr);
			for (BoardDto boardDto : boardDtos) {
				// 일반 게시판
//				if (boardDto.getPost().equals("일반")) {	
//					System.out.println(boardDto);
//				}
				// 제목이 1부터 시작하는 게시글 조회
//				if (boardDto.getTitle().startsWith("3")) {	//3으로 시작~
//					System.out.println(boardDto);
//				}
//				if (boardDto.getTitle().endsWith("3")) {    //3으로 끝나는~
//					System.out.println(boardDto);
//				}
				if (boardDto.getTitle().contains("3")) { // 3이포함되어 있는
					System.out.println(boardDto);
				}
			}
//				boardMap.get(keyStr).forEach(board -> System.out.println(board));		
			System.out.println();

		}

	}
}
