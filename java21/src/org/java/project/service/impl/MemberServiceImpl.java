package org.java.project.service.impl;

import org.java.project.dao.MemberDao;
import org.java.project.dto.MemberDto;
import org.java.project.entity.MemberEntity;
import org.java.project.service.MemberService;

public class MemberServiceImpl implements MemberService{
	@Override
	public MemberDto emailChecked(String userEmail) {
		System.out.println("이메일 체크");
		
		
		
		return null;
	}
	@Override
	public int insertMember(MemberDto memberDto) {
		MemberDao dao=MemberDao.getInstance();
		//1.이메일체크
		
		
		//2.회원가입
		
		return 0;
	}
	

}
