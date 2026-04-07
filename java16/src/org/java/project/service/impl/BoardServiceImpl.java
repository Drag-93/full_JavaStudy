package org.java.project.service.impl;

import java.util.List;

import org.java.project.dao.BoardDao;
import org.java.project.dto.BoardDto;
import org.java.project.service.BoardService;

public class BoardServiceImpl implements  BoardService{

	@Override
	public int boardInsert(BoardDto boardDto) {
		
		BoardDao dao=BoardDao.getInstance();
		
		
		
		return 0;
	}

	@Override
	public List<BoardDto> boardList() {
		// TODO Auto-generated method stub
		return null;
	}

}
