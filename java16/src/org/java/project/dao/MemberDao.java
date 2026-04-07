package org.java.project.dao;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.java.project.dto.MemberDto;
import org.java.project.entity.MemberEntity;
import org.java.project.role.Role;

public class MemberDao {

	//////////싱글톤 /////////////////
	private MemberDao() {
		System.out.println("싱글톤 ->  MemberDao");
	}

	private static class SingleTon {
		private static final MemberDao INSTANCE = new MemberDao();
	}

	public static MemberDao getInstance() {
		return SingleTon.INSTANCE;
	}
	//////////싱글톤 /////////////////
	//1.이메일조회
	public MemberEntity findByUserEmail(String userEmail) {
		// TODO Auto-generated method stub
		return null;
	}

	//2.회원가입
	public int save(MemberEntity memberEntity) {
		// TODO Auto-generated method stub
		return 0;
	}
	// 3.회원 목록조회
	public List<MemberEntity> findAll() {

		List<MemberEntity> members = new ArrayList<MemberEntity>();
		// MemberEntity -> 5명 추가
		members.add(new MemberEntity(1L, "m0@email.com", "11", 10, "서울", Role.ROLE_MEMBER, LocalDateTime.now(), null));
		members.add(new MemberEntity(2L, "m1@email.com", "11", 20, "서울", Role.ROLE_MEMBER, LocalDateTime.now(), null));
		members.add(new MemberEntity(3L, "m2@email.com", "11", 30, "서울", Role.ROLE_MEMBER, LocalDateTime.now(), null));
		members.add(new MemberEntity(4L, "m3@email.com", "11", 40, "서울", Role.ROLE_MEMBER, LocalDateTime.now(), null));
		members.add(new MemberEntity(5L, "m4@email.com", "11", 50, "서울", Role.ROLE_MEMBER, LocalDateTime.now(), null));

		
		return members;
	}
	public MemberEntity findById(Long memberId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
}
