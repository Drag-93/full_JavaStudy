package org.project.service;

import java.util.List;

import org.project.dto.MemberDto;

public interface MemberService {
	int memberInsert(MemberDto memberDto);
	
	int memberUpdate(MemberDto memberDto);
	
	int memberDelete(MemberDto memberDto);
	
	MemberDto emailChecked(String email);
	
	List<MemberDto> memberLsit();
	
	MemberDto memberDetail(Long memberId);

}
