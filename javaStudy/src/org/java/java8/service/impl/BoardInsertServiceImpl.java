package org.java.java8.service.impl;

import java.time.LocalDateTime;
import java.util.Scanner;

import org.java.java8.dto.BoardDto;
import org.java.java8.service.BoardService;

public class BoardInsertServiceImpl implements BoardService{
	@Override
	public void excuteQueryService() {
	System.out.println("게시글 작성");
	
	Scanner input = new Scanner(System.in);
	
	while(true) {
		System.out.println("게시글작성 실행(q면 종료)");
		String q=input.next();
		if(q.equals("q")) {
			System.out.println("종료");
			break;
		}
		System.out.print("아이디 입력: ");
		Long boardId=input.nextLong();
		
		System.out.print("제목 입력: ");
		String title = input.next();
		
		System.out.print("내용 입력: ");
		input.nextLine();
		String content = input.nextLine();

		System.out.print("회원 아이디: ");
		Long memberId=input.nextLong();
		
															//조회수 기본 0	
		BoardDto board=new BoardDto(boardId, title, content, 0, memberId, LocalDateTime.now(), null);
		
		String rs=board.toString();
		System.out.println(rs);
		
		if(rs!=null) {
			System.out.println("게시글 작성 성공");
			break;
		}else {
			System.out.println("게시글 작성 실패");
		}
	}
	input.close();
		
	}
}
