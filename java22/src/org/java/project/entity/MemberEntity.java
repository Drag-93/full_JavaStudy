package org.java.project.entity;

import java.time.LocalDateTime;

import org.java.project.constraint.Role;
import org.java.project.dto.MemberDto;

//@ToString
//@Builder
//@Setter
//@Getter
//@AllArgsConstruct
//@NoArgsConstruct
//@Entity
//@Table(name="member_tb3")


public class MemberEntity {

	private Long memberId; 
	private String userEmail; 
	private String userPw;
	private int age;
	private String address; 
	private Role role;
	
	private LocalDateTime createTime; 
	private LocalDateTime updateTime;
	
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
	
	//DTO -> Entity
	//회원가입
	public static MemberEntity toInsertMemberEntity(MemberDto memberDto) {
		MemberEntity memberEntity = new MemberEntity();
		
		memberEntity.setUserEmail(memberDto.getUserEmail());
		memberEntity.setUserPw(memberDto.getUserPw());
		memberEntity.setAge(memberDto.getAge());
		memberEntity.setAddress(memberDto.getAddress());
		memberEntity.setRole(Role.MEMBER);
		return memberEntity;
	}
	
	
	//회원수정
	
	public static MemberEntity toUpdateMemberEntity(MemberDto memberDto) {
		MemberEntity memberEntity = new MemberEntity();
		
		memberEntity.setMemberId(memberDto.getMemberId());
		memberEntity.setUserEmail(memberDto.getUserEmail());
		memberEntity.setUserPw(memberDto.getUserPw());
		memberEntity.setAge(memberDto.getAge());
		memberEntity.setAddress(memberDto.getAddress());
		memberEntity.setRole(memberDto.getRole());
//		memberEntity.setCreateTime(memberDto.getCreateTime());
//		if(memberDto.getUpdateTime()==null) {
//			memberEntity.setUpdateTime(null);
//		}else {
//			memberEntity.setUpdateTime(memberDto.getUpdateTime());
//		}
		return memberEntity;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
