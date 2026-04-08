package org.project.dto;

import org.project.entity.MemberEntity;


public class MemberDto {
	private Long memberId;
    private String email; 
    private String password;
    private String name;
    private String address;
    public MemberDto() {
		// TODO Auto-generated constructor stub
	}
	public MemberDto(Long memberId, String email, String password, String name, String address) {
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
		return "MemberDto [memberId=" + memberId + ", email=" + email + ", password=" + password + ", name=" + name
				+ ", address=" + address + "]";
	}
    
	//Entity -> DTO
	public static MemberDto toMemberDto(MemberEntity memberEntity) {
		MemberDto memberDto = new MemberDto();
		memberDto.setMemberId(memberEntity.getMemberId());
		memberDto.setEmail(memberEntity.getEmail());
		memberDto.setPassword(memberEntity.getPassword());
		memberDto.setName(memberEntity.getName());
		memberDto.setAddress(memberEntity.getAddress());

		return memberDto;
	}
	
	
}
