package org.java.java9.service.impl;

import java.util.List;
import java.util.Scanner;

import org.java.java9.dao.ItemDao;
import org.java.java9.dto.ItemDto;
import org.java.java9.service.ItemService;

public class ItemSelectServiceImpl implements ItemService{
	@Override
	public void excuteQueryService() {
		System.out.println("상품 조회");
		
		ItemDao dao=ItemDao.getInstance();
		
		Scanner input =new Scanner(System.in);
		
		while(true) {
			System.out.println("상품목록 조회(q면 종료)");
			String q=input.next();
			if(q.equals("q")) {
				System.out.println("종료");
				break;
			}
		
			List<ItemDto> rs=dao.findAll();
			
			if(rs==null) {
				System.out.println("상품목록이 없습니다");
			}else {
				System.out.println("상품목록 조회 성공");
				
				//List 객체의 모든 요소를 조회
				for(ItemDto items:rs) {
					System.out.println(items);
				}
			}
		}
		input.close();
	}
}