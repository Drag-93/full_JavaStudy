package org.java.service;

import java.util.List;

import org.java.dto.MemberDto;

public interface MemberService {

	int memberInsert(MemberDto memberDto);
	List<MemberDto> memberList();
}
