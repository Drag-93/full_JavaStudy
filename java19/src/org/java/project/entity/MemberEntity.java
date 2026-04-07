package org.java.project.entity;

import java.time.LocalDateTime;

import org.java.project.dto.MemberDto;
import org.java.project.role.Role;

// lombok 라이브러리
//@NoArgsConstrunct
//@AllArgsConstrunct
//@ToString
//@Getter
//@Setter
//@Entity
public class MemberEntity {

	private Long memberId;// member_id, 자동설정(시퀀스)
	private String userEmail;// not null unique(중복불가능)
	private String userPw;// Spring Security에 암호화
	private Role role;// 필수(회원) 권한 Spring Security

	// 필수 시간 -> 자동으로 설정
	private LocalDateTime createTime;
	private LocalDateTime updateTime;

	public MemberEntity() {
		// TODO Auto-generated constructor stub
	}

	public MemberEntity(Long memberId, String userEmail, String userPw, Role role, LocalDateTime createTime,
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

	@Override
	public String toString() {
		return "MemberEntity [memberId=" + memberId + ", userEmail=" + userEmail + ", userPw=" + userPw + ", role="
				+ role + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}

	// Dto -> Entity
	// 회원가입
	public static MemberEntity toInsertMemberEntity(MemberDto memberDto) {

		MemberEntity memberEntity = new MemberEntity();
		// 회원가입 시에는 자동
//		memberEntity.setMemberId(memberDto.getMemberId());
		// 자동
//		memberEntity.setCreateTime();
		memberEntity.setUserEmail(memberDto.getUserEmail());
		memberEntity.setUserPw(memberDto.getUserPw());
		memberEntity.setRole(Role.MEMBER); // 기본

		return memberEntity;
	}

	// 회원수정
	public static MemberEntity toUpdateMemberEntity(MemberDto memberDto) {

		MemberEntity memberEntity = new MemberEntity();
		// 회원수정 시 반드시 회원아이디가 있어야된다.
		memberEntity.setMemberId(memberDto.getMemberId());
		memberEntity.setUserEmail(memberDto.getUserEmail());
		memberEntity.setUserPw(memberDto.getUserPw());
		memberEntity.setRole(memberDto.getRole());
		memberEntity.setCreateTime(memberDto.getCreateTime());

		return memberEntity;
	}

	
	
	
}
