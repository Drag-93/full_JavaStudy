package java15.org.java.time;

import java.time.LocalTime;

public class LocalTimeEx {
	public static void main(String[] args) {
		System.out.println("LocalTime");
		
		LocalTime localTime = LocalTime.now();
		
		System.out.println(localTime);
		System.out.println(localTime.getHour());	//시
		System.out.println(localTime.getMinute());	//분
		System.out.println(localTime.getSecond());	//초
		System.out.println(localTime.getNano());	//나노 -> 나노초(nanosecond,ns)는 10억분의 1초
		
		System.out.println(localTime.getHour()+"시 "+localTime.getMinute()+"분 "+ localTime.getSecond()+"초");
		
		System.out.println("예약 시간");
		LocalTime localTime2 = LocalTime.of(14, 20,0 );
		System.out.println(localTime2);
		System.out.println(localTime2.getHour());	//시
		System.out.println(localTime2.getMinute());	//분
		System.out.println(localTime2.getSecond());	//초
		System.out.println(localTime2.getNano());	//나노 -> 나노초(nanosecond,ns)는 10억분의 1초
		
		System.out.println(localTime2.getHour()+"시 "+localTime2.getMinute()+"분 "+ localTime2.getSecond()+"초");
		
		
		
		
		
	}
}
