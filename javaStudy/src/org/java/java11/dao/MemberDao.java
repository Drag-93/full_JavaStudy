package org.java.java11.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.java.java11.dbConnect.DBConnect;
import org.java.java11.dto.MemberDto;

//@Repository
public class MemberDao {

	// ----------------------싱글톤-----------------------------------//
	private MemberDao() {
		System.out.println("싱글톤 -> MemberDao");
	}

	// 내부클래스
	private static class SingleTon {
		private static final MemberDao INSTANCE = new MemberDao();
	}

	// 외부에서 static
	public static MemberDao getInstance() {
		return SingleTon.INSTANCE;
	}
	// ---------------------------------------------------------//

	
	
	//1. 회원 가입
	public int save(MemberDto memberDto) {
		
		Connection conn = null;
		String query="";//쿼리문
		PreparedStatement pstm=null;// 쿼리문 처리 객체
		int rs=0; // 결과 1이면 성공, 나머지 실패
		
		//1.DB연동
		DBConnect.getConnection();
		return 0;
	}


	//2. 회원수정
	public int saveUpdate(MemberDto memberDto) {
		Connection conn = null;
		String query="";//쿼리문
		PreparedStatement pstm=null;// 쿼리문 처리 객체
		int rs=0; // 결과 1이면 성공, 나머지 실패
		
		//1.DB연동
		DBConnect.getConnection();
		return 0;
	}


	//3. 회원탈퇴
	public int deleteById(MemberDto memberDto) {
		Connection conn = null;
		String query="";//쿼리문
		PreparedStatement pstm=null;// 쿼리문 처리 객체
		int rs=0; // 결과 1이면 성공, 나머지 실패
		
		//1.DB연동
		DBConnect.getConnection();
		
		return 0;
	}


	//4. 회원 목록 조회
	public List<MemberDto> findAll() {
		Connection conn = null;
		String query="";//쿼리문
		PreparedStatement pstm=null;// 쿼리문 처리 객체
		ResultSet rs = null;//DB데이터 조회
		
		//1.DB연동
		DBConnect.getConnection();
		
		return null;
	}


	
}