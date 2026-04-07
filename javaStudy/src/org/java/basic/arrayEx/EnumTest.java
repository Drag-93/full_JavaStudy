package org.java.basic.arrayEx;

import java.util.Scanner;

public class EnumTest {
	public static void main(String[] args) {
		System.out.println("enum(열거형");
		System.out.println(Role.ROLE_ADMIN);
		System.out.println(Role.ROLE_MANAGER);
		System.out.println(Role.ROLE_MEMBER);
		
		
		System.out.println(Role.valueOf("ROLE_ADMIN"));
		
		Role[] roles=Role.values();
		System.out.println(roles);
		
		for(Role role:roles) {
			System.out.println(role);
		}
		
		//switch, Scanner, Role활용
		//"권한을 입력하세요"
		//"관리자"면 -> 콘솔에 "ROLE_ADMIN"
		//"매니저"면 -> 콘솔에 "ROLE_MANEGER"
		//"일반회원"이면 -> 콘솔에 "ROLE_MEMBER"
		//위 3가지 이외에는 -> 콘솔에 "권한이 존재하지 않습니다. 관리자에게 문의 하세요"
		
		Scanner input =new Scanner(System.in);
		
		System.out.print("권한을 입력하세요: ");
		String str=input.next();
		
		switch(str) {
		case "관리자" :
			System.out.println(Role.ROLE_ADMIN);
			break;
		case "매니저" :
			System.out.println(Role.ROLE_MANAGER);
			break;
		case "일반회원" :
			System.out.println(Role.ROLE_MEMBER);
			break;
		default:
			System.out.println("권한이 존재하지 않습니다. 관리자에게 문의 하세요");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
