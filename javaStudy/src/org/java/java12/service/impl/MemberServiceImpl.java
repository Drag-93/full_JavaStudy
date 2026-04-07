package org.java.java12.service.impl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.java.java12.dao.MemberDao;
import org.java.java12.dto.MemberDto;
import org.java.java12.service.MemerService;

public class MemberServiceImpl implements MemerService {

	@Override
	public int insert(MemberDto memberDto) throws SQLException, IOException {
		System.out.println("회원가입 서비스");
		MemberDao dao = MemberDao.getInstance();
		int rs = dao.insert(memberDto);
		if(rs != 1) {
			System.out.println("회원가입 실패!");
			throw new SQLException();
		}
		
		return 0;
	}

	@Override
	public int update(MemberDto memberDto) throws SQLException, IOException {
		System.out.println("회원수정 서비스");
		MemberDao dao = MemberDao.getInstance();
		int rs = dao.update(memberDto);
		if (rs != 1) {
			System.out.println("회원수정 실패!");
			throw new SQLException();
		}
		
		return 0;
	}

	@Override
	public int delete(String userEmail) throws SQLException {
		System.out.println("회원탈퇴 서비스");
		MemberDao dao = MemberDao.getInstance();
		int rs = dao.delete(userEmail);
		if (rs != 1) {
			System.out.println("회원탈퇴 실패!");
			throw new SQLException();
		}
		
		return 0;
	}

	@Override
	public List<MemberDto> members() throws SQLException {
		System.out.println("회원목록 조회 서비스");
		MemberDao dao = MemberDao.getInstance();
		List<MemberDto> memberList = dao.members();
		if (memberList == null) {
			System.out.println("회원조회 실패!");
			throw new SQLException();
		}
		
		return memberList;
	}

	
}
