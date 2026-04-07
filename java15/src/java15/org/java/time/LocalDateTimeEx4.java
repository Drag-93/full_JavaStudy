package java15.org.java.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeEx4 {
public static void main(String[] args) {
	System.out.println("LocalDateTime");
	//날짜 비교
	LocalDateTime startDateTime = LocalDateTime.now();//오늘
	LocalDateTime endDateTime = LocalDateTime.of(2026, 11,18,23,59,59);
	System.out.println("기준날짜: "+ startDateTime);
	System.out.println("비교날짜: "+ endDateTime);
	System.out.println("========Duration========"); //싱글톤 -> 초,정확한 시가계산
	Duration duration = Duration.between(startDateTime, endDateTime);
	System.out.println("초: "+ duration.getSeconds()); //하루 -> 24*60*60 
	System.out.println("나노초: "+duration.getNano());
	
	System.out.println("========Period========"); //년,월,일 -> 기준365이상 년+1
	LocalDate startDate = LocalDate.of(2026, 2, 20);
	LocalDate endDate = LocalDate.of(2026, 10, 18);
	Period period = Period.between(startDate, endDate);
	System.out.println("Years: " + period.getYears());
	System.out.println("Years: " + period.getMonths());
	System.out.println("Years: " + period.getDays());
	
	System.out.println ("========ChronoUnit========");//객체 생성 없이 사용가능
	LocalDateTime sTime = LocalDateTime.now();
	LocalDateTime etime = LocalDateTime.of(2026,12,31,10,59,59);
	long months = ChronoUnit.MONTHS.between(sTime, etime);
	long weeks = ChronoUnit.WEEKS.between(sTime, etime);
	long days = ChronoUnit.DAYS.between(sTime, etime);
	long hours = ChronoUnit.HOURS.between(sTime, etime);
	long minutes = ChronoUnit.MINUTES.between(sTime, etime);
	long seconds = ChronoUnit.SECONDS.between(sTime, etime);
	System.out.println("Months: "+months);
	System.out.println("Weeks: "+weeks);
	System.out.println("Days: "+days);
	System.out.println("Hours: "+hours);
	System.out.println("Minutes: "+minutes);
	System.out.println("Seconds: "+seconds);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
}
