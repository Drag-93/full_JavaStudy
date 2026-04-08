package org.project.service.impl;

import java.util.List;

import org.project.dto.BoardDto;
import org.project.entity.BoardEntity;
import org.project.entity.MemberEntity;
import org.project.service.BoardService;
import org.project.service.dao.BoardDao;
import org.project.service.dao.MemberDao;

public class BoardServiceImpl implements BoardService{
	private final BoardDao bDao=BoardDao.getInstance();
	private final MemberDao mDao=MemberDao.getInstance();
	
	@Override
	public int boardInsert(BoardDto boardDto) {
		MemberEntity memberEntity=mDao.findById(boardDto.getMemberId());
		if(memberEntity==null) {
			System.out.println("등록되지 않은 회원");
			throw new IllegalArgumentException();
		}
		
		BoardEntity boardEntity=BoardEntity.toInsertBoardEntity(boardDto);
		int rs = bDao.save(boardEntity);
		if(rs==1) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		return rs;
	}

	@Override
	public int boardUpdate(BoardDto boardDto) {
		BoardEntity boardEntity=bDao.findById(boardDto.getBoardId());
		if(boardEntity==null) {
			System.out.println("게시글이 없습니다");
			throw new IllegalArgumentException();
		}
		MemberEntity memberEntity=mDao.findById(boardDto.getMemberId());
		if(memberEntity==null) {
			System.out.println("등록되지 않은 회원");
			throw new IllegalArgumentException();
		}
		if(!boardEntity.getMemberId().equals(boardDto.getMemberId())) {
			System.out.println("작성자 다름");
			throw new IllegalArgumentException();
		}
		int rs=bDao.saveUpdate(BoardEntity.toUpdateBoardEntity(boardDto));
		if(rs==1) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		return rs;
	}

	@Override
	public int boardDelete(Long boardId) {
		BoardEntity boardEntity=bDao.findById(boardId);
		if(boardEntity==null) {
			System.out.println("게시글이 없습니다");
			throw new IllegalArgumentException();
		}
		int rs=bDao.delete(boardId);
		
		return rs;
	}

	@Override
	public BoardDto boardDetail(Long boardId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardDto> boardList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardDto> findByMemberId(Long memberId) {
		// TODO Auto-generated method stub
		return null;
	}

}
