package java15.org.java.time;

import java.time.LocalDateTime;



public class LocalDateTimeEx3 {
	public static void main(String[] args) {
		
		//이전? 이후? 같음?
		
		LocalDateTime startTime = LocalDateTime.now();
		System.out.println(startTime);
		
		LocalDateTime endTime = LocalDateTime.of(202, 12,20,16,30,20);
		System.out.println(endTime);
		
		//이전)
		boolean bool = startTime.isBefore(endTime);
		if(!bool) {
			System.out.println("예약시작일은 예약 종료일보다 이전 일 이어야합니다");
		}else{
			System.out.println("예약가능합니다,예약일을 선택해 주십시오");
			System.out.println("예약가능일: "+endTime);
		}
		//같음?
		boolean bool2 = startTime.equals(endTime);
		if(!bool2) {
			System.out.println("두 비교일자가 일치하지 않습니다");
		}
		//이후?
		boolean bool3 = startTime.isAfter(endTime);
		if(!bool3) {
			System.out.println("예약시작일은 예약 종료일보다 이전 일 이어야합니다");
		}else{
			System.out.println("예약가능합니다,예약일을 선택해 주십시오");
			System.out.println("예약가능일: "+endTime);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
