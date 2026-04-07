package org.project.dto;

import java.time.LocalDateTime;

import org.project.constraint.Role;
import org.project.entity.MemberEntity;

//@NoArgsconstruct
//@AllArgsconstruct
//@Bulder
//@ToString
public class MemberDto {

	private Long memberId; 
	private String userEmail;
	private String userPw;
	private int age;
	private String address;
	// 권한 -> 필수
	private Role role; 

	// 생성시에 한번 실행 제약조건,수정X
	private LocalDateTime createTime;// null
	// 수정시마다 실행 제약조건,생성X
	private LocalDateTime updateTime;// null

	public MemberDto() {
		// TODO Auto-generated constructor stub
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

	

	// 회원조회
	// Controller -> Service -> memberId-> JPARepository -> DB -> Entity -> Dto->
	// Service -> Controller -> React-View

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


	// MemberEntity -> MemberDto -> 회원조회
	public static MemberDto toMemberDto(MemberEntity memberEntity) {
		// 기본생성자 이용
		MemberDto memberDto = new MemberDto();

		memberDto.setMemberId(memberEntity.getMemberId());
		memberDto.setUserEmail(memberEntity.getUserEmail());
		memberDto.setUserPw(memberEntity.getUserPw());
		memberDto.setAge(memberEntity.getAge());
		memberDto.setAddress(memberEntity.getAddress());
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
