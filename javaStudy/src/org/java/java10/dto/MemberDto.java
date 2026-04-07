package org.java.java10.dto;

import java.time.LocalDateTime;

import org.java.java10.role.Role;


public class MemberDto {

	private int memberId; // 자동증분 1~
	private String userEmail; // 중복불가능
	private String userPw;
	private Role role;//
	// 기본, 공통, 시간
	private LocalDateTime createTime;
	private LocalDateTime updateTime;

	public MemberDto() {
		// TODO Auto-generated constructor stub
	}

	public MemberDto(int memberId, String userEmail, 
			String userPw, Role role, LocalDateTime createTime,
			LocalDateTime updateTime) {
		super();
		this.memberId = memberId;
		this.userEmail = userEmail;
		this.userPw = userPw;
		this.role = role;
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
		return "MemberDto [memberId=" + memberId + ", userEmail=" + userEmail + ", userPw=" + userPw + ", role=" + role
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}
}