package org.java.java12.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.java.java12.dto.MemberDto;

public interface MemerService {

	// 회원가입
	int insert(MemberDto memberDto) throws SQLException,IOException;
	int update(MemberDto memberDto) throws SQLException,IOException;
	int delete(String userEmail) throws SQLException;
	List<MemberDto> members() throws SQLException;

}
