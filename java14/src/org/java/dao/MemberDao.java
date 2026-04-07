package org.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.java.connect.DBConnect;
import org.java.constraint.Role;
import org.java.dto.MemberDto;

public class MemberDao {

	////////////// ---싱글톤---////////////////////
	private MemberDao() {
		System.out.println("MemberDao -> 싱글톤");
	}

	private static class SingleTon {
		private static final MemberDao INSTANCE = new MemberDao();
	}

	public static MemberDao getInstance() {
		return SingleTon.INSTANCE;
	}
	////////////// ---싱글톤---////////////////////

	// 이메일확인 -> 회원상세조회1
	public MemberDto findByUserEmail(String userEmail) {
		// TODO Auto-generated method stub
		return null;
	}

	// 1.회원가입
	public int save(MemberDto memberDto) {
		// 실제 JDBC 회원입 기본 실행 예시
		Connection conn = null;
		String query = "";
		PreparedStatement pstm = null;
		int rs = 0;

		try {
			// 1.DB연동
			conn = DBConnect.getConnection();
			// 2.쿼리문 //id는 자동을 DB에서 증가 됨,입력안해도 된다.회원가입시에는 가입시간만
			query = "insert into  테이블명(userEmail,userPw,age,address,createTime values(?,?,?,?,?)";
			// 3.쿼리문실행
			pstm = conn.prepareStatement(query);
//			rs = pstm.executeUpdate();// 진짜 실행 -> 실제 DB에 회원가입
			// 성공하면 1
			rs = 1; // 회원가입 성공 1
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Connection,PreparedStatement 종료
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return rs;
	}

	public List<MemberDto> findAll() {

		List<MemberDto> memberList = new ArrayList<MemberDto>();

		Connection conn = null;
		String query = "";
		PreparedStatement pstm = null;
		ResultSet rs = null;// DB데이터 get

		// DB에서가져온 데이터
		memberList.add(new MemberDto(1L, "m1@email.com", "11", 50, "서울시 상계동", null, LocalDateTime.now(), null));
		memberList.add(new MemberDto(2L, "m2@email.com", "21", 60, "서울시 중계동", null, LocalDateTime.now(), null));
		memberList.add(new MemberDto(3L, "m3@email.com", "31", 20, "서울시 하계동", null, LocalDateTime.now(), null));
		memberList.add(new MemberDto(4L, "m4@email.com", "41", 30, "서울시 상계동", null, LocalDateTime.now(), null));
		memberList.add(new MemberDto(5L, "m5@email.com", "51", 40, "서울시 상계동", null, LocalDateTime.now(), null));

		return memberList;
	}

}
