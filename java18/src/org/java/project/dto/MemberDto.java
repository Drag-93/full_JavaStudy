package org.java.project.dto;

import java.time.LocalDateTime;

import org.java.project.constraint.Role;
import org.java.project.entity.MemberEntity;

//@ToString
//@Bulider
//@AllArgsConstruct
//@NoArgsConstruct
public class MemberDto {
	// 필수 -> id -> 자동증분
	private Long memberId;// member_id

	private String userEmail;// user_email
	private String userPw;
	private int age;
	private String address;
	// 권한 -> 필수
	private Role role;

	// 시간 -> 필수 -> 스프링에서 자동으로 설정
	// 생성시에 한번 실행 제약조건,수정X
	private LocalDateTime createTime;
	// 수정시마다 실행 제약조건,생성X
	private LocalDateTime updateTime;

	public MemberDto() {
		// TODO Auto-generated constructor stub
	}

	// 로그인 -> Security 알아서 처리
	public MemberDto(String userEmail, String userPw) {
		this.userEmail = userEmail;
		this.userPw = userPw;
	}

	public MemberDto(Long memberId, String userEmail, String userPw, int age, String address, Role role,
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

	// 모든 Entity -> DTO 변환 -> 회원조회
	public static MemberDto toMemberDto(MemberEntity memberEntity) {

		MemberDto memberDto = new MemberDto();// Builder
		
		memberDto.setMemberId(memberEntity.getMemberId());
		memberDto.setUserEmail(memberEntity.getUserEmail());
		memberDto.setAddress(memberEntity.getAddress());
		memberDto.setAge(memberEntity.getAge());
		memberDto.setUserPw(memberEntity.getUserPw());
		memberDto.setRole(memberEntity.getRole());

		memberDto.setCreateTime(memberEntity.getCreateTime());
		memberDto.setUpdateTime(memberEntity.getUpdateTime());
		
		return memberDto;

	}

	@Override
	public String toString() {
		return "MemberDto [memberId=" + memberId + ", userEmail=" + userEmail + ", userPw=" + userPw + ", age=" + age
				+ ", address=" + address + ", role=" + role + ", createTime=" + createTime + ", updateTime="
				+ updateTime + "]";
	}

}
