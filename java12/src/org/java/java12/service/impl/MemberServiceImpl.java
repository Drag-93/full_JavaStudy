package org.java.java12.service.impl;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

import org.java.java12.dao.MemberDao;
import org.java.java12.dto.MemberDto;
import org.java.java12.service.MemberService;

public class MemberServiceImpl implements MemberService{

	@Override
	public int insert(MemberDto memberDto) throws SQLException, IOException {
		System.out.println("회원가입 서비스");
		MemberDao dao = MemberDao.getInstance();
		int rs = dao.save(memberDto);
		if(rs!=1) {
			System.out.println("회원가입 실패");
			throw new SQLException();
		}
		return rs;
	}
	@Override
	public int update(MemberDto memberDto) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int delete(String userEmail) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public List<MemberDto> members() throws SQLException {
		MemberDao dao=MemberDao.getInstance();
		List<MemberDto> memberList=dao.findAll();
		memberList.add(new MemberDto(1, "m1@email.com","1111", "m1", null, LocalDateTime.now(), null));
		memberList.add(new MemberDto(2, "m2@email.com","1111", "m2", null, LocalDateTime.now(), null));
		memberList.add(new MemberDto(3, "m3@email.com","1111", "m3", null, LocalDateTime.now(), null));
		memberList.add(new MemberDto(4, "m4@email.com","1111", "m4", null, LocalDateTime.now(), null));
		memberList.add(new MemberDto(5, "m5@email.com","1111", "m5", null, LocalDateTime.now(), null));
		return null;
	}
}
