package org.java.java9.innerClasss;

import java.util.Scanner;

public class SingletonExMain {

	public static void main(String[] args) {
		System.out.println("싱글톤");

////		new SingletonEx();
//		// static-> 내부클래스 -> 객체 생성 (한번만)
//
		SingletonEx singletonEx = SingletonEx.getInstance();
//
		// while,scanner, while
		// insert -> singletonEx.insert();
		// update -> singletonEx.update();
		// delete -> singletonEx.delete();
		// select -> singletonEx.select();
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("쿼리문입력(exit종료)");

			String q=input.next();
			
			if (q.equals("exit")) {
				System.out.println("종료");
				break;
			}
			if (q.equals("insert")) {
				singletonEx.insert();
			} else if (q.equals("update")) {
				singletonEx.update();
			} else if (q.equals("delete")) {
				singletonEx.delete();
			} else if (q.equals("select")) {
				singletonEx.select();
			}

		}

		input.close();

	}
}
