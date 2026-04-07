package org.java.project.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.java.project.dao.MemberDao;
import org.java.project.dto.MemberDto;
import org.java.project.entity.MemberEntity;
import org.java.project.service.MemberService;

public class MemberServiceImpl implements MemberService{

	@Override
	public MemberDto emailChecked(String userEmail) {
		System.out.println("이메일 체크");
		
		MemberDao dao=MemberDao.getInsatance();
		MemberEntity memberEntity=dao.findByUserEmail(userEmail);
		if(memberEntity !=null) {
			System.out.println("이미 가입된 회원");
			throw new IllegalArgumentException();
		}
			
		return MemberDto.toMemberDto(memberEntity);
	}

	@Override
	public int insertMember(MemberDto memberDto) {
		System.out.println("회원가입");
		MemberDao dao=MemberDao.getInsatance();
//		1.이메일체크
		MemberEntity memberEntity = dao.findByUserEmail(memberDto.getUserEmail());
		if(memberEntity !=null) {
			System.out.println("이미 존재하는 이메일");
			throw new IllegalArgumentException();
		}
		
//		2.회원가입
		MemberEntity memberEntity2 =MemberEntity.toInsertMemberEntity(memberDto);
		int rs = dao.save(memberEntity2);
		if(rs!=1) {
			System.out.println("회원가입 실패");
			throw new RuntimeException();
		}else {
			System.out.println("회원가입 성공");
		}
		return rs;
	}

	@Override
	public int updateMember(MemberDto memberDto) {
		System.out.println("회원수정");
		MemberDao dao =MemberDao.getInsatance();
//		1.회원유무조회(id)
		MemberEntity memberEntity=dao.findById(memberDto.getMemberId());
		if(memberEntity==null) {
			System.out.println("가입된 회원이 아닙니다");
			throw new IllegalArgumentException();
		}
//		2.회원 정보 수정
		MemberEntity memberEntity2=MemberEntity.toUpdateMemberEntity(memberDto);
		int rs = dao.saveUpdate(memberEntity2);
		if(rs!=1) {
			System.out.println("회원수정 실패");
			throw new RuntimeException();
		}else {
			System.out.println("회원수정 성공");
		}
		return rs;
	}

	@Override
	public int deleteMember(Long memberId) {
		System.out.println("회원탈퇴");
		MemberDao dao=MemberDao.getInsatance();
		
		MemberEntity memberEntity=dao.findById(memberId);
		if(memberEntity==null) {
			System.out.println("가입된 회원이 아닙니다.");
			throw new IllegalArgumentException();
			}
		int rs=dao.delete(memberId);
		if(rs!=1) {
			System.out.println("회원탈퇴 실패");
			throw new RuntimeException();
		}else {
			System.out.println("회원탈퇴 성공");
		}
		
		return rs;
	}

	@Override
	public List<MemberDto> memberList() {
		System.out.println("회원 목록 조회");
		MemberDao dao=MemberDao.getInsatance();
		
		List<MemberEntity> memberEntities=dao.findAll();
		
		if(memberEntities.isEmpty()) {
			System.out.println("가입된 회원이 없습니다.");
			throw new NullPointerException();
		}
		List<MemberDto> memberDtos=new ArrayList<MemberDto>();
		for(MemberEntity memberEntity: memberEntities) {
			MemberDto memberDto=MemberDto.toMemberDto(memberEntity);
			memberDtos.add(memberDto);
		}
		
		return memberDtos;

	}

	@Override
	public MemberDto memberDetail(Long memberId) {
		System.out.println("회원 상세 조회");
		MemberDao dao=MemberDao.getInsatance();
				
		MemberEntity memberEntity=dao.findById(memberId);
		if(memberEntity==null) {
			System.out.println("가입된 회원이 아닙니다.");
			throw new IllegalArgumentException();
		}
		
		return MemberDto.toMemberDto(memberEntity);
	}

	
}
