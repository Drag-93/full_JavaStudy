package org.java.project.entity;
import java.time.LocalDateTime;

import org.java.project.constraint.Role;
import org.java.project.dto.MemberDto;



//@ToString
//@Setter
//@Getter
//@AllArgsConstruct
//@NoargsConstruct
//@Entity
//@Table(name="member4")
public class MemberEntity {
	private Long memberId;	//NUMBER(15) not null --java Long 
	private String userEmail;
	private String userPw;
	private Role role;
	//필수 -> Spring 에서 관리
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
	
	//DTO -> Entity
	//회원가입
	public static MemberEntity toInsertMemberEntity(MemberDto memberDto) {
		MemberEntity memberEntity = new MemberEntity();
		
		memberEntity.setUserEmail(memberDto.getUserEmail());
		memberEntity.setUserPw(memberDto.getUserPw());
		memberEntity.setRole(Role.MEMBER);
		return memberEntity;
	}
	
	//회원 수정
	public static MemberEntity toUpdateMemberEntity(MemberDto memberDto) {
		MemberEntity memberEntity = new MemberEntity();
		//회원 수정 시 반드시 회원 아이디가 있어야 한다.
		
		memberEntity.setMemberId(memberDto.getMemberId());
		memberEntity.setUserEmail(memberDto.getUserEmail());
		memberEntity.setUserPw(memberDto.getUserPw());
		memberEntity.setRole(memberDto.getRole());
		memberEntity.setCreateTime(memberDto.getCreateTime());
		
		return memberEntity;
	}
	
	
	
	
	
	
}
