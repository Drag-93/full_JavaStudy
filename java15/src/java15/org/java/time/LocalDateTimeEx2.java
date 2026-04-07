package java15.org.java.time;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeEx2 {
public static void main(String[] args) {
	System.out.println("LocalDateTime");
	System.out.println("국제표준 UTC");
	//국제표준 UTC
	ZonedDateTime utcZonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
	System.out.println(utcZonedDateTime);
	//서울  UTC+9
	ZonedDateTime seoulZoneDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
	System.out.println(seoulZoneDateTime);
	System.out.println();
	
	System.out.println("두 날짜 비교1");
	LocalDate today = LocalDate.now();
	LocalDate oldDate = LocalDate.of(2017, 10, 11);
	
	//비교일로부터 오늘까지의 날짜 차이 계산
	Period period = today.until(oldDate);
	System.out.println(period);
	System.out.println(today);
	System.out.println(oldDate);
	System.out.println(period.getYears()); //년  2017 - 2026 -> -8
	System.out.println(period.getMonths());//월  3 - 10 -> -5(일까지 포함)
	System.out.println(period.getDays());  //일  27 - 11 -> -16 
	
	if(period.getDays()>0) {
		System.out.println("시작일이 비교일보다 크거나 같아야 됩니다.");
	}
	System.out.println();
	
	System.out.println("ChronoUnit");
	//날짜 차이 비교 -> 특정 날짜의 차이- > ChronoUnit -> new X -> 년까지 포함한 월,일 차이
	long days =ChronoUnit.DAYS.between(today, oldDate);
	System.out.println(days);
	System.out.println(ChronoUnit.MONTHS.between(today, oldDate));
	System.out.println(ChronoUnit.YEARS.between(today, oldDate));
	
	if(days>0) {
		System.out.println("시작일이 비교일보다 크거나 같아야 됩니다.");
	}
}
}
