package org.java.java12.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.java.java12.dto.MemberDto;

//@Service
public interface MemberService {
	//회원관련 service
	//회원가입
	int insert(MemberDto memberDto) throws SQLException,IOException;//이미지,파일
	//회원수정
	int update(MemberDto memberDto)throws SQLException;
	//회원탈퇴
	int delete(String userEmail)throws SQLException;
	//회원조회(목록)
	List<MemberDto> members() throws SQLException;
	
}
