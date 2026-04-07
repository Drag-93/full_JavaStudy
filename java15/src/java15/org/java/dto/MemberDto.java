package java15.org.java.dto;

import java.time.LocalDateTime;

import java15.org.java.constraint.Role;

public class MemberDto {
	// 기본필드
	private Long memberId; // 자동 증분 PK,아이디
	private String userEmail; // NOT NULL, UNIQUE,이메일
	private String userPw; // NOT NULL,비빌번호
	private Role role; // NOT NULL ,권한 기본 MEMBER
	//기본설정 ->필수 
	private LocalDateTime createTime; // 자동 NULL
	private LocalDateTime updateTime; // 자동 NULL
	
	public MemberDto() {
		// TODO Auto-generated constructor stub
	}

	public MemberDto(Long memberId, String userEmail, String userPw, Role role, LocalDateTime createTime,
			LocalDateTime updateTime) {
		super();
		this.memberId = memberId;
		this.userEmail = userEmail;
		this.userPw = userPw;
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
	
	
	
	
}
