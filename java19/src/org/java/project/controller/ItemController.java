package org.java.project.controller;

import java.time.LocalDateTime;
import java.util.Scanner;import org.java.project.dto.ItemDto;
import org.java.project.service.ItemService;
import org.java.project.service.impl.ItemServiceImpl;

public class ItemController {
	public static void main(String[] args) throws Exception {
		System.out.println("ItemController");
		
		Scanner input = new Scanner(System.in);
		boolean bool = false;
		ItemService service=null;
		
		
		while(!bool) {
			service =new ItemServiceImpl();
			System.out.println("프로그램 실행");
			String q = input.next();
			
			if(!q.equals("exit")) {
				System.out.print("쿼리문 입력: ");
				
				String query=input.next();
				if(query.equals("insert")) {
					System.out.print("상품명: ");
					String title=input.next();
					System.out.print("상세내역: ");
					String content=input.next();
					System.out.print("멤버아이디: ");
					Long memberId=input.nextLong();
					
					int rs=service.insertItem(new ItemDto(1L, title, content, memberId, LocalDateTime.now(), null));
					
					if(rs==1) {
						System.out.println("상품등록 성공");
					}else {
						System.out.println("상품등록 실패");
					}
				}
				else if(query.equals("select")) {
					
					
					
					
				}else if(query.equals("exit")) {
					System.out.println("종료");
					break;
				}else {
					System.out.println("쿼리문 입력 오류");
				}
			}else {
				System.out.println("종료");
				bool=true;
			}
		}
		
		input.close();
	}
}
