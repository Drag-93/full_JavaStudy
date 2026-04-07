package org.java.java10.javaApi;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class SystemEx {

	public static void main(String[] args) {	
		
		System.out.println("System -> java.lang.System");

		System.out.println("print");
		System.out.print("출력 -> 줄바꿈 X \t (tab) \n");
		System.out.print("출력 -> 줄바꿈 X (줄바꿈-계행) \n");
		
		System.out.println("println -> 오버로딩");
		System.out.println("출력 -> 줄바꿈 O ");
		//매서드 오버로딩
		System.out.println(LocalDateTime.now());/// LocalDateTime.now() 현재날짜+시간
		System.out.println(new Date());
		System.out.println(new int[] { 1, 2, 3, 4, 5 });

		System.out.println("printf -> 서식문자");
		// "서식문자 %", 값
		System.out.printf("나이 %d, 이름 %s \n", 10, "김이름");
		System.out.printf("실수 %.3f", 15.432);

		System.out.println(" Print in -> 줄바꿈 X");

		Scanner input = new Scanner(System.in);
		System.out.print("입력: ");
		
		String rs=input.next();
		
		if(rs.equals("exit")) {
			System.out.println("시스템 종료");
			// 시스템종료
			System.exit(0);
			
		}
//		int inData = input.nextInt();
		System.out.println("출력: " + rs);

		input.close();
		//시스템 시간
		System.currentTimeMillis();
		System.nanoTime();
		
		System.out.println(System.currentTimeMillis());
		System.out.println(System.nanoTime());
		
	}
}