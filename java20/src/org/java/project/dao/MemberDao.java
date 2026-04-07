package org.java.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.java.project.connect.DBConnect;
import org.java.project.constraint.Role;
import org.java.project.dto.MemberDto;
import org.java.project.entity.MemberEntity;

public class MemberDao {
//=================싱글톤=================
	private MemberDao() {
		System.out.println("싱글톤 -> MemberDao");
	}
	private static class SingleTon{
		private static final MemberDao INSTANCE = new MemberDao();
	}
	
	public static MemberDao getInstance() {
		return SingleTon.INSTANCE;
	}
	
//	=================싱글톤=================
	//이메일조회
	public MemberEntity findByUserEmail(String userEmail) {
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		ResultSet rs=null;
		
		MemberEntity memberEntity = new MemberEntity();
		
		try {
			//1. 드라이버 로드, 2.DB연결 생성
			conn = DBConnect.getConnection();
			query = "select * from member4 where userEmail=?";
			//3.SQL 실행 쿼리 생성
			pstm=conn.prepareStatement(query);
			
			pstm.setString(1, userEmail);
			
			//4. SQL 실행
			//5. 결과 처리
			rs=pstm.executeQuery();
			
			//DB에 레코드가 있으면
			while(rs.next()) {
				memberEntity 
				= new MemberEntity(rs.getLong(1), 
						rs.getString(2), 
						rs.getString(3), 
						Role.valueOf(rs.getString(4)),
						rs.getTimestamp(5).toLocalDateTime(),
						null);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
			if(conn!=null) conn.close();
			if(pstm!=null) pstm.close();
			if(rs!=null )  rs.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		}
		
		return memberEntity;
		
		
	}

	
	//회원 가입
	public int save(MemberEntity memberEntity) {
		
		Connection conn= null;
		PreparedStatement pstm=null;
		String query="";
		
		int rs=0;
		
		try {
			//1.드라이버 로드, 2.DB연결 생성
			conn = DBConnect.getConnection();
			query = "insert into member4(memberId,userEmail,userPw,role)"
					+"values(seq_member4_id.NEXTVAL,?,?,?)";
			pstm=conn.prepareStatement(query);
			
			pstm.setString(1, memberEntity.getUserEmail());
			pstm.setString(2, memberEntity.getUserPw());
			pstm.setString(3, memberEntity.getRole().toString());
			
			//4. SQL 실행
			//5. 결과 처리
			//성공?-> 1,  실패? -> 나머지
			rs=pstm.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) conn.close();
				if(pstm !=null) pstm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rs;
	}
	
	
	
	//회원 수정
	public int update(MemberEntity memberEntity) {
		Connection conn = null;
		PreparedStatement pstm=null;
		String query="";
		int rs=0;
	
		try {
			conn = DBConnect.getConnection();
			query="update member4 set userEmail=?, userPw=?,role=? where memberId=?";
			pstm= conn.prepareStatement(query);
			
			pstm.setString(1, memberEntity.getUserEmail());
			pstm.setString(2, memberEntity.getUserPw());
			pstm.setString(3, memberEntity.getRole().toString());
			pstm.setLong(4, memberEntity.getMemberId());
			
			rs=pstm.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) conn.close();
				if(pstm!=null) pstm.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return rs;
	}
	
	
	
	//회원 목록 조회
	public List<MemberEntity> findAll(){
		
		List<MemberEntity> memberEntities=new ArrayList<MemberEntity>();

		Connection conn = null;
		PreparedStatement pstm=null;
		String query="";
		ResultSet rs=null;
		
		try {
		conn=DBConnect.getConnection();
		query="select * from member4";
		pstm=conn.prepareStatement(query);
		
		rs=pstm.executeQuery();
		
		while(rs.next()) {
			memberEntities.add(new MemberEntity(rs.getLong(1), rs.getString(2), rs.getString(3), Role.valueOf(rs.getString(4)),rs.getTimestamp(5).toLocalDateTime(), null));
			
		}
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) conn.close();
				if(pstm!=null) pstm.close();
				if(rs!=null) rs.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		return memberEntities;
	}
	

	//회원 조회(memberId)

	public MemberEntity findById(Long memberId) {
		MemberEntity memberEntity=null;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		ResultSet rs=null;
		
		
		try {
			//1. 드라이버 로드, 2.DB연결 생성
			conn = DBConnect.getConnection();
			query = "select * from member4 where memberId=?";
			//3.SQL 실행 쿼리 생성
			pstm=conn.prepareStatement(query);
			
			pstm.setLong(1, memberId);
			
			//4. SQL 실행
			//5. 결과 처리
			rs=pstm.executeQuery();
			
			//DB에 레코드가 있으면
			while(rs.next()) {
				memberEntity 
				= new MemberEntity(rs.getLong(1), 
						rs.getString(2), 
						rs.getString(3), 
						Role.valueOf(rs.getString(4)),
						rs.getTimestamp(5).toLocalDateTime(), 
						null);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
			if(conn!=null) conn.close();
			if(pstm!=null) pstm.close();
			if(rs!=null )  rs.close();
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
		}
		return memberEntity;
	}

	//회원탈퇴
	public int deleteById(Long memberId) {
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		
		int rs=0;
		
		try {
			//1. 드라이버 로드,2. DB 연결 생성
			conn = DBConnect.getConnection();
			query="delete from member4 where memberId=?";
			pstm=conn.prepareStatement(query);//3. SQL 실행 객체 생성
			
			pstm.setLong(1, memberId);
			//4. SQL 실행
			//5. 결과 처리
			// 성공 1, 실패면 나머지 
			rs=pstm.executeUpdate();//insert,update,delete
			
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
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
