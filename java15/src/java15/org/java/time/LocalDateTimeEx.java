package java15.org.java.time;

import java.time.LocalDateTime;

public class LocalDateTimeEx {
public static void main(String[] args) {
	
	System.out.println("LocalDateTime");
	
	LocalDateTime localDateTime =LocalDateTime.now();
	
	System.out.println(localDateTime);
	System.out.println(localDateTime.getYear());		//연
	System.out.println(localDateTime.getMonthValue());	//월
	System.out.println(localDateTime.getDayOfMonth());	//일
	System.out.println(localDateTime.getHour());		//시
	System.out.println(localDateTime.getMinute());		//분
	System.out.println(localDateTime.getSecond());		//초
	System.out.println(localDateTime.getNano());		//나노
	System.out.println(localDateTime.getDayOfWeek());	//요일
	
	System.out.println(localDateTime.getYear()+"년 "
	+localDateTime.getMonthValue()+"월 "
	+localDateTime.getDayOfMonth()+"일 "
	+localDateTime.getHour()+":"
	+localDateTime.getMinute()+":"+
	+localDateTime.getSecond());
	
	System.out.println();
	//예약 날짜, 시간
	
	LocalDateTime localDateTime2 =LocalDateTime.of(2026,4,1,12,30,22);
	
	System.out.println(localDateTime2);
	System.out.println(localDateTime2.getYear());		//연
	System.out.println(localDateTime2.getMonthValue());	//월
	System.out.println(localDateTime2.getDayOfMonth());	//일
	System.out.println(localDateTime2.getHour());		//시
	System.out.println(localDateTime2.getMinute());		//분
	System.out.println(localDateTime2.getSecond());		//초
	System.out.println(localDateTime2.getNano());		//나노
	System.out.println(localDateTime2.getDayOfWeek());	//요일
	
	System.out.println(localDateTime2.getYear()+"년 "
			+localDateTime2.getMonthValue()+"월 "
			+localDateTime2.getDayOfMonth()+"일 "
			+localDateTime2.getHour()+":"
			+localDateTime2.getMinute()+":"+
			+localDateTime2.getSecond());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
