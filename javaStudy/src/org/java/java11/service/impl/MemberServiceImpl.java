package org.java.java11.service.impl;

import java.util.List;

import org.java.java11.dao.MemberDao;
import org.java.java11.dto.MemberDto;
import org.java.java11.service.MemberService;

public class MemberServiceImpl implements MemberService{
	@Override
	public int save(MemberDto memberDto) {
		MemberDao dao = MemberDao.getInstance();
		
		int rs=dao.save(memberDto);
		System.out.println("회원가입");
		return 0;
	}
	
	@Override
	public int saveUpdate(MemberDto memberDto) {
		MemberDao dao = MemberDao.getInstance();
		
		int rs=dao.saveUpdate(memberDto);
		System.out.println("회원수정");
		return 0;
	}
	
	@Override
	public int deleteById(MemberDto memberId) {
		MemberDao dao = MemberDao.getInstance();
		
		int rs=dao.deleteById(memberId);
		System.out.println("회원탈퇴");
		return 0;
	}
	
	@Override
	public List<MemberDto> findAll() {
		MemberDao dao = MemberDao.getInstance();
		List<MemberDto> list = dao.findAll();
		System.out.println("회원조회");
		return null;
	}
	

}
