package org.java.utilEx;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatEx {

	public static void main(String[] args) {

		System.out.println("=== DateFormat ===");

		// 1. 날짜 생성
		Date date1 = new Date();
		// 2. 날짜 포맷-> DateFormat "싱글톤패턴"
		DateFormat df = DateFormat.getInstance();
		String now = df.format(date1);
		// 26. 3. 26. 오전 11:45
		System.out.println(now);
		// 2026. 3. 26.
		DateFormat df2 = DateFormat.getDateInstance();// 날짜만
		System.out.println(df2.format(date1));
		// 2026년 3월 26일 목요일
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, Locale.KOREA);
		System.out.println(df3.format(date1));
		// 2026. 3. 26.
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(df4.format(date1));
		// 2026년 3월 26일
		DateFormat df5 = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(df5.format(date1));
		// 26. 3. 26.
		DateFormat df6 = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(df6.format(date1));
		// 2026. 3. 26.
		DateFormat df7 = DateFormat.getDateInstance(DateFormat.DEFAULT);
		System.out.println(df7.format(date1));
		System.out.println(" 날짜// 시간// 지역 ");
		// 1. 날짜// 시간// 지역 형식 설정
		// 2026년 3월 26일 목요일 오전 11시 45분 5초 KST
		DateFormat df8 = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.LONG, Locale.KOREA);
		String currentTime = df8.format(date1);
		System.out.println(currentTime);

	}
}
