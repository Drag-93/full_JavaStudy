package org.java.project.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.java.project.dao.BoardDao;
import org.java.project.dao.MemberDao;
import org.java.project.dto.BoardDto;
import org.java.project.entity.BoardEntity;
import org.java.project.entity.MemberEntity;
import org.java.project.service.BoardService;

public class BoardServiceImpl implements BoardService{

	@Override
	public int insertBoard(BoardDto boardDto) {
		System.out.println("게시글 작성");
		MemberDao memberDao= MemberDao.getInsatance();
		MemberEntity memberEntity = memberDao.findById(boardDto.getMemberId());
		
		if(memberEntity==null) {
			System.out.println("회원정보 없음");
			throw new IllegalArgumentException();
		}
		BoardDao dao = BoardDao.getInstance();
		BoardEntity boardEntity=BoardEntity.toinsertBoardEntity(boardDto);
		int rs=dao.save(boardEntity);
		if(rs!=1) {
			System.out.println("게시글 작성 실패");
			throw new RuntimeException();
		}else {
			System.out.println("게시글 작성 성공");
		}
		return rs;
	}


	@Override
	public List<BoardDto> boardList() {
		System.out.println("게시글 목록 조회");
		BoardDao dao =BoardDao.getInstance();
		List<BoardEntity> boardEntities=dao.findAll();
		
		if(boardEntities.isEmpty()) {
			System.out.println("게시글 없음");
			throw new NullPointerException();
		}
		
		List<BoardDto> boardDtos=new ArrayList<BoardDto>();
		for(BoardEntity boardEntity: boardEntities) {
			BoardDto boardDto=BoardDto.toBoardDto(boardEntity);
			boardDtos.add(boardDto);
		}
		return boardDtos;
	}

	@Override
	public BoardDto boardDetail(Long boardId) {
		System.out.println("게시글 상세 조회");
		BoardDao boardDao=BoardDao.getInstance();
		BoardEntity boardEntity=boardDao.findById(boardId);
		
		if(boardEntity==null) {
			System.out.println("게시글이 업습니다.");
			throw new IllegalArgumentException();
		}
		return BoardDto.toBoardDto(boardEntity);
	}
	
	@Override
	public int updateBoard(BoardDto boardDto) {
		System.out.println("게시글 수정");
		MemberDao memberDao= MemberDao.getInsatance();
		MemberEntity memberEntity = memberDao.findById(boardDto.getMemberId());
		
		if(memberEntity==null) {
			System.out.println("회원정보 없음");
			throw new IllegalArgumentException();
		}
		BoardDao dao = BoardDao.getInstance();
		BoardEntity boardEntity=dao.findById(boardDto.getBoardId());
		if(boardEntity==null) {
			System.out.println("게시글이 없습니다");
			throw new IllegalArgumentException();
		}
		
		BoardEntity boardEntity2=BoardEntity.toUpdateBoardEntity(boardDto);
		int rs =dao.saveUpdate(boardEntity2);
		if(rs!=1) {
			System.out.println("게시글 수정 실패");
			throw new RuntimeException();
		}else {
			System.out.println("게시글 수정 성공");
		}
		return rs;
	}

	@Override
	public int boardDelete(Long boardId) {
		System.out.println("게시글 삭제");
		BoardDao boardDao=BoardDao.getInstance();
		BoardEntity boardEntity=boardDao.findById(boardId);
		
		if(boardEntity==null) {
			System.out.println("게시글이 업습니다.");
			throw new IllegalArgumentException();
		}
		int rs=boardDao.deleteById(boardId);
		if(rs!=1) {
			System.out.println("게시글 삭제 실패");
			throw new RuntimeException();
		}else {
			System.out.println("게시글 삭제 성공");
		}
		
		return rs;
	}

	@Override
	public List<BoardDto> boardMemberId(Long memberId) {
		System.out.println("회원별 게시글 조회");
		BoardDao dao =BoardDao.getInstance();
		List<BoardEntity> boardEntities=dao.findListById(memberId);
		
		if(boardEntities.isEmpty()) {
			System.out.println("게시글 없음");
			throw new NullPointerException();
		}
		
		List<BoardDto> boardDtos=new ArrayList<BoardDto>();
		for(BoardEntity boardEntity: boardEntities) {
			BoardDto boardDto=BoardDto.toBoardDto(boardEntity);
			boardDtos.add(boardDto);
		}
		return boardDtos;
	}
	
	@Override
	public void delete(BoardDto boardDto) {
		System.out.println("게시글 삭제");
		MemberDao memberDao=MemberDao.getInsatance();
		MemberEntity memberEntity= memberDao.findById(boardDto.getMemberId());
		if(memberEntity==null) {
			System.out.println("회원정보 없음");
			throw new IllegalArgumentException();
		}
		
		BoardDao boardDao=BoardDao.getInstance();
		BoardEntity boardEntity=boardDao.findById(boardDto.getBoardId());
		
		if(boardEntity==null) {
			System.out.println("게시글 없음");
			throw new IllegalArgumentException();
		}
		if(!boardEntity.getMemberId().equals(boardDto.getMemberId())) {
			System.out.println("본인이 작성한 글만 삭제 가능합니다");
			throw new IllegalArgumentException();
		}
		
		boardDao.delete(boardEntity);
	}
	
	
}
