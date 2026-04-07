package org.project.service;

import java.util.List;

import org.project.dto.MemberDto;
//서비스
//@Service
public interface MemberService {

	// 회원가입
	int insertMember(MemberDto memberDto); // DTO-> Entity -> DB

	// 회원수정
	int updateMember(MemberDto memberDto); // DTO-> Entity -> DB

	// 회원삭제
	int deleteMember(Long memberId); 	// DTO-> Entity -> DB

	// 회원조회(목록)
	List<MemberDto> memberList(); 		// DB -> Entity ->DTO

	// 회원조회(상세조회)
	MemberDto memberDetail(Long memberId);// DB -> Entity ->DTO
	
	// 이메일 체크
	MemberDto memberEmail(String userEmail)  throws Exception;// DB -> Entity ->DTO

}
