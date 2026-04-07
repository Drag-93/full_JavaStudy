package org.project.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.project.dao.MemberDao;
import org.project.dto.MemberDto;
import org.project.entity.MemberEntity;
import org.project.service.MemberService;

public class MemberServiceImpl implements MemberService {

	// 이메일 체크
	@Override
	public MemberDto memberEmail(String userEmail) throws Exception {
		// 이메일(중복불가능) 화인
		MemberDao dao = MemberDao.getInstance();
		// 이메일이 있는 지 확인
		MemberEntity memberEntity = dao.findByUserEmail(userEmail);

		if (memberEntity != null) {
			// 회원존재
			System.out.println((" 이메일이 이미 존재합니다!!"));
			return MemberDto.toMemberDto(memberEntity);
		}
		return null;
	}

	@Override
	public int insertMember(MemberDto memberDto) {
		System.out.println("회원가입");
		// 이메일(중복불가능) 화인
		MemberDao dao = MemberDao.getInstance();
		// 이메일이 있는 지 확인
//		MemberEntity memberEntity = dao.findByUserEmail(memberDto.getUserEmail());
//
//		if (memberEntity != null) {
//			// 회원존재
//			throw new IllegalArgumentException(" 이메일이 이미 존재합니다!!");
//		}
//   	    MemberEntity memberEntity2= MemberEntity.toInsertMemberEntity(memberDto);
//		int rs = dao.save(memberEntity2);
		// 회원가입 가능ㅇ
		// Dto -> Entity
		int rs = dao.save(MemberEntity.toInsertMemberEntity(memberDto));

		if (rs == 1) {
			System.out.println("회원가입 Success!!");
		}
		return rs;
	}

	@Override
	public MemberDto memberDetail(Long memberId) {

		MemberDao dao = MemberDao.getInstance();

		MemberEntity memberEntity = dao.findById(memberId);

		if (memberEntity == null) {
			System.out.println("조회할 회원이 없습니다!");
			throw new IllegalArgumentException();
		}

		MemberDto memberDto = MemberDto.toMemberDto(memberEntity);
		return memberDto;

//		return MemberDto.toMemberDto(memberEntity);
	}

	@Override
	public List<MemberDto> memberList() {
		MemberDao dao = MemberDao.getInstance();

		List<MemberEntity> memberEntities = dao.findAll();
		// List<Entity> -> List<Dto>
		List<MemberDto> memberDtos=new ArrayList<MemberDto>();
		
//		if(memberEntities==null) {
		if(memberEntities.isEmpty()) {
			System.out.println("조회할 목록이 없습니다!");
			throw new NullPointerException();
		}
		for(MemberEntity memberEntity: memberEntities) {
			//Entity -> Dto
			MemberDto memberDto=MemberDto.toMemberDto(memberEntity);
			memberDtos.add(memberDto);
//			memberDtos.add(MemberDto.toMemberDto(memberEntity));			
		}
		return memberDtos;
		
//	   List<MemberDto> memberDtos2=	memberEntities.stream()
//					.map(MemberDto::toMemberDto)
//					.collect(Collectors.toList());		
//		return memberDtos2;

		
//		return memberEntities.stream()
//				.map(MemberDto::toMemberDto)
//				.collect(Collectors.toList());		
		
//		return MemberDao.getInstance().findAll().stream()
//				.map(MemberDto::toMemberDto)
//				.collect(Collectors.toList());
	}

	@Override
	public int updateMember(MemberDto memberDto) {
		MemberDao dao = MemberDao.getInstance();
		
		MemberEntity memberEntity= dao.findById(memberDto.getMemberId());
		
		if(memberEntity==null) {
			System.out.println("아이디가 없습니다!");
			// 입력값예외 
			throw new IllegalArgumentException();			
		}		
		
		// 반드시 아이디가 존재 해야된다. 
		int rs=dao.saveUpdate(MemberEntity.toUpdateMemberEntity(memberDto));
		
		if (rs == 1) {
			System.out.println("회원수장 Success!!");
		}
		
		return rs;
	}

	@Override
	public int deleteMember(Long memberId) {
		MemberDao dao = MemberDao.getInstance();

		MemberEntity memberEntity= dao.findById(memberId);
		
		if(memberEntity==null) {
			System.out.println("아이디가 없습니다!");
			// 입력값예외 
			throw new IllegalArgumentException();			
		}
		
		
		int rs=dao.deleteById(memberId);
		if (rs == 1) {
			System.out.println("회원틸퇴 Success!!");
		}
		
		return rs;
	}
	
	
}
