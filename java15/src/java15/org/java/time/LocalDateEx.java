package java15.org.java.time;

import java.time.LocalDate;

public class LocalDateEx {
public static void main(String[] args) {
	System.out.println("LocalDate");
	
//	LocalDate.now(); //현재 시스템시간
	LocalDate localDate = LocalDate.now();
	
	System.out.println(localDate);
	System.out.println(localDate.getYear());			//년 2026
	System.out.println(localDate.getMonthValue());		//월	3
	System.out.println(localDate.getMonth());			//월 MARCH
	System.out.println(localDate.getDayOfMonth());		//일 27
	System.out.println(localDate.getDayOfYear());		//일 86
	System.out.println(localDate.getDayOfWeek());		//요일 FRIDAY
	
	//2026년 3월 27일 FRIDAY
	System.out.println(localDate.getYear()+"년 "+localDate.getMonthValue()+"월 "+localDate.getDayOfMonth()+"일 "+localDate.getDayOfWeek());
	
	System.out.println();
	
	//예약(날짜)
	LocalDate localDate2 = LocalDate.of(2026, 3, 31);
	System.out.println(localDate2);
	
	System.out.println();
	System.out.println(localDate2.getYear());			//년 2031
	System.out.println(localDate2.getMonthValue());		//월	3
	System.out.println(localDate2.getMonth());			//월 MARCH
	System.out.println(localDate2.getDayOfMonth());		//일 31
	System.out.println(localDate2.getDayOfYear());		//일 90
	System.out.println(localDate2.getDayOfWeek());		//요일 TUESDAY
	
	
	
	
	
	
	
}
}
