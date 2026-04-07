package org.java.java9.controller;

import java.util.Scanner;

import org.java.java9.service.ItemService;
import org.java.java9.service.impl.ItemDeleteServiceImpl;
import org.java.java9.service.impl.ItemInsertServiceImpl;
import org.java.java9.service.impl.ItemSelectServiceImpl;
import org.java.java9.service.impl.ItemUpdateServiceImpl;

public class ItemController {
	public static void main(String[] args) {
		System.out.println("상품관리 controller");
		Scanner input=new Scanner(System.in);
		
		ItemService service=null;
		while(true) {
			System.out.println("상품 쿼리문입력: ");
			String query=input.next();
			if(query.equals("insert")) {
				service=new ItemInsertServiceImpl();
				service.excuteQueryService();
			}else if(query.equals("update")) {
				service=new ItemUpdateServiceImpl();
				service.excuteQueryService();
			}else if(query.equals("select")) {
				service=new ItemSelectServiceImpl();
				service.excuteQueryService();
			}else if(query.equals("delete")) {
				service=new ItemDeleteServiceImpl();
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
