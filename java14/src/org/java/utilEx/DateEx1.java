package org.java.utilEx;

import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) {

		System.out.println("=== Date ===");

		Date date = new Date();

		System.out.println(date);
		System.out.println((date.getYear() + 1900) + "년");// 1900+126
		System.out.println(date.getMonth() + 1 + "월");
		System.out.println(date.getDate() + "일");
		System.out.println(date.getHours() + "시");
		System.out.println(date.getMinutes() + "분");
		System.out.println(date.getSeconds() + "초");
		System.out.println(date.getDay()); // 일요일 -> 0, 4(목요일)
		System.out.println(date.getTime());// 1970년 1월1일 00:00:00을 기준
		System.out.println(date.getTimezoneOffset());

		System.out.println();
		String week = "";
		switch (date.getDay()) {
		case 0:
			System.out.println("일요일");
			break;
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			week = "수요일";
			break;
		case 4:
			System.out.println("목요일");
			break;
		case 5:
			System.out.println("금요일");
			break;
		case 6:
			System.out.println("토요일");
			break;
		case 7:
			System.out.println("일요일");
			break;
		default:
			System.out.println("해당 요일이 없습니다");
			// 해당되는 요일 없으면(매개인자) 예외 발생
			throw new IllegalArgumentException();
		}

		Date date2 = new Date();
		// 현재 날짜시간 -> 콘솔에 출력
		String rs = (1900 + date2.getYear()) + "년 " + (date2.getMonth() + 1) + "월 " + date2.getDate() + "일 "
				+ date2.getHours() + "시 " + date2.getMinutes() + "분 " + date2.getSeconds() + "초 " + week;

		System.out.println(rs);

	}
}
