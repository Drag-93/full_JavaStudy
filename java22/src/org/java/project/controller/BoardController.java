package org.java.project.controller;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.java.project.dto.BoardDto;
import org.java.project.service.BoardService;
import org.java.project.service.impl.BoardServiceImpl;

public class BoardController {
	public static void main(String[] args) {
		System.out.println("게시글 서비스");
		 
			Boolean bool=false;
			Scanner input=new Scanner(System.in);
			BoardService service=null;
			
			
			while(!bool) {
				System.out.print("서비스 실행(exit: 종료)");
				String q=input.next();
				if(!q.equals("exit")) {
					service=new BoardServiceImpl();
					while(!bool) {
					
						System.out.println("쿼리문 입력");
						String query=input.next();
						if(query.equals("insert")) {
							System.out.println("게시글 작성");
							System.out.println("id: ");
							Long memberId=input.nextLong();
							System.out.print("title: ");
							String title=input.next(); 
							System.out.print("content: ");
							String content=input.next();
							
							BoardDto boardDto=new BoardDto(null, title, content, memberId, null, null);
							
							try {
								int rs =service.insertBoard(boardDto);
								if(rs==1) {
									System.out.println("게시글 작성 성공");
								}else {
									System.out.println("게시글 작성 실패");
								}
							} catch (IOException e) {
								e.printStackTrace();
							}
						}else if(query.equals("update")) {
							System.out.println("게시글 수정");
							System.out.println("memberId: ");
							Long memberId=input.nextLong();
							System.out.println("boardId: ");
							Long boardId=input.nextLong();
							System.out.print("title: ");
							String title=input.next(); 
							System.out.print("content: ");
							String content=input.next();
							
							BoardDto boardDto=new BoardDto(boardId, title, content, memberId, null, null);
							
							int rs =service.updateBoard(boardDto);
								if(rs==1) {
									System.out.println("게시글 작성 성공");
								}else {
									System.out.println("게시글 작성 실패");
								}
						}else if(query.equals("delete")) {
							System.out.println("게시글 삭제");
							System.out.print("memberId: ");
							Long memberId=input.nextLong();
							System.out.print("boardId: ");
							Long boardId=input.nextLong();
							
							BoardDto boardDto =new BoardDto(boardId, null, null, memberId, null, null);
							try {
							service.delete(boardDto);
							System.out.println("게시글 삭제 성공");
							}catch(Exception e) {
								e.printStackTrace();
								System.out.println("게시글 삭제 실패");
							}
			
					
//						}else if(query.equals("delete")) {
//							System.out.println("게시글 삭제");
////							System.out.println("memberId: ");
////							Long memberId=input.nextLong();
//							System.out.println("boardId: ");
//							Long boardId=input.nextLong();
//							
//							int rs=service.boardDelete(boardId);
//							
//							if(rs==1) {
//								System.out.println("게시글 삭제 성공");
//							}else {
//								System.out.println("게시글 삭제 실패");
//							}
							
						}else if(query.equals("select")) {
							System.out.println("게시글 목록 조회");
							List<BoardDto> boardDtos=service.boardList();
						if(boardDtos!=null) {
							boardDtos.forEach(System.out::println);
						}
						
						}else if(query.equals("detail")) {
							System.out.println("게시글 상세 조회");
							System.out.println("boardId: ");
							Long boardId=input.nextLong();
							
							BoardDto boardDto=service.boardDetail(boardId);
							
							System.out.println(boardDto);
							
							
						}else if(query.equals("member")) {
							System.out.println("회원별 게시글 목록 조회");
							System.out.print("memberId: ");
							Long memberId=input.nextLong();
							List<BoardDto> boardDtos=service.boardMemberId(memberId);
						if(boardDtos!=null) {
							boardDtos.forEach(System.out::println);
						}
						}else if(query.equals("exit")) {
							System.out.println("종료");
							bool=true;
						}else {
							System.out.println("쿼리문 입력 오류");
						}
					}
				}
				else {
					System.out.println("서비스 종료");
					bool=true;
				}
				
			}
		
	}
}
