package org.java.dto;

import java.time.LocalDateTime;

import org.java.constraint.Role;

public class MemberDto {

	private Long memberId; // 자동 증분 PK,아이디
	private String userEmail; // NOT NULL, UNIQUE,이메일
	private String userPw; // NOT NULL,비빌번호
	private int age; 		// NOT NULL,나이
	private String address; // NOT NULL, 주소

	private Role role; // NOT NULL ,권한 기본 MEMBER
	//기본설정 ->필수 
	private LocalDateTime createTime; // 자동 NULL
	private LocalDateTime updateTime; // 자동 NULL

	//@NoArgsConstruct
	public MemberDto() {
	}
	//@AllArgsConstruct
	public MemberDto(Long memberId, String userEmail, String userPw,
			int age, String address, Role role,
			LocalDateTime createTime, LocalDateTime updateTime) {
		super();
		this.memberId = memberId;
		this.userEmail = userEmail;
		this.userPw = userPw;
		this.age = age;
		this.address = address;
		this.role = role;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}
	public Long getMemberId() {
		return memberId;
	}
	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public LocalDateTime getCreateTime() {
		return createTime;
	}
	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}
	public LocalDateTime getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(LocalDateTime updateTime) {
		this.updateTime = updateTime;
	}
	@Override
	public String toString() {
		return "MemberDto [memberId=" + memberId + ", userEmail=" + userEmail + ", userPw=" + userPw + ", age=" + age
				+ ", address=" + address + ", role=" + role + ", createTime=" + createTime + ", updateTime="
				+ updateTime + "]";
	}

	
	
}
