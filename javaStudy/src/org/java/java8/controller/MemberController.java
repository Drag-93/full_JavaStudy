package org.java.java8.controller;

import java.util.Scanner;

import org.java.java8.service.MemberService;
import org.java.java8.service.impl.MemberDeleteServiceImpl;
import org.java.java8.service.impl.MemberInsertServiceImpl;
import org.java.java8.service.impl.MemberSelectServiceImpl;
import org.java.java8.service.impl.MemberUpdateServiceImpl;

public class MemberController {

	public static void main(String[] args) {
		System.out.println("회원관리 Controller");
		
		Scanner input=new Scanner(System.in);

		MemberService service=null;
		while(true) {
		System.out.print("회원 쿼리문입력: ");
		
		String query=input.next();
		if(query.equals("insert")) {
			service=new MemberInsertServiceImpl();
			service.excuteQueryService();
		}else if(query.equals("update")) {
			service= new MemberUpdateServiceImpl();
			service.excuteQueryService();
		}else if(query.equals("select")) {
			service= new MemberSelectServiceImpl();
			service.excuteQueryService();
		}else if(query.equals("delete")) {
			service= new MemberDeleteServiceImpl();
			service.excuteQueryService();
		}else if(query.equals("exit")){
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

