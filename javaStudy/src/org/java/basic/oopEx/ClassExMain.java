package org.java.basic.oopEx;

import java.util.Scanner;

public class ClassExMain {
	public static void main(String[] args) {
		System.out.println("클래스멤버(static)");
		System.out.println(ClassEx.MAXIMUM);
		
		ClassEx.staticMethod();
		
		System.out.println("ClassExMain");
		//인스턴스화(객체화
		//c1 -> 객체참도젼산자, 
		ClassEx c1=new ClassEx();	  
		c1.addr="서울시 노원구";
		System.out.println(c1.addr);
		
		
		c1.in1();
		  
		System.out.println("private 멤버(필드) 초기화");
		//age, email, name을 setters로 초기화
		
		c1.setAge(50);
		c1.setEmail("m1@email.com");
		c1.setName("m1");
		
		System.out.println(c1.getAge());
		System.out.println(c1.getEmail());
		System.out.println(c1.getName());
		
		System.out.println("생성자를 이용해서 초기화");
		ClassEx c2= new ClassEx(40, "m2@email.com", "m2", "서울시 상계동");
		
		System.out.println(c2.getAge());
		System.out.println(c2.getEmail());
		System.out.println(c2.getName());
		System.out.println(c2.getAddr());
		
		//Scanner,while,if등을 이용해서
		//나이, 이메일, 주소, 이름을 콘솔에서 입력
		//생성자는 임의로 기본생성자, 다른생성자 선택
		//이름: ~, 나이:~, 이메일:~, 주소:~ 형식으로 출력
		//단, exit를 입력받으면 while문 종료
		//나머지를 입력 시에는 다시 입력-> while문 다시 시작
		
		Scanner input = new Scanner(System.in);
		
		
		while(true) {
			  System.out.print("계속하려면 아무거나 입력 / 종료 exit : ");
			 			String exit=input.next();
			if(exit.equalsIgnoreCase("exit")) {
				System.out.println("종료");
				break;
			}else{
				System.out.print("이름: ");
				String inpName=input.next();
				System.out.print("나이: ");
				int inpAge=input.nextInt();
				System.out.print("이메일: ");
				String inpEmail=input.next();
				System.out.print("주소: ");
				input.nextLine();
				String inpAddr=input.nextLine();
				
				ClassEx c3=new ClassEx();
				c3.setName(inpName);
				c3.setAge(inpAge);
				c3.setEmail(inpEmail);
				c3.setAddr(inpAddr);
				
				System.out.println("이름: "+c3.getName()+", "+"나이: "+c3.getAge()+", "+"이메일: "+c3.getEmail()+", "+"주소: "+c3.getAddr());
			}
//			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
