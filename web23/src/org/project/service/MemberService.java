package org.project.service;

import java.util.List;

import org.project.dto.MemberDto;

public interface MemberService {
	//회원가입
	int memberInsert(MemberDto memberDto);
	//수정
	int memberUpdate(MemberDto memberDto);
	//삭제
	int memberDelete(Long memberId);
	//이메일체크
	MemberDto emailChecked(String email);
	//목록 조회
	List<MemberDto> memberList();
	//상세 조회
	MemberDto memberDetail(Long memberId);

}
