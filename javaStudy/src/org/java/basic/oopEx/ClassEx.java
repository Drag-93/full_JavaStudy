package org.java.basic.oopEx;

public class ClassEx {
	
	//멤버
	
	
	//필드
	private int age;  		//인스턴스멤버
	private String email;  //인스턴스멤버
	private String name;  //인스턴스멤버
	public String addr;  //인스턴스멤버
	
	//클래스멤버(static멤버)
	public static final int MAXIMUM=1000;
		
	
	//생성자
	//기본생성자는 컴파일러가 자동으로 생성
//	public ClassEx() {
//		System.out.println("기본생성자");
//	}
	//다른생성자 @AllArgsConstruct
	
	
	
	//메서드
	public void in1() {   //인스턴스멤버
		System.out.println("인스턴스 메서드");
	}
	
	public ClassEx() {
		
	}
	public ClassEx(int age, String email, String name, String addr) {
		super();
		this.age = age;
		this.email = email;
		this.name = name;
		this.addr = addr;
	}

	public static void staticMethod() { //클래스멤버(static멤버)
		System.out.println("인스턴스 메서드");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}











}
