package org.java.project.service;

import java.io.IOException;
import java.util.List;

import org.java.project.dto.BoardDto;

public interface BoardService {

	//게시글작성							//이미지파일 저장시 필요
	int insertBoard(BoardDto boarDto) throws IOException;
	
	//게시글목록조회
	List<BoardDto> boardList();
	
	//게시글상세조회
	BoardDto boardDetail(Long boardId);
	
	//게시글수정
	int updateBoard(BoardDto boarDto);
	
	//게시글 삭제
	int boardDelete(Long boardId);
	
	//회원별 게시글 조회
	List<BoardDto> boardMemberId(Long memberId);
	
	//게시글 삭제(entity)
	int delete(BoardDto boardDto);
	
}
