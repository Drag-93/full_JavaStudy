package org.java.java9.dao;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.java.java9.dto.MemberDto;
import org.java.java9.role.Role;

//DAO(Database Access Object)-> DB에 접근해서 일처리하는 객체(CRUD,,)
//Spring boot JPA -> Repository
public class MemberDao {
	//--------------------SingleTon--------------------//
	private MemberDao() {
		
	}
	private static class SingleTon{
		private static final MemberDao INSTANCE=new MemberDao();
	}
	public static MemberDao getInstance() {
		return SingleTon.INSTANCE;
	}
	//-------------------------------------------------//
	//1. 회원가입
	public int save(int memberId,
			String userEmail,
			String userPw,
			Role role,
			LocalDateTime createTime,
			LocalDateTime updateTime) {
		System.out.println("회원가입");
		
		System.out.print(memberId+" ");
		System.out.print(userEmail+" ");
		System.out.print(userPw+" ");
		System.out.print(role+" ");
		System.out.print(LocalDateTime.now());
		System.out.print(null+" ");
		
		
		return 1;
	}
	//2. 회원수정
	public int saveUpdate(int memberId,
			String userEmail,
			String userPw,
			Role role,
			LocalDateTime createTime,
			LocalDateTime updateTime) {
		System.out.println("회원수정");
		
		System.out.print(memberId+" ");
		System.out.print(userEmail+" ");
		System.out.print(userPw+" ");
		System.out.print(role+" ");
		System.out.print(LocalDateTime.now());
		System.out.print(null+" ");
		return 1;
	}
	//3. 회원탈퇴
	public int deleteById(int memberId) {
		System.out.println("회원탈퇴");
		
		System.out.println(memberId+"삭제");
		
		return 1;
	}
	//4. 회원조회(목록)
	public List<String> findAll(){
		System.out.println("회원조회(목록)");
		//컬렉션 -> List<E>
		List<String> list=new ArrayList<String>();
		list.add("회원1");
		list.add("회원2");
		list.add("회원3");
		list.add("회원4");
		list.add("회원5");
		list.add("회원6");
		list.add("회원7");

		return list;
	}
	
	
	
	
	
	
}
