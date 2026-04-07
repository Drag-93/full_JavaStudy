package org.java.project.entity;

import java.time.LocalDateTime;

import org.java.project.dto.MemberDto;
import org.java.project.role.Role;

//@Entity -> DB테이블구조랑 같다
public class MemberEntity {

	private Long memberId; // 자동 증분 PK,auto_increament
	private String userEmail;// NOT NULL, UNIQUE
	private String userPw;// NOT NULL
	private int age;		// NOT NULL
	private String address;// NOT NULL

	private Role role;// NOT NULL ,권한 기본 MEMBER

	private LocalDateTime createTiem; // 자동 NULL
	private LocalDateTime updateTiem; // 자동 NULL

	public MemberEntity() {
		// TODO Auto-generated constructor stub
	}

	public MemberEntity(Long memberId, String userEmail, String userPw, int age, String address, Role role,
			LocalDateTime createTiem, LocalDateTime updateTiem) {
		super();
		this.memberId = memberId;
		this.userEmail = userEmail;
		this.userPw = userPw;
		this.age = age;
		this.address = address;
		this.role = role;
		this.createTiem = createTiem;
		this.updateTiem = updateTiem;
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

	public LocalDateTime getCreateTiem() {
		return createTiem;
	}

	public void setCreateTiem(LocalDateTime createTiem) {
		this.createTiem = createTiem;
	}

	public LocalDateTime getUpdateTiem() {
		return updateTiem;
	}

	public void setUpdateTiem(LocalDateTime updateTiem) {
		this.updateTiem = updateTiem;
	}
	
	// 회원가입 Dto -> Entity
	//DB에 저장 할때 -> 회원가입 서비스
	public static MemberEntity toInsertMemberEntity(MemberDto memberDto) {	
		
		MemberEntity memberEntity=new MemberEntity();	
		
//		memberEntity.setMemberId(memberDto.getMemberId()); //자동설정
		memberEntity.setUserEmail(memberDto.getUserEmail());
		memberEntity.setUserPw(memberDto.getUserPw());
		memberEntity.setAge(memberDto.getAge());
		memberEntity.setAddress(memberDto.getAddress());
		memberEntity.setRole(Role.ROLE_MEMBER); 		//자동설정 -> 기본이 ROLE_MEMBER
		memberEntity.setCreateTiem(LocalDateTime.now()); //자동설정
		// 수정 시간 X		
		return memberEntity;
	}
	// 회원수정 Dto -> Entity
	public static MemberEntity toUpdateMemberEntity(MemberDto memberDto) {
		MemberEntity memberEntity=new MemberEntity();	
		
		memberEntity.setMemberId(memberDto.getMemberId()); //반드시 아이디가 존재해야된다.
		memberEntity.setUserEmail(memberDto.getUserEmail());
		memberEntity.setUserPw(memberDto.getUserPw());
		memberEntity.setAge(memberDto.getAge());
		memberEntity.setAddress(memberDto.getAddress());
		memberEntity.setRole(memberDto.getRole());
		memberEntity.setCreateTiem(memberDto.getCreateTiem());
		memberEntity.setUpdateTiem(LocalDateTime.now());// 회원수정시간ㅋ		
		return memberEntity;
	}
	
	
	
	

	@Override
	public String toString() {
		return "MemberEntity [memberId=" + memberId + ", userEmail=" + userEmail + ", userPw=" + userPw + ", age=" + age
				+ ", address=" + address + ", role=" + role + ", createTiem=" + createTiem + ", updateTiem="
				+ updateTiem + "]";
	}

}
