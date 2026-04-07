package org.java.basic.oopEx;

public class MemberDto {
	// DTO? -> Data Transfer Object -> 데이터 전송 객체
	//멤버
	//인스턴스 멤버
	private Long id; // 반드시 Long -> DB에서 자동 증분(1씩커짐),auto_incresement
	private String userEmail; //중복불가능 , not null
	private String userPw;	//not null
	private String userName;//not null
	private String addr;//not null
	private int age;//not null
	private Role role;//not null
	
	//생성자
	//@NoArgsConstruct
	public MemberDto() {
		// TODO Auto-generated constructor stub
	}
	//@AllArgsConstruct
	public MemberDto(Long id, String userEmail, String userPw, String userName, String addr, int age, Role role) {
		super();
		this.id = id;
		this.userEmail = userEmail;
		this.userPw = userPw;
		this.userName = userName;
		this.addr = addr;
		this.age = age;
		this.role = role;
	}
	
	//getter, setter
	public Long getId() {
		return id;
	}
	public String getUserEmail() {
		return userEmail;
	}
	
	public String getUserPw() {
		return userPw;
	}
	public String getUserName() {
		return userName;
	}
	
	public String getAddr() {
		return addr;
	}
	public int getAge() {
		return age;
	}
	public Role getRole() {
		return role;
	}
	
	public void setId(Long id) {
		this.id =id;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail=userEmail;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setRole(Role role) {
		this.role = role;
	}

	
	
	//toString(클래스의 정보)
	@Override
	public String toString() {
		return "MemberDto [id=" + id + ", userEmail=" + userEmail + ", userPw=" + userPw + ", userName=" + userName
				+ ", addr=" + addr + ", age=" + age + ", role=" + role + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
