package org.java.project.service.impl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.java.project.dao.MemberDao;
import org.java.project.dto.MemberDto;
import org.java.project.entity.MemberEntity;
import org.java.project.service.MemberService;

// @Service	-> 스프링빈 
public class MemberServiceImpl implements MemberService {

	// 이베일(중복불가능)도 조회 -> 등록전(회원가입)전에 이메일 확익
	@Override
	public MemberDto memberEmail(String userEmail) throws Exception {

		MemberDao dao = MemberDao.getInstance();

		MemberEntity memberEntity = dao.findByUserEmail(userEmail);

		if (memberEntity != null) {
			System.out.println("이메일이 존재합니다!!");
			throw new IllegalArgumentException();
//			return MemberDto.toMemberDto(memberEntity);			
		}

		return null;
	}

	@Override
	public int insertMember(MemberDto memberDto) throws IOException, SQLException {

		MemberDao dao = MemberDao.getInstance();
		// 먼저 이메일이 있는지 체크

		// Dto-> Entity
		MemberEntity memberEntity = MemberEntity.toInsertMemberEntity(memberDto);

		int rs = dao.save(memberEntity);
		if (rs != 1) {
			System.out.println("회원가입 실패");
			throw new RuntimeException();
		}

		return rs;
	}

	@Override
	public MemberDto memberDetail(Long memberId) {
		System.out.println("아이디 조회");

		MemberDao dao = MemberDao.getInstance();
		// 등록된 회원, 상품등에 상세 조회, 장바구니,결제정보,,
		MemberEntity memberEntity = dao.findById(memberId);

		if (memberEntity != null) {
			System.out.println("아이디가 존재합니다!");
			throw new IllegalArgumentException();
		}
		System.out.println("회원이 존재 하지 않습니다! ");

		return null;
	}

	@Override
	public List<MemberDto> memberList() throws IOException, SQLException {
		MemberDao dao = MemberDao.getInstance();

		List<MemberEntity> memberEntities = dao.findAll();

		return null;
	}

}
