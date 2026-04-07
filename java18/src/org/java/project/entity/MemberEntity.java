package org.java.project.entity;

import java.time.LocalDateTime;

import org.java.project.constraint.Role;
import org.java.project.dto.MemberDto;

//@ToString
//@Bulider
//@AllArgsConstruct
//@NoArgsConstruct
//@Entity
//@Table(name="member2");
public class MemberEntity {

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

	
	// Builder 타입
	// @NoArgsConstruct -> lombok
	public MemberEntity() {

	}

	// @AllArgsConstruct -> lombok
	public MemberEntity(Long memberId, String userEmail, String userPw, int age, String address, Role role,
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

	// @Getter, @Setter, @Data -> lombok
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
	
	// DTO -> Entity
	// 회원가입
	public static MemberEntity toInsertMemberEntity(MemberDto memberDto) {
		MemberEntity memberEntity = new MemberEntity();

//		memberEntity.setMemberId(memberDto.getMemberId()); // 자동설정
		memberEntity.setUserEmail(memberDto.getUserEmail());// 중복불가능
		memberEntity.setAddress(memberDto.getAddress());
		memberEntity.setAge(memberDto.getAge());
		// ****** 반드시 비빌번호 암호화 -> Spring security 
		memberEntity.setUserPw(memberDto.getUserPw()); //비빌번호 암호화 
		memberEntity.setRole(Role.MEMBER);				// MEMBER권한 -> 기본
		
		// 자동으로 설정
//		memberEntity.setCreateTime(memberDto.getCreateTime());
//		memberEntity.setUpdateTime(LocalDateTime.now());
		
		return memberEntity;
	}

	// 회원수정  -> DB테이블 조회 -> 모든 칼럽 get
	public static MemberEntity toUpdateMemberEntity(MemberDto memberDto) {
		MemberEntity memberEntity = new MemberEntity();
	
		memberEntity.setMemberId(memberDto.getMemberId());
		memberEntity.setUserEmail(memberDto.getUserEmail());
		memberEntity.setAddress(memberDto.getAddress());
		memberEntity.setAge(memberDto.getAge());
		memberEntity.setUserPw(memberDto.getUserPw());
		memberEntity.setRole(memberDto.getRole());

		memberEntity.setCreateTime(memberDto.getCreateTime());
		//수정시간 자동 설정
//		memberEntity.setUpdateTime(LocalDateTime.now());
		
		return memberEntity;
	}

	// @ToString
	@Override
	public String toString() {
		return "MemberEntity [memberId=" + memberId + ", userEmail=" + userEmail + ", userPw=" + userPw + ", age=" + age
				+ ", address=" + address + ", role=" + role + ", createTime=" + createTime + ", updateTime="
				+ updateTime + "]";
	}

}
