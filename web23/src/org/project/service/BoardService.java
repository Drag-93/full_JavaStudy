package org.project.service;

import java.util.List;

import org.project.dto.BoardDto;



public interface BoardService {
	int boardInsert(BoardDto boardDto);
	
	int boardUpdate(BoardDto boardDto);

	int boardDelete(Long boardId);
	
	BoardDto boardDetail(Long boardId);
	
	List<BoardDto> boardList();
	
	
	//board에서 memberId가 1인 사람이 작성한 사람의
	//게시글 목록 조회 -> inner join
	List<BoardDto> findByMemberId(Long memberId);
	
}
