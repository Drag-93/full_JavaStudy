package org.java.project.service;

import java.util.List;

import org.java.project.dto.MemberDto;

public interface MemberService {

	//등록
	int memberInsert(MemberDto memberDto)throws Exception;
	//수정
	//삭제
	
	//조회
	List<MemberDto> memberList() throws Exception;
	

	
}
