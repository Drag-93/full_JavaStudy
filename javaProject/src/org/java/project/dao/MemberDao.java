package org.java.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.java.project.connect.DBConnect;
import org.java.project.constraint.Role;
import org.java.project.entity.MemberEntity;

public class MemberDao {
//=============================싱글톤=============================
	private MemberDao() {
		System.out.println("싱글톤 -> MemberDao");
	}
	private static class SingleTon{
		private static final MemberDao INSTANCE = new MemberDao();
	}
	public static MemberDao getInsatance() {
		return SingleTon.INSTANCE;
	}
//=============================싱글톤=============================
	
	//이메일 체크
	public MemberEntity findByUserEmail(String userEmail) {
		Connection conn=null;
		PreparedStatement pstm =null;
		String query="";
		ResultSet rs = null;
		
		MemberEntity memberEntity =null;
		
		
		try {
			conn = DBConnect.getConnection();
			query= "select * from member_tb3 where userEmail=? ";
			pstm=conn.prepareStatement(query);
			
			pstm.setString(1, userEmail);
			
			rs=pstm.executeQuery();
			
			while(rs.next()) {
				memberEntity= 
						new MemberEntity(rs.getLong(1),
								rs.getString(2), 
								rs.getString(3), 
								rs.getInt(4), 
								rs.getString(5), 
								Role.valueOf(rs.getString(6)), 
								null, null);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn !=null) conn.close();
				if(pstm !=null) pstm.close();
				if(rs !=null) 	rs.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return memberEntity;
		
	}
	
	
	//회원 가입
	public int save(MemberEntity memberEntity) {
		Connection conn=null;
		PreparedStatement pstm=null;
		String query="";
		
		int rs =0;
		
		try {
			conn=DBConnect.getConnection();
			query="insert into member_tb3(memberId,userEmail,userPw,age, address,role)"
					+ "values(sequence_member_tb3.NEXTVAL,?,?,?,?,?)";
			pstm=conn.prepareStatement(query);
			
			pstm.setString(1, memberEntity.getUserEmail());
			pstm.setString(2, memberEntity.getUserPw());
			pstm.setInt(3, memberEntity.getAge());
			pstm.setString(4, memberEntity.getAddress());
			pstm.setString(5, memberEntity.getRole().toString());
			
			rs=pstm.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn !=null) conn.close();
				if(pstm !=null) pstm.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return rs;
	}
	
	//회원 수정
	public int saveUpdate(MemberEntity memberEntity) {
		Connection conn=null;
		PreparedStatement pstm=null;
		String query ="";
		int rs= 0;
		
		try {
			conn=DBConnect.getConnection();
			query="update member_tb3 set userEmail=?, userPw=?, age=?, address=?,role=? where memberId=?";
			pstm=conn.prepareStatement(query);
			pstm.setString(1, memberEntity.getUserEmail());
			pstm.setString(2, memberEntity.getUserPw());
			pstm.setInt(3, memberEntity.getAge());
			pstm.setString(4, memberEntity.getAddress());
			pstm.setString(5, memberEntity.getRole().toString());
			pstm.setLong(6, memberEntity.getMemberId());
			
			rs=pstm.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
			if(conn !=null) conn.close();
			if(pstm !=null) pstm.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		}
		return rs;
	}
	
	//회원탈퇴
	public int delete(Long memberId) {
		Connection conn=null;
		PreparedStatement pstm=null;
		String query ="";
		int rs= 0;
		try {
		conn=DBConnect.getConnection();
		query="delete member_tb3 where memberId=?";
		pstm=conn.prepareStatement(query);
		
		pstm.setLong(1, memberId);
		rs=pstm.executeUpdate();
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn !=null) conn.close();
				if(pstm !=null) pstm.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		
		return rs;
	}
	
	
	//회원 상세 조회
	public MemberEntity findById(Long memberId) {
		Connection conn=null;
		PreparedStatement pstm =null;
		String query="";
		ResultSet rs = null;
		
		MemberEntity memberEntity =null;
		
		
		try {
			conn = DBConnect.getConnection();
			query= "select * from member_tb3 where memberId=? ";
			pstm=conn.prepareStatement(query);
			
			pstm.setLong(1, memberId);
			
			rs=pstm.executeQuery();
			
			while(rs.next()) {
				memberEntity= 
						new MemberEntity(rs.getLong(1),
								rs.getString(2), 
								rs.getString(3), 
								rs.getInt(4), 
								rs.getString(5), 
								Role.valueOf(rs.getString(6)), 
								null, null);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn !=null) conn.close();
				if(pstm !=null) pstm.close();
				if(rs !=null) 	rs.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return memberEntity;
		
	}

	//회원 목록 조회
	public List<MemberEntity> findAll(){
		Connection conn=null;
		PreparedStatement pstm =null;
		String query="";
		ResultSet rs = null;
		
		List<MemberEntity> memberEntities=new ArrayList<MemberEntity>();
		
		
		try {
			conn = DBConnect.getConnection();
			query= "select * from member_tb3";
			pstm=conn.prepareStatement(query);
			
			rs=pstm.executeQuery();
			
			while(rs.next()) {
				memberEntities.add(new MemberEntity(rs.getLong(1),
								rs.getString(2), 
								rs.getString(3), 
								rs.getInt(4), 
								rs.getString(5), 
								Role.valueOf(rs.getString(6)), 
								null,
								null));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn !=null) conn.close();
				if(pstm !=null) pstm.close();
				if(rs !=null) rs.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return memberEntities;
	}
	
	
	
	
	
	
	
	
	
	
}
