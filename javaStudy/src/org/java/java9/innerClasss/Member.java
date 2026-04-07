package org.java.java9.innerClasss;

public class Member {

	private int age;
	private String userName;
	
	public  Member() {
		// TODO Auto-generated constructor stub
	}	
	public Member(int age, String userName) {
		super();
		this.age = age;
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "Member [age=" + age + ", userName=" + userName + "]";
	}
	
	
	
	
	
}
