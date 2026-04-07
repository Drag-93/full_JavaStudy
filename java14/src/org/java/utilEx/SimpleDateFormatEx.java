package org.java.utilEx;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatEx {
	public static void main(String[] args) {

		System.out.println("=== SimpleDateFormat ===");
		// 1. 날짜 생성
		Date date1 = new Date(); // 자동으로 -> 시스템 기본 시간
		// 2. 날짜 포맷
		SimpleDateFormat sf = new SimpleDateFormat("YYYY년 MM월 dd일 hh:mm:ss", Locale.KOREA);
		// 3. 날짜 포맷 -> 날짜를 추가 -> String
		String now = sf.format(date1);
		System.out.println(now);

	}
}
