package org.java.project.dto;

import java.time.LocalDateTime;

import org.java.project.entity.MemberEntity;
import org.java.project.role.Role;

//사용자 -> DTO -> <- Entity
public class MemberDto {

	//회원가입 form 
	private Long memberId; //자동  
	private String userEmail;//중복불가능
	private String userPw;// 암호화
	private int age;		
	private String address;

	private Role role;////자동  ,권한 기본 MEMBER

	private LocalDateTime createTiem; // 자동 
	private LocalDateTime updateTiem; // 자동 

	//@NoArgsConstruct
	public MemberDto() {
		// TODO Auto-generated constructor stub
	}

	//@AllArgsConstruct
	public MemberDto(Long memberId, String userEmail, String userPw, int age, String address, Role role,
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

	// Entity ->Dto
	public static MemberDto toMemberDto(MemberEntity memberEntity) {
		
		MemberDto memberDto=new MemberDto();
	
		memberDto.setMemberId(memberEntity.getMemberId());
		memberDto.setAge(memberEntity.getAge());
		memberDto.setAddress(memberEntity.getAddress());
		memberDto.setUserEmail(memberEntity.getUserEmail());
		memberDto.setUserPw(memberEntity.getUserPw());
		memberDto.setRole(memberEntity.getRole());
		memberDto.setCreateTiem(memberEntity.getCreateTiem());
		memberDto.setUpdateTiem(LocalDateTime.now());		
		
		return memberDto;
		
	}

	@Override
	public String toString() {
		return "MemberDto [memberId=" + memberId + ", userEmail=" + userEmail + ", userPw=" + userPw + ", age=" + age
				+ ", address=" + address + ", role=" + role + ", createTiem=" + createTiem + ", updateTiem="
				+ updateTiem + "]";
	}

}
