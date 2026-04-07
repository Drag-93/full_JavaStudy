package java15.org.java.time;

import java.time.LocalDateTime;
import java.util.Scanner;

import java15.org.java.dto.FullCalenderDto;

public class LocalDateTimeTest1 {
	public static void main(String[] args) {
		System.out.println("예약 -> 시작일,종료일 입력");
		
		Scanner input =new Scanner(System.in);
		while(true) {
			System.out.print("예약프로그램을 시작하시겠습니까?(y,n): ");
			String q = input.next();
			
			if(q.equals("n")) {
				System.out.println("프로그램을 종료합니다");
				break;
			}else if(q.equals("y")){
				while(true) {
				System.out.print("예약을 진행 하시겠습니까?(y,n): ");
				String q2=input.next();
				if(q2.equals("n")) {
					System.out.println("프로그램을 종료합니다");
					return;
				}
				else if(q2.equals("y")) {
					System.out.println("예약 시작일 입력");
					System.out.print("시작년도: ");
					int sYear=input.nextInt();
					System.out.print("시작 월: ");
					int sMonth=input.nextInt();
					System.out.print("시작 일: ");
					int sDate=input.nextInt();
					System.out.print("시작 시: ");
					int sHour=input.nextInt();
					System.out.print("시작 분: ");
					int sMinute=input.nextInt();
					System.out.print("시작 초: ");
					int sSecond=input.nextInt();
					
					System.out.println("예약 종료일 입력");
					System.out.print("종료년도: ");
					int eYear=input.nextInt();
					System.out.print("종료 월: ");
					int eMonth=input.nextInt();
					System.out.print("종료 일: ");
					int eDate=input.nextInt();
					System.out.print("종료 시: ");
					int eHour=input.nextInt();
					System.out.print("종료 분: ");
					int eMinute=input.nextInt();
					System.out.print("종료 초: ");
					int eSecond=input.nextInt();
					
					
					LocalDateTime start = LocalDateTime.of(sYear,sMonth, sDate, sHour, sMinute, sSecond);
					LocalDateTime end = LocalDateTime.of(eYear,eMonth, eDate, eHour, eMinute, eSecond);
					
					System.out.println("예약 시작일: ");
					System.out.println(start.getYear()+"년 "
							+start.getMonthValue()+"월 "
							+start.getDayOfMonth()+"일 "
							+start.getHour()+"시 "
							+start.getMinute()+"분 "
							+start.getSecond()+"초 ");
					
					System.out.println("예약 종료일: ");
					System.out.println(end.getYear()+"년 "
							+end.getMonthValue()+"월 "
							+end.getDayOfMonth()+"일 "
							+end.getHour()+"시 "
							+end.getMinute()+"분 "
							+end.getSecond()+"초 ");
					
				
					boolean bool = start.isBefore(end);
					if(!bool) {
						System.out.println("예약시작일은 예약 종료일보다 이전 일 이어야합니다");
						System.out.println("다시 입력해 주십시오");
						continue;
					}else{
						System.out.println("예약가능합니다,예약일을 선택해 주십시오");
						System.out.println("예약가능일: "+end);
						FullCalenderDto reserv = new FullCalenderDto(start, end);
						
						String str = reserv.toString();
						System.out.println(str);
						break;
					}	
					
				}
				else {
					System.out.println("쿼리문 입력 오류 다시 입력해주세요");
				}
				}
				
			}else {
				System.out.println("쿼리문 입력 오류 다시 입력해주세요");
			}

			
			
		}
		
		input.close();
		
	}
}
