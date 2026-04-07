package org.java.java10.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.java.java10.dbConnect.DBConnect;
import org.java.java10.dto.MemberDto;

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

	// 1. 회원가입
	public int save(MemberDto memberDto) {

		Connection conn = null; // DB연동
		String query = ""; // 실제 Query문
		PreparedStatement pstm = null; // SQL실행

		int rs = 1;

		// 1.DB연동
		DBConnect.getConnection();
		// JDBC , Oracle,Mysql
		System.out.println("===============");
		System.out.println(memberDto.getMemberId());
		System.out.println(memberDto.getUserEmail());
		System.out.println(memberDto.getUserPw());
		System.out.println(memberDto.getRole());
		System.out.println("===============");

		return rs; // 회원가입성공하면 1반환, 실패면 나멎0

	}

	// 2. 회원수정
	public int saveUpdate(MemberDto memberDto) {
		Connection conn = null; // DB연동
		String query = ""; // 실제 Query문
		PreparedStatement pstm = null; // SQL실행

		int rs = 1;
		// 1.DB연동
		DBConnect.getConnection();
		// JDBC , Oracle,Mysql
		System.out.println("===============");
		System.out.println(memberDto.getMemberId());
		System.out.println(memberDto.getUserEmail());
		System.out.println(memberDto.getUserPw());
		System.out.println(memberDto.getRole());
		System.out.println("===============");

		return rs = 1;
	}

	// 3. 회원탈퇴
	public int deleteByIt(int memberId) {
		Connection conn = null; // DB연동
		String query = ""; // 실제 Query문
		PreparedStatement pstm = null; // SQL실행

		int rs = 1;
		// 1.DB연동
		DBConnect.getConnection();
		// JDBC , Oracle,Mysql
		System.out.println("===============");
		System.out.println("탈퇴아이디: " + memberId);
		;
		System.out.println("===============");

		return rs = 1;
	}

	// 4. 회원 목목조회  // 컬렉션 프레임워크 -> 제네릭타입 
	public List<MemberDto> findAll() {
		List<MemberDto> members = new ArrayList<MemberDto>();

		Connection conn = null; // DB연동
		String query = ""; // 실제 Query문
		PreparedStatement pstm = null; // SQL실행
		ResultSet rs = null;// DB 데이터를 get

		System.out.println("=======================");
		System.out.println("=====회원목록데이터GET=====");
		members.add(new MemberDto(1, "m1@11", "11", null, null, null));
		System.out.println("=======================");
		return members;
	}

	
}