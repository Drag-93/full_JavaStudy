package org.java.java13.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.java.java13.dto.MemberDto;

public interface MemberService {
	int save(MemberDto memberDto) throws SQLException,IOException;  //예외던지기
	int saveUpdate(MemberDto memberDto) throws SQLException;  //예외던지기
	int deleteById(String userEmail) throws SQLException;  //예외던지기
	List<MemberDto> findAll() throws SQLException;  //예외던지기
	MemberDto detail(String userEmail) throws IllegalAccessException;
}
