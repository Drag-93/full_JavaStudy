package org.java.utilEx;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx2 {

	public static void main(String[] args) {

		System.out.println("=== Date ===");

		Date date1 = new Date();
		System.out.println(date1);
		// 년-1900,달-1
		Date date2 = new Date(124, 10, 13);
		System.out.println(date2);

		Date date3 = new Date(124, 10, 13, 15, 35, 40); // 저장되어 있는 시간으로 조회
		System.out.println(date3);

		System.out.println();
		Date date4 = new Date();
		// 1.포맷
		SimpleDateFormat sf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//		SimpleDateFormat sf1= new SimpleDateFormat("yyyy년 MM월 dd일 hh시mm분ss초");
//		SimpleDateFormat sf1 = new SimpleDateFormat("yy년M월d일 h시m분s초");
		// 2. 포맷에 날짜, 추가
		String today = sf1.format(date4);// 날짜를 SimpleDateFormat(날짜)
		// 3. 보기
		System.out.println(today);

	}
}
