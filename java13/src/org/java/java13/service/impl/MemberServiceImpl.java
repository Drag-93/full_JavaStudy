package org.java.java13.service.impl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.java.java13.dao.MemberDao;
import org.java.java13.dto.MemberDto;
import org.java.java13.service.MemberService;

public class MemberServiceImpl implements MemberService{
	@Override
	public int save(MemberDto memberDto) throws SQLException, IOException {
		System.out.println("회원가입 서비스");
		MemberDao dao=MemberDao.getInstance();
		int result=dao.save(memberDto);
		return result;
	}
	@Override
	public int saveUpdate(MemberDto memberDto) throws SQLException {
		System.out.println("회원수정 서비스");
		MemberDao dao=MemberDao.getInstance();
		int result=dao.saveUpdate(memberDto);
		return result;
	}
	@Override
	public int deleteById(String userEmail) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public List<MemberDto> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public MemberDto detail(String userEmail) throws IllegalAccessException {
		System.out.println("회원 상세 조회 서비스");
		MemberDao dao = MemberDao.getInstance();
		MemberDto member = dao.findByUserEmail(userEmail);
		if(member==null) {
			System.out.println("회원조회 실패");
			throw new IllegalAccessException();
		}
		return member;
	}
}
