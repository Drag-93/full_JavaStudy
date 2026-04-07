package org.java.basic.conditionEx;

import java.util.Scanner;

public class SwitchEx3 {
	public static void main(String[] args) {
		System.out.println("switch");
		
		System.out.println(UserRole.ROLE_ADMIN);
		System.out.println(UserRole.ROLE_MANAGER);
		System.out.println(UserRole.ROLE_MEMBER);
				
		UserRole role = new UserRole();
		role.name="n1";
		role.age=11;
		role.num1=100;
		role.sum();
		role.instanceMethod();
	
		//관리자,매니저,일반권한에 따라 콘솔에 출력
		//Scanner, switch 이용 UserRole 이용
		//입력값이 관리자면 UserRole.ROLE_ADMIN
		//입력값이 매니저면 UserRole.ROLE_MANAGER
		//입력값이 일반이면 UserRole.ROLE_MEMBER
		//나머지는 권한이 없습니다 -> 콘솔에 출력
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("권한 입력: ");
		String user = input.next();
		String userRole="";
		switch(user) {
		case "관리자":
			userRole=UserRole.ROLE_ADMIN;
			break;
		case "매니저":
			userRole=UserRole.ROLE_MANAGER;
			break;
		case "일반":
			userRole=UserRole.ROLE_MEMBER;
			break;
		default:
			System.out.println("권한이 없습니다.");
		return;
		}
		System.out.println("설정된 권한: "+userRole);
		input.close();
	}
}
