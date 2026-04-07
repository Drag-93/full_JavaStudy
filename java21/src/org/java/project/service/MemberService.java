package org.java.project.service;

import org.java.project.dto.MemberDto;

public interface MemberService {
	//이메일 체크
	MemberDto emailChecked(String userEmail);
	//회원가입
	int insertMember(MemberDto memberDto);
	
	
}
