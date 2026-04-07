package org.java.project.service;

import java.util.List;

import org.java.project.dto.MemberDto;

public interface MemberService {

	//추상매서드(미완성매서드)
//	public abstract int memberInsert(MemberDto memberDto);
	int memberInsert(MemberDto memberDto);
	int updateMember(MemberDto memberDto);
	List<MemberDto> memberDtos();
	MemberDto detail(Long memberId);
	
}
