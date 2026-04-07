package org.java.java9.service.impl;

import java.util.Scanner;

import org.java.java9.dao.ItemDao;
import org.java.java9.service.ItemService;

public class ItemDeleteServiceImpl implements ItemService{
	@Override
	public void excuteQueryService() {
		System.out.println("상품 삭제");
		
			ItemDao dao= ItemDao.getInstance();
			
			Scanner input=new Scanner(System.in);
			
			while(true) {
								
				System.out.println("상품삭제실행(q면종료)");
				String q=input.next();
				
				if(q.equals("q")) {
					System.out.println("종료");
					break;
				}
				System.out.print("상품 아이디 입력: ");
				int memberId=input.nextInt();
				
				int rs=dao.deleteById(memberId);
				
				if(rs!=1) {
					System.out.println("상품삭제 실패");
				}else {
					System.out.println("상품삭제 성공");
				}
				
			}
			
			input.close();
		}
}