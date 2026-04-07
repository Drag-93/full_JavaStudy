package org.java.basic.operatorEx;

public class OperatorEx7 {
	public static void main(String[] args) {
		System.out.println("삼항연산자");
		
		
		int num= 5>0?1:0;
		System.out.println(num);
		
		int i =5;
		if(i>0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
		if(i>0)System.out.println(1);
		else System.out.println(0);
		
		String role = "ROLE_ADMIN";
		
		String roleMember = role.equals("ROLE_ADMIN")? "관리자 권한":"일반 권한";
		
		System.out.println(roleMember);
		

		
		

		
		
		
	}
}
