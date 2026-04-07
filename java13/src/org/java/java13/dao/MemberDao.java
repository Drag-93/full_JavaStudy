package org.java.java13.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.java.java13.connect.DBConnect;
import org.java.java13.constraint.Role;
import org.java.java13.dto.MemberDto;

public class MemberDao {
	//=======================싱글톤=======================
	private MemberDao() {
		System.out.println("MemberDao<<-싱글톤");
	}
	private static class SingletonClass{
		private static final MemberDao INSTANCE=new MemberDao();
	}
	public static MemberDao getInstance() {
		return SingletonClass.INSTANCE;
	}
	//=======================싱글톤=======================
	
	//회원가입
	public int save(MemberDto memberDto) {
		System.out.println("회원가입 Dao");
		int rs=0;
//		1.DB연동
		Connection conn =null;
//		2.SQL문 실행->insert ~ into
		String query="";
//		3.연결 실행객체
		PreparedStatement pstm=null;
		try {
			conn = DBConnect.getConnection();
			query = "insert into 회원테이블 values(?,?,?,?,?,?,?)";
			System.out.println(memberDto.toString());
			System.out.println(query);
			
//		4. 결과 반환 1-> 성공, 나머지 -> 실패
			rs=1;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//DB연동 객체
			try {
				if(conn !=null) {
					conn.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return rs;
	}
	//회원수정
	public int saveUpdate(MemberDto memberDto) {
		System.out.println("회원수정 Dao");
		int rs=1;
		
		return rs;
	}
	//회원탈퇴
	public int deleteByEmail(String userEmail) {
		System.out.println("회원탈퇴 Dao");
		int rs=1;
		
		return rs;
	}
	//회원조회(목록)
	public List<MemberDto> findAll(){
		System.out.println("회원조회 Dao");
		
		List<MemberDto> memList=new ArrayList<MemberDto>();
		memList.add(new MemberDto(1, "m1@email.com", "1111", "m1", Role.ROLE_MEMBER, LocalDateTime.now(), null));
		memList.add(new MemberDto(2, "m2@email.com", "1111", "m2", Role.ROLE_MEMBER, LocalDateTime.now(), null));
		memList.add(new MemberDto(3, "m3@email.com", "1111", "m3", Role.ROLE_MEMBER, LocalDateTime.now(), null));
		memList.add(new MemberDto(4, "m4@email.com", "1111", "m4", Role.ROLE_MEMBER, LocalDateTime.now(), null));
		memList.add(new MemberDto(5, "m5@email.com", "1111", "m5", Role.ROLE_MEMBER, LocalDateTime.now(), null));
		
		return memList;
	}
	//상세조회

	public MemberDto findByUserEmail(String userEmail) {
		System.out.println("회원 상세 조회 Dao");
		
		
		
		return null;
	}
	
	
	
	
	
}
