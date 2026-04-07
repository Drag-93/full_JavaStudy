package org.java.project.service;

import java.util.List;

import org.java.project.dto.BoardDto;

public interface BoardService {

	int boardInsert(BoardDto boardDto);
	List<BoardDto> boardList();
		
		
}
