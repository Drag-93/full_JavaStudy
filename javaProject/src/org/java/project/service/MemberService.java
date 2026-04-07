package org.java.project.service;

import java.util.List;

import org.java.project.dto.MemberDto;

public interface MemberService {

	//이메일 체크
	MemberDto emailChecked(String userEmail);
	//회원가입
	int insertMember(MemberDto memberDto);
	//회원수정
	int updateMember(MemberDto memberDto);
	//회원탈퇴
	int deleteMember(Long memberId);
	//회원목록조회
	List<MemberDto> memberList();
	//회원상세조회
	MemberDto memberDetail(Long memberId);
}
