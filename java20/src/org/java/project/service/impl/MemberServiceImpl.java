package org.java.project.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.management.RuntimeErrorException;

import org.java.project.dao.MemberDao;
import org.java.project.dto.MemberDto;
import org.java.project.entity.MemberEntity;
import org.java.project.service.MemberService;

public class MemberServiceImpl implements MemberService {

	@Override
	public MemberDto emailChecked(String userEmail) {
		System.out.println("이메일체크");

		MemberDao dao = MemberDao.getInstance();
		MemberEntity memberEntity = dao.findByUserEmail(userEmail);
		if (memberEntity != null) {
			System.out.println("이미 존재하는 이메일");
			throw new IllegalArgumentException();
		} 
		

		return MemberDto.toInsertMemberDto(memberEntity);
	}

	@Override
	public int insertMember(MemberDto memberDto) {
		
		MemberDao dao = MemberDao.getInstance();
		//1. 이메일 체크
		MemberEntity memberEntity=dao.findByUserEmail(memberDto.getUserEmail());
		if(memberEntity!=null) {
			System.out.println("이미 존재하는 이메일");
			throw new IllegalArgumentException();
		}
		//이메일이 없으면(회원이 등록되지 않음) 회원가입 실행
		
//		int rs=dao.save(MemberEntity.toInsertMemberEntity(memberDto));
		//2. 회원가입
		//DTO -> Entity
		MemberEntity memberEntity2 =MemberEntity.toInsertMemberEntity(memberDto);
		int rs = dao.save(memberEntity2);
		
		if(rs!=1) {
			System.out.println("회원가입 실패");
			throw new RuntimeException();
		}
		
		return rs;
	}

	@Override
	public int updateMember(MemberDto memberDto) {
		System.out.println("회원수정");
		
		//아이디체크
		MemberDao dao=MemberDao.getInstance();
		MemberEntity memberEntity = dao.findById(memberDto.getMemberId());
		if(memberEntity==null) {
			System.out.println("회원이 존재하지 않습니다");
			throw new IllegalArgumentException();
		}
		
		MemberEntity memberEntity2 = MemberEntity.toUpdateMemberEntity(memberDto);
		
		int rs=dao.update(memberEntity2);
		
		if(rs!=1) {
			System.out.println("회원수정 실패");
			throw new RuntimeException();
		}
		return rs;
	}

	@Override
	public int deleteMember(Long memberId) {
		MemberDao dao= MemberDao.getInstance();
		//아이디 체크		
		MemberEntity memberEntity=  dao.findById(memberId);
		
		if(memberEntity==null) {
			System.out.println("아이디가 존재하지 않습니다(회원아님)");
			throw new IllegalArgumentException();
		}
		
		int rs=dao.deleteById(memberId);
		
		if(rs!=1) {
			System.out.println("회원수정 실패!");
			throw new RuntimeException();
		}
		
		return rs;
	}
	@Override
	public List<MemberDto> memberList() {
		MemberDao dao=MemberDao.getInstance();
		
		List<MemberEntity> memberEntities = dao.findAll();
		
		if(memberEntities.isEmpty()) {
			System.out.println("조회할 목록이 없습니다.");
			throw new NullPointerException();
		}
		//List<Entity> -> List<Dto>
//		List<MemberDto> memberDtos=new ArrayList<MemberDto>();
		
//		//1.forEach
//		for(MemberEntity memberEntity: memberEntities) {
//			MemberDto memberDto = MemberDto.toInsertMemberDto(memberEntity);
//
//			memberDtos.add(memberDto);
//		}
//		return memberDtos;
				
		List<MemberDto> memberDtos2= memberEntities.stream()
				.map(MemberDto::toInsertMemberDto)
				.collect(Collectors.toList());
		return memberDtos2;
	}

	@Override
	public MemberDto memberDetail(Long memberId) {
		
		System.out.println("회원 상세 조회");

		MemberDao dao = MemberDao.getInstance();
		MemberEntity memberEntity = dao.findById(memberId);
		
		if (memberEntity == null) {
			System.out.println("아이디가 존재하지 않습니다");
			throw new IllegalArgumentException();

		} 

		return MemberDto.toInsertMemberDto(memberEntity);
	}

}
