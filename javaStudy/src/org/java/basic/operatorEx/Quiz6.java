package org.java.basic.operatorEx;

import java.util.Scanner;

public class Quiz6 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		
		
		while(true) {
			System.out.println("쿼리를 입력해 주세요");
			String query=input.next();
			if(query.equals("insert")) {
				System.out.println("회원 가입페이지로 이동합니다");}
			else if(query.equals("update")) {
				System.out.println("회원 수정페이지로 이동합니다");}
			else if(query.equals("select")) {
				System.out.println("회원 조회페이지로 이동합니다");}
			else if(query.equals("delete")) {
				System.out.println("회원 탈퇴페이지로 이동합니다");}
			else if(query.equals("exit")) {
				System.out.println("프로그램을 종료하겠습니다");
				break;}
			else {
				System.out.println("쿼리문 입력오류입니다");}
			
		}
		
		input.close();
		
		
	}
}
