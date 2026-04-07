package org.java.project.dto;

import java.time.LocalDateTime;

import org.java.project.entity.MemberEntity;
import org.java.project.role.Role;

//lombok 라이브러리
//@NoArgsConstrunct
//@AllArgsConstrunct
//@ToString
//@Getter
//@Setter
//@Entity
public class MemberDto {
	private Long memberId;// member_id, 자동설정(시퀀스)
	private String userEmail;// not null unique(중복불가능)
	private String userPw;// Spring Security에 암호화
	private Role role;// 필수(회원) 권한 Spring Security

	// 필수 시간 -> 자동으로 설정
	private LocalDateTime createTime;
	private LocalDateTime updateTime;

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

	@Override
	public String toString() {
		return "MemberDto [memberId=" + memberId + ", userEmail=" + userEmail + ", userPw=" + userPw + ", role=" + role
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}

	// "ROLE_"+
	// Entity -> Dto
	public static MemberDto toMemberDto(MemberEntity memberEntity) {

		MemberDto memberDto = new MemberDto();

		memberDto.setMemberId(memberEntity.getMemberId());
		memberDto.setUserEmail(memberEntity.getUserEmail());
		memberDto.setUserPw(memberEntity.getUserPw());
		memberDto.setRole(memberEntity.getRole());

		memberDto.setCreateTime(memberEntity.getCreateTime());
		
		if(memberEntity.getUpdateTime()==null) {
			memberDto.setUpdateTime(null);
		}else {
			memberDto.setUpdateTime(memberEntity.getUpdateTime());
		}
		
		return memberDto;

	}

}
