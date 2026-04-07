package org.java.service.impl;

import java.util.List;

import org.java.dao.MemberDao;
import org.java.dto.MemberDto;
import org.java.service.MemberService;

public class MemberServiceImpl implements MemberService {

	@Override
	public int memberInsert(MemberDto memberDto) {
		System.out.println("회원가입 서비스");

		MemberDao dao = MemberDao.getInstance();
		//1.이메일이 있는지 확인
		MemberDto member= dao.findByUserEmail(memberDto.getUserEmail());
		if(member!=null) {
			System.out.println("회원(이메일)이 존재합니다. 다시 회원가입해주세요!");
			throw new IllegalArgumentException();
		}
		
		int rs = dao.save(memberDto);
		if(rs!=1) {
			System.out.println("회원가입 실패!");
			throw new IllegalArgumentException();
		}
		System.out.println("회원가입성공!");
		
		return rs;
	}

	@Override
	public List<MemberDto> memberList() {
		System.out.println("회원조회(목록) 서비스");
		
		MemberDao dao= MemberDao.getInstance();
		List<MemberDto> memberDtos= dao.findAll();
		
		if(memberDtos.isEmpty()) {
			System.out.println("조회할 목록이 없습니다!");
			throw new NullPointerException();
		}
		
		return memberDtos;
	}

}
