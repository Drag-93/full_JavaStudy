package org.java.project.service.impl;

import java.util.List;

import org.java.project.dto.MemberDto;
import org.java.project.service.MemberService;

public class MemberServiceImpl implements MemberService{
	//회원가입 -> 이메일 (중복 여부)도 조회 -> 등록(회원가입)전에 이메일 확인

	@Override
	public List<MemberDto> memberList() throws Exception {
		//findAll()
		return null;
	}


	@Override
	public int memberInsert(MemberDto memberDto) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
