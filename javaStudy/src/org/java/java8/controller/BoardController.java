package org.java.java8.controller;

import java.util.Scanner;

import org.java.java8.service.BoardService;
import org.java.java8.service.impl.BoardDeleteServiceImpl;
import org.java.java8.service.impl.BoardInsertServiceImpl;
import org.java.java8.service.impl.BoardSelectServiceImpl;
import org.java.java8.service.impl.BoardUpdateServiceImpl;

public class BoardController {
public static void main(String[] args) {
	System.out.println("상품관리 controller");
	
	Scanner input = new Scanner(System.in);
	
	BoardService service=null;
	
	while(true) {
		System.out.println("게시판 쿼리문입력: ");
		String query=input.next();
		if(query.equals("insert")) {
			service=new BoardInsertServiceImpl();
			service.excuteQueryService();
		}else if(query.equals("update")) {
			service=new BoardUpdateServiceImpl();
			service.excuteQueryService();
		}else if(query.equals("select")) {
			service=new BoardSelectServiceImpl();
			service.excuteQueryService();
		}else if(query.equals("delete")) {
			service=new BoardDeleteServiceImpl();
			service.excuteQueryService();
		}else if(query.equals("exit")) {
			System.out.println("서비스 종료");
			break;
		}else {
			System.out.println("쿼리문 입력 오류, 다시 입력해주세요");
			continue;
		}		
		break;
		}
	input.close();
}
}
