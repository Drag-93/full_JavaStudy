package org.project.entity;

import java.time.LocalDateTime;

import org.project.constraint.Role;
import org.project.dto.MemberDto;

//@NoArgsconstruct
//@AllArgsconstruct
//@Bulder
//@ToString
//@Entity
//@Table(name="member1)
public class MemberEntity {
	// 필수 -> id -> 자동증분
	private Long memberId; //기본키(PK)
	private String userEmail;//not null
	private String userPw;//not null
	private int age;//not null
	private String address;//not null
	// 권한 -> 필수
	private Role role;		//not null 기본이 ROLE_MEMBER

	// 시간 -> 필수 -> 스프링에서 자동으로 설정
	// 생성시에 한번 실행 제약조건,수정X
	private LocalDateTime createTime;// null
	// 수정시마다 실행 제약조건,생성X
	private LocalDateTime updateTime;// null

	public MemberEntity() {
		// TODO Auto-generated constructor stub
	}
	

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

	

	@Override
	public String toString() {
		return "MemberEntity [memberId=" + memberId + ", userEmail=" + userEmail + ", userPw=" + userPw + ", age=" + age
				+ ", address=" + address + ", role=" + role + ", createTime=" + createTime + ", updateTime="
				+ updateTime + "]";
	}


	// form -> Controller ->Service -> Dto-> Entity-> JPARepository -> <- DB
	// MemberDto -> MemberEntity -> 회원가입
	public static MemberEntity toInsertMemberEntity(MemberDto memberDto) {
		MemberEntity memberEntity = new MemberEntity();
		// auto_increment-> 회원가입 시에는 자동 -> form X
		memberEntity.setMemberId(memberDto.getMemberId());
		// 이메일 -> 중복 불가능 -> contraint -> Spring Security ID
		memberEntity.setUserEmail(memberDto.getUserEmail());
		// Spring -> 반드시 비빌번호를 암호화 해야된다. -> Spring Security
		memberEntity.setUserPw(memberDto.getUserPw());
		memberEntity.setAddress(memberDto.getAddress());
		memberEntity.setAge(memberDto.getAge());
		// 회원가입 시에는 자동 -> form X
		memberEntity.setCreateTime(LocalDateTime.now());
		// 기본 권한 설정 -> form X
		memberEntity.setRole(Role.MEMBER);
		return memberEntity;
	}
	
	// form -> Controller ->Service -> Dto-> Entity-> JPARepository -> <- DB
	// MemberDto -> MemberEntity -> 회원수정
	public static MemberEntity toUpdateMemberEntity(MemberDto memberDto) {
		
		MemberEntity memberEntity = new MemberEntity();
		// 반드시 회원수정시에는 id 필수로 있어야 된다.
		memberEntity.setMemberId(memberDto.getMemberId());
		memberEntity.setUserEmail(memberDto.getUserEmail());
		memberEntity.setUserPw(memberDto.getUserPw());
		memberEntity.setAddress(memberDto.getAddress());
		memberEntity.setAge(memberDto.getAge());
		memberEntity.setCreateTime(memberDto.getCreateTime());
		memberEntity.setRole(memberDto.getRole());
		// 수정시간
		memberEntity.setUpdateTime(LocalDateTime.now());

		return memberEntity;
	}

	
}
