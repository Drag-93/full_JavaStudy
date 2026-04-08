package org.project.entity;

import org.project.dto.MemberDto;

public class MemberEntity {
	private Long memberId;
    private String email; 
    private String password;
    private String name;
    private String address;
    
    public MemberEntity() {
		// TODO Auto-generated constructor stub
	}
	public MemberEntity(Long memberId, String email, String password, String name, String address) {
		super();
		this.memberId = memberId;
		this.email = email;
		this.password = password;
		this.name = name;
		this.address = address;
	}
	public Long getMemberId() {
		return memberId;
	}
	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "MemberEntity [memberId=" + memberId + ", email=" + email + ", password=" + password + ", name=" + name
				+ ", address=" + address + "]";
	}
    
	
	//DTO -> Entity
	//insert
	public static MemberEntity toInsertMemberEntity(MemberDto memberDto) {
		MemberEntity memberEntity = new MemberEntity();
		
		memberEntity.setEmail(memberDto.getEmail());
		memberEntity.setPassword(memberDto.getPassword());
		memberEntity.setName(memberDto.getName());
		memberEntity.setAddress(memberDto.getAddress());

		return memberEntity;
	}
	
	//update
	public static MemberEntity toUpdateMemberEntity(MemberDto memberDto) {
		MemberEntity memberEntity = new MemberEntity();
		
		memberEntity.setMemberId(memberDto.getMemberId());
		memberEntity.setEmail(memberDto.getEmail());
		memberEntity.setPassword(memberDto.getPassword());
		memberEntity.setName(memberDto.getName());
		memberEntity.setAddress(memberDto.getAddress());

		return memberEntity;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
