package org.java.project.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.java.project.dto.MemberDto;

//@Service
public interface MemberService {

	// 이메일 체크// DB -> Entity ->DTO
	MemberDto memberEmail(String userEmail) throws Exception;
	
	// 회원가입 // DTO-> Entity -> DB
	int insertMember(MemberDto memberDto) throws IOException,SQLException; 

	// 회원조회(목록)// DB -> Entity ->DTO
	List<MemberDto> memberList() throws IOException,SQLException; 			

	// 회원조회(상세조회)// DB -> Entity ->DTO
	MemberDto memberDetail(Long memberId) throws Exception;

}
