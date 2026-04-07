package org.java.java11.dto;

import java.time.LocalDateTime;



public class MemberDto {

	private int memberId; // 자동증분 1~
	private String userEmail; // 중복불가능
	private String userPw;

	public MemberDto() {
		// TODO Auto-generated constructor stub
	}

	public MemberDto(int memberId, String userEmail, String userPw) {
		super();
		this.memberId = memberId;
		this.userEmail = userEmail;
		this.userPw = userPw;
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

	@Override
	public String toString() {
		return "MemberDto [memberId=" + memberId + ", userEmail=" + userEmail + ", userPw=" + userPw + "]";
	}


}