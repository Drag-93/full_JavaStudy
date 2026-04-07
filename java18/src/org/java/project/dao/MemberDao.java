package org.java.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.java.project.connect.DBConnect;
import org.java.project.constraint.Role;
import org.java.project.entity.MemberEntity;

public class MemberDao {

	////////// 싱글톤 /////////////////
	private MemberDao() {
		System.out.println("싱글톤 ->  MemberDao");
	}

	private static class SingleTon {
		private static final MemberDao INSTANCE = new MemberDao();
	}

	public static MemberDao getInstance() {
		return SingleTon.INSTANCE;
	}

	////////// 싱글톤 /////////////////
	// 이메일체크
	public MemberEntity findByUserEmail(String userEmail) {

		Connection conn = null; // DB연동
		PreparedStatement pstm = null; // 쿼리문 처리
		ResultSet rs = null; // select 결과 return
		String query = ""; // 쿼리문

		MemberEntity memberEntity = null;

		try {
			conn = DBConnect.getConnection();
			query = "select * from member2 where userEmail=? ";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userEmail); // 쿼리문 실행 객체

			rs = pstm.executeQuery(); // select -> 실제 실행

			// DB에 레코드가 있으면
			while (rs.next()) {
				memberEntity = new MemberEntity(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getInt(4),
						rs.getString(5), Role.valueOf(rs.getString(6)), // String -> Role 변환
						rs.getTimestamp(7).toLocalDateTime(), // timeStamp -> LocalDateTime
						null);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return memberEntity;
	}

	// 회원가입
	public int save(MemberEntity memberEntity) {

		Connection conn = null; //Db연동객체
		PreparedStatement pstm = null; //QUery문처리 객체
		String query = ""; //쿼리문

		int rs = 0; //결과값 반환

		try {
			conn = DBConnect.getConnection();
			query = "insert into member2(memberId,userEmail,userPw,age, address,role)"
					+ "values(seq_member_id.NEXTVAL,?,?,?,?,?)";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, memberEntity.getUserEmail());
			pstm.setString(2, memberEntity.getUserPw());
			pstm.setInt(3, memberEntity.getAge());
			pstm.setString(4, memberEntity.getAddress());
			pstm.setString(5, memberEntity.getRole().toString());

			// 회원가입 성공 1, 나머지 실패
			rs = pstm.executeUpdate();// 회원가입, 회원수정, 회원 탈퇴,insert,update,delete

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)					conn.close();
				if (pstm != null)					pstm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return rs;

	}

	// 회원상세조회, 상품상세조회, 게시글 상세조회
	

	public List<MemberEntity> findAll() {

		Connection conn = null; // DB연동
		PreparedStatement pstm = null; // 쿼리문 처리
		ResultSet rs = null; // select 결과 return
		String query = ""; // 쿼리문

		List<MemberEntity> memberEntities = new ArrayList<MemberEntity>();

		try {
			conn = DBConnect.getConnection();
			query = "select * from member2 ";
			pstm = conn.prepareStatement(query);

			rs = pstm.executeQuery(); // select -> 실제 실행

			// DB에 레코드가 있으면
			while (rs.next()) {
				memberEntities.add(new MemberEntity(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getInt(4),
						rs.getString(5), Role.valueOf(rs.getString(6)), // String -> Role 변환
						rs.getTimestamp(7).toLocalDateTime(), // timeStamp -> LocalDateTime
						null));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return memberEntities;
	}

	public MemberEntity findById(Long memberId) {

		Connection conn = null; // DB연동
		PreparedStatement pstm = null; // 쿼리문 처리
		ResultSet rs = null; // select 결과 return
		String query = ""; // 쿼리문

		MemberEntity memberEntity = null;

		try {
			conn = DBConnect.getConnection();
			query = "select * from member2 where memberId=? ";
			pstm = conn.prepareStatement(query);

			pstm.setLong(1, memberId); // 쿼리문 실행 객체

			rs = pstm.executeQuery(); // select -> 실제 실행

			// DB에 레코드가 있으면
			while (rs.next()) {
				memberEntity = new MemberEntity(rs.getLong(1), 
						rs.getString(2), 
						rs.getString(3),
						rs.getInt(4),
						rs.getString(5), Role.valueOf(rs.getString(6)), // String -> Role 변환
						rs.getTimestamp(7).toLocalDateTime(), // timeStamp -> LocalDateTime
						null);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)					conn.close();
				if (pstm != null)					pstm.close();
				if (rs != null)					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return memberEntity;
	}

}
