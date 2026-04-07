package org.java.java9.service.impl;

import java.time.LocalDateTime;
import java.util.Scanner;

import org.java.java9.dao.ItemDao;
import org.java.java9.dto.ItemDto;
import org.java.java9.service.ItemService;

public class ItemInsertServiceImpl implements ItemService{
	@Override
	public void excuteQueryService() {
		System.out.println("상품 등록");
		
		
		
		ItemDao dao=ItemDao.getInstance();
		Scanner input=new Scanner(System.in);
		
		while(true) {
			System.out.println("상품등록 실행(q면 종료)");
			String q=input.next();
			if(q.equals("q")) {
				System.out.println("종료");
				break;
			}
			System.out.print("아이디 입력: ");
			int itemId=input.nextInt();
			
			System.out.print("상품 이름 입력:  ");
			String itemTitle=input.next();
			
			System.out.print("상품 상세내역 입력: ");
			String itemDetail=input.next();
			
			System.out.print("상품 가격 입력: ");
			int price=input.nextInt();
			
			System.out.print("상품 재고량 입력: ");
			int inventory=input.nextInt();
			
			System.out.print("상품 등록자 입력: ");
			String registrator=input.next();
			
			ItemDto dto=new ItemDto(itemId, itemTitle, itemDetail, price, inventory, registrator, LocalDateTime.now(), null);
			int rs=dao.save(dto);
			
//			int rs=dao.save(itemId, itemTitle, itemDetail, price, inventory, registrator, LocalDateTime.now(), null);
			System.out.println(rs);
		
		
		if(rs!=1) {
			System.out.println("상품등록 실패");
			
		}else {
			System.out.println("상품등록 성공");
		}
		}
		input.close();	
	}
}
