package org.java.java12.dto;

import java.time.LocalDateTime;

import org.java.java12.constraint.Role;

public class MemberDto {

	private int memberId;
	private String userEmail;
	private String userPw;
	private String UserName;
	private Role userRole;
	private LocalDateTime createTime;
	private LocalDateTime updateTime;
	
	
	public MemberDto() {
		System.out.println("기본생성자");
	}


	public MemberDto(int memberId, String userEmail, String userPw, String userName, Role userRole,
			LocalDateTime createTime, LocalDateTime updateTime) {
		super();
		this.memberId = memberId;
		this.userEmail = userEmail;
		this.userPw = userPw;
		UserName = userName;
		this.userRole = userRole;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}


	public int getMemberId() {
		return memberId;
	}


	public String getUserEmail() {
		return userEmail;
	}


	public String getUserPw() {
		return userPw;
	}


	public String getUserName() {
		return UserName;
	}


	public Role getUserRole() {
		return userRole;
	}


	public LocalDateTime getCreateTime() {
		return createTime;
	}


	public LocalDateTime getUpdateTime() {
		return updateTime;
	}


	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}


	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}


	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}


	public void setUserName(String userName) {
		UserName = userName;
	}


	public void setUserRole(Role userRole) {
		this.userRole = userRole;
	}


	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}


	public void setUpdateTime(LocalDateTime updateTime) {
		this.updateTime = updateTime;
	}


	@Override
	public String toString() {
		return "MemberDto [memberId=" + memberId + ", userEmail=" + userEmail + ", userPw=" + userPw + ", UserName="
				+ UserName + ", userRole=" + userRole + ", createTime=" + createTime + ", updateTime=" + updateTime
				+ "]";
	}
	
	
}
