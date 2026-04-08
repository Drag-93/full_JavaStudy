package org.project.controller;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;
	import java.util.Scanner;

import org.project.dto.BoardDto;
import org.project.dto.MemberDto;
import org.project.service.BoardService;
import org.project.service.MemberService;
import org.project.service.impl.BoardServiceImpl;
import org.project.service.impl.MemberServiceImpl;

		public class BoardController {

		public static void main(String[] args) {

			System.out.println("BoardController");

			Scanner input = new Scanner(System.in);

			boolean bool = false;

			while (!bool) {
				System.out.println("프로그램 시작?(exit)");
				String q = input.next();

				BoardService service = new BoardServiceImpl();
				if (!q.equals("exit")) {

					while (!bool) {

						System.out.println("쿼리문 입력(insert,update,delete,select,email,detail(id))?(exit)");

						String query = input.next();
						if (query.equals("insert")) {
							System.out.println("title: ");
							String title = input.next();
							System.out.println("content: ");
							String content = input.next();
							System.out.println("boardPw: ");
							String boardPw = input.next();
							System.out.println("nickName: ");
							String nickName = input.next();
							System.out.println("memberId: ");
							Long memberId=input.nextLong();
							

							service.boardInsert(new BoardDto(null, title, content, boardPw, nickName, 0, memberId));

							} else if (query.equals("update")) {
							//게시글 유무 체크
							System.out.print("boardId: ");
							Long boardId=input.nextLong();
//							service.boardDetail(boardId);
							System.out.println("title: ");
							String title = input.next();
							System.out.println("content: ");
							String content = input.next();
							System.out.println("boardPw: ");
							String boardPw = input.next();
							System.out.println("nickName: ");
							String nickName = input.next();
							System.out.println("memberId: ");
							Long memberId=input.nextLong();
							
							service.boardUpdate(new BoardDto(boardId, title, content, boardPw, nickName, 0, memberId));
							
							
						} else if (query.equals("select")) {
							Map<String, List<BoardDto>> map = new HashMap<String, List<BoardDto>>();

							List<BoardDto> boardDtos = service.boardList();

							// Controller -> return (조회-> 회원리스트)
							map.put("boardList", boardDtos);
							// View, React
							map.get("boardList").forEach(board -> System.out.println(board));

						} else if (query.equals("delete")) {
							// id
							System.out.print("boardId: ");
							Long boardId=input.nextLong();
							BoardDto boardDto=service.boardDetail(boardId);
							// 회원삭제
							service.boardDelete(boardId);
							
							
						} else if (query.equals("exit")) {
							System.out.println("종료!!");
							bool = true;
						}
					}
				} else {
					System.out.println("종료!!");
					bool = true;
				}

			}
		}
	}

