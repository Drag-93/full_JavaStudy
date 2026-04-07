package org.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.project.connect.DBConnect;
import org.project.constraint.Role;
import org.project.entity.MemberEntity;

public class MemberDao {

	// ================싱글톤 ================//
	private MemberDao() {
		System.out.println("싱글톤 ->  MemberDao");
	}

	private static class SingleTon {
		private static final MemberDao INSTANCE = new MemberDao();
	}

	public static MemberDao getInstance() {
		return SingleTon.INSTANCE;
	}
	// ================싱글톤 ================//

	// 1.이메일 체크 -> Spring Security
	public MemberEntity findByUserEmail(String userEmail) {

		Connection conn = null; // DB연동
		PreparedStatement pstm = null;// SQL처리
		ResultSet result = null; // select 의 결과를 return
		String query = ""; // 쿼리문

		MemberEntity memberEntity = null;// return
		try {
			// 1.DB연동
			conn = DBConnect.getConnection();
			// 2.SQL실행
			query = "select * from member1 where userEmail=? "; // 데이터 get
			// 쿼리문을 실행
			pstm = conn.prepareStatement(query);
			// userEmail -> 1 ?에 추가
			pstm.setString(1, userEmail);
			System.out.println(query + " query");
			// 3.결과 반환
			result = pstm.executeQuery();// select
			// 4. 레코드가 존재하면 get
			while (result.next()) {
				memberEntity = new MemberEntity(result.getLong(1), // 오라클 시뭔스(자동증분)
						result.getString(2), result.getString(3), result.getInt(4), result.getString(5),
						Role.valueOf(result.getString(6)), // String -> Role 변환
						result.getTimestamp(7).toLocalDateTime(), // timeStamp -> LocalDateTime
						null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 4.DB연동X
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
				if (result != null)
					result.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return memberEntity;
	}

	// 회원가입
	public int save(MemberEntity memberEntity) {

		Connection conn = null; // DB연동
		PreparedStatement pstm = null;// SQL처리
		String query = ""; // 쿼리문

		int rs = 0;

		try {
			// 1.DB연동
			conn = DBConnect.getConnection();
			// 2.SQL실행
			query = "insert into member1(memberId,userEmail,userPw,age, address,role,createTime) "
					+ " values(?,?,?,?,?,?,?) "; // insert into ~ values()
			pstm = conn.prepareStatement(query);

			pstm.setLong(1, memberEntity.getMemberId());
			pstm.setString(2, memberEntity.getUserEmail());
			pstm.setString(3, memberEntity.getUserPw());
			pstm.setInt(4, memberEntity.getAge());
			pstm.setString(5, memberEntity.getAddress());
			pstm.setString(6, memberEntity.getRole().toString());// Role.MEMBER
			pstm.setTimestamp(7, Timestamp.valueOf(memberEntity.getCreateTime()));// LocalDateTime.now()

			// 3.결과 반환
			// 성공 1, 실패 0 -> insert,update,delete
			rs = pstm.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 4.DB연동X
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

	// 회원 상세조회
	public MemberEntity findById(Long memberId) {

		MemberEntity memberEntity = null; // DB-> Entity

		Connection conn = null;// DB연동 객체
		PreparedStatement pstm = null;// 쿼리문 처리 객체
		String query = "";// 쿼리문
		ResultSet rs = null;// DB get

		try {
			//1.DB연동
			conn = DBConnect.getConnection();
			//2.쿠리작성(실제)
			query = "select * from member1 where memberId=? ";
			pstm = conn.prepareStatement(query);

			pstm.setLong(1, memberId);

			rs = pstm.executeQuery();

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

	public List<MemberEntity> findAll() {
		
		List<MemberEntity> memberEntities=new ArrayList<MemberEntity>();
//		List<MemberEntity> memberEntities=null;
		
		Connection conn = null;// DB연동 객체
		PreparedStatement pstm = null;// 쿼리문 처리 객체
		String query = "";// 쿼리문
		ResultSet rs = null;// DB get

		try {
			//1.DB연동
			conn = DBConnect.getConnection();
			//2.쿠리작성(실제)
			query = "select * from member1 ";
			pstm = conn.prepareStatement(query);

			rs = pstm.executeQuery();

			while (rs.next()) {
				memberEntities.add(new MemberEntity(
						rs.getLong(1), 
						rs.getString(2), 
						rs.getString(3), 
						rs.getInt(4),
						rs.getString(5), 
						Role.valueOf(rs.getString(6)), // String -> Role 변환
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

	public int deleteById(Long memberId) {
		Connection conn = null; // DB연동
		PreparedStatement pstm = null;// SQL처리
		String query = ""; // 쿼리문

		int rs = 0;

		try {
			// 1.DB연동
			conn = DBConnect.getConnection();
			// 2.SQL실행
			query = "delete from member1 where memberId=? "; // insert into ~ values()
			pstm = conn.prepareStatement(query);

			pstm.setLong(1, memberId);
			
			// 3.결과 반환
			// 성공 1, 실패 0 -> insert,update,delete
			rs = pstm.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 4.DB연동X
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

	public int saveUpdate(MemberEntity memberEntity) {

		Connection conn = null; // DB연동
		PreparedStatement pstm = null;// SQL처리
		String query = ""; // 쿼리문

		int rs = 0;

		try {
			// 1.DB연동
			conn = DBConnect.getConnection();
			// 2.SQL실행
			query = "update member1 set userEmail=?,userPw=?,age=?, address=?,role=?,createTime=?  "
					+ " where memberId=?  "; // insert into ~ values()
			pstm = conn.prepareStatement(query);

			pstm.setString(1, memberEntity.getUserEmail());
			pstm.setString(2, memberEntity.getUserPw());
			pstm.setInt(3, memberEntity.getAge());
			pstm.setString(4, memberEntity.getAddress());
			pstm.setString(5, memberEntity.getRole().toString());// Role.MEMBER
			pstm.setTimestamp(6, Timestamp.valueOf(memberEntity.getCreateTime()));// LocalDateTime.now()
			pstm.setLong(7, memberEntity.getMemberId());

			// 3.결과 반환
			// 성공 1, 실패 0 -> insert,update,delete
			rs = pstm.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 4.DB연동X
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

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
