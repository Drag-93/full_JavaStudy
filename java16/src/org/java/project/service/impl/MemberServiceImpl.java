package org.java.project.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.java.project.dao.MemberDao;
import org.java.project.dto.MemberDto;
import org.java.project.entity.MemberEntity;
import org.java.project.service.MemberService;

public class MemberServiceImpl implements MemberService{

	@Override
	public int memberInsert(MemberDto memberDto) {
		MemberDao dao= MemberDao.getInstance();		
		MemberEntity memberEntity= dao.findByUserEmail(memberDto.getUserEmail());		
		if(memberEntity!=null) {
			System.out.println(" 이미 이메일이 존재!");
			throw new IllegalArgumentException();
		}		
		//Dto -> Entity
		MemberEntity memberEntity2=  MemberEntity.toInsertMemberEntity(memberDto);		
		int rs=dao.save(memberEntity2);
//		int rs=dao.save(MemberEntity.toInsertMemberEntity(memberDto));		
		if(rs!=1) {
			System.out.println("회원가입 실패!");
			throw new RuntimeException();
		}		
		return rs;
	}
	@Override
	public List<MemberDto> memberDtos() {
		MemberDao dao= MemberDao.getInstance();
		//DB
		List<MemberEntity> memberEntities= dao.findAll();
		//사용자
		List<MemberDto> memberDtos=new ArrayList<MemberDto>();		
		//List<Entity> -> List<Dto>
		for(MemberEntity memberEntity: memberEntities) {
								//Entity -> Dto변환
			MemberDto memberDto=MemberDto.toMemberDto(memberEntity);
			//변환된 Dto -> memberDtos 추가
			memberDtos.add(memberDto);
		}
//
//		List<MemberDto> memberDtos2=memberEntities.stream()
//					.map(MemberDto::toMemberDto)
//					.collect(Collectors.toList());
		
		return memberDtos;// 변환된  List<Dto>

//		return MemberDao.getInstance().findAll().stream()
//						.map(MemberDto::toMemberDto)
//						.collect(Collectors.toList());
//		
	}
	@Override
	public MemberDto detail(Long memberId) {
		
		MemberDao dao= MemberDao.getInstance();
		MemberEntity memberEntity= dao.findById(memberId);
		
		MemberDto memberDto= MemberDto.toMemberDto(memberEntity);
		
		
		return memberDto;
	}
	@Override
	public int updateMember(MemberDto memberDto) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
