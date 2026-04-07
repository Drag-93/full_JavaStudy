package org.java.java12.dto;

import java.time.LocalDateTime;

import org.java.java12.constraint.Role;


public class MemberDto {

	private int memberId;
	private String userEmail;
	private String userPw;
	private String userName;
	private Role userRole;

	private LocalDateTime createTime;
	private LocalDateTime updateTime;
	
	
	public MemberDto() {
		// TODO Auto-generated constructor stub
	}


	public MemberDto(int memberId, String userEmail, String userPw, String userName, Role userRole,
			LocalDateTime createTime, LocalDateTime updateTime) {
		super();
		this.memberId = memberId;
		this.userEmail = userEmail;
		this.userPw = userPw;
		this.userName = userName;
		this.userRole = userRole;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}


	public int getMemberId() {
		return memberId;
	}


	public void setMemberId(int memberId) {
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


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public Role getUserRole() {
		return userRole;
	}


	public void setUserRole(Role userRole) {
		this.userRole = userRole;
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
		return "MemberDto [memberId=" + memberId + ", userEmail=" + userEmail + ", userPw=" + userPw + ", userName="
				+ userName + ", userRole=" + userRole + ", createTime=" + createTime + ", updateTime=" + updateTime
				+ "]";
	}
	
	
	
	
	
	
}
