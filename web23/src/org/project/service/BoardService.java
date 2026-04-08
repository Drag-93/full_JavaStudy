package org.project.service;

import java.util.List;

import org.project.dto.BoardDto;



public interface BoardService {
	int boardInsert(BoardDto boardDto);
	
	int boardUpdate(BoardDto boardDto);

	int boardDelete(Long boardId);
	
	BoardDto boardDetail(Long boardId);
	
	List<BoardDto> boardList();
	
	List<BoardDto> boardMemberId(Long memberId);
	
	
}
