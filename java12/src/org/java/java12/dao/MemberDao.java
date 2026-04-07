package org.java.java12.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.java.java12.connect.DBConnect;
import org.java.java12.dto.MemberDto;

public class MemberDao {

	//=============싱글톤=============
	private MemberDao() {
		System.out.println("MemberDao<<-싱글톤");
	}
	private static class SingletonClass{
		private static final MemberDao INSTANCE=new MemberDao();
	}
	public static MemberDao getInstance(){
		return SingletonClass.INSTANCE;
	}
	//=============싱글톤=============
	
	//회원가입
	
	public int save(MemberDto memberDto){
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
	//회원 수정
	public int saveUpdate(MemberDto memberDto) {
		System.out.println("회원수정 Dao");
		int rs=1;
		return rs;
	}
	//회원탈퇴
	public int deleteByEmail(String userEmail) {
		System.out.println("회원탈퇴 dao");
		int rs=1;
		return rs;
	}
	//회원조회(목록)
	public List<MemberDto> findAll(){
		System.out.println("회원목록 조회");
		return null;
	}
	
//	//회원조회(목록)
//	public List<MemberDto> findAll(){
//		System.out.println("회원목록 조회");
//		
//		Connection conn=null;
//		String query="";
//		PreparedStatement pstm=null;
//		ResultSet rs=null;
//		
//		try {
//			conn=DBConnect.getConnection();
//			query="select * from 테이블이름";
//			//쿼리 실행
//			pstm = conn.prepareStatement(query);
//			//실행
//			rs = pstm.executeQuery();
//			while(rs.next()) {
//				memberDtos.add(new MemberDto(rs.getInt(1),rs.getString(2), query, query, null, null, null));
//			}
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				if(conn !=null) 
//					conn.close();
//			}catch(SQLException e) {
//				e.printStackTrace();
//			}
//		}
		
		
		

	
	
	
	
	
	
	
	
	
}
