package org.project.service.impl;

import java.util.List;

import org.project.dto.MemberDto;
import org.project.service.MemberService;
import org.project.service.dao.MemberDao;

public class MemberServiceImpl implements MemberService{
	/*
	//DI
	//=====생성자로 MemberDao 주입=====
	private final MemberDao dao;
	
	private MemberServiceImpl(MemberDao dao) {
		this.dao=dao;
	}
	//=====생성자로 MemberDao 주입=====
	*/
	
	private final MemberDao dao =MemberDao.getInstance();
	
	
	@Override
	public int memberInsert(MemberDto memberDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int memberUpdate(MemberDto memberDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int memberDelete(MemberDto memberDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MemberDto emailChecked(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberDto> memberLsit() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberDto memberDetail(Long memberId) {
		// TODO Auto-generated method stub
		return null;
	}

}
