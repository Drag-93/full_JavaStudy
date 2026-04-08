package org.project.service.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.project.connect.DBConnect;
import org.project.entity.MemberEntity;

public class MemberDao {
//=========================싱글톤=========================
	private MemberDao() {
		System.out.println("싱글톤 -> MemberDao");
	}
	private static class SingleTon{
		private static final MemberDao INSTANCE =new MemberDao();
	}
	public static MemberDao getInstance() {
		return SingleTon.INSTANCE;
	}
//=========================싱글톤=========================
	//이메일체크
	public MemberEntity findByEmail(String email) {
		MemberEntity memberEntity=null;
		
		Connection conn=null;
		PreparedStatement pstm =null;
		ResultSet rs =null;
		String query="";
		try {
			conn=DBConnect.getConnection();
			query="select * from member1 where email=?";
			pstm=conn.prepareStatement(query);
			
			pstm.setString(1, email);
			
			rs=pstm.executeQuery();
			while(rs.next()) {
				memberEntity= new MemberEntity(rs.getLong(1), rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn !=null ) conn.close();
				if(pstm !=null) pstm.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return memberEntity;
	}
	
	//아이디 조회
	public MemberEntity findById(Long memberId) {
		MemberEntity memberEntity=null;
		
		Connection conn=null;
		PreparedStatement pstm =null;
		ResultSet rs =null;
		String query="";
		try {
			conn=DBConnect.getConnection();
			query="select * from member1 where memberId=?";
			pstm=conn.prepareStatement(query);
			
			pstm.setLong(1, memberId);
			
			rs=pstm.executeQuery();
			while(rs.next()) {
				memberEntity= new MemberEntity(rs.getLong(1), rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn !=null ) conn.close();
				if(pstm !=null) pstm.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return memberEntity;
	}

	public int save(MemberEntity memberEntity) {
		Connection conn=null;
		PreparedStatement pstm =null;
		String query="";
		int rs =0;
		try {
			conn=DBConnect.getConnection();
			query="insert into member1(email,password,name,address) "
					+ "values(?,?,?,?);";
			pstm=conn.prepareStatement(query);
			
			pstm.setString(1, memberEntity.getEmail());
			pstm.setString(2, memberEntity.getPassword());
			pstm.setString(3, memberEntity.getName());
			pstm.setString(4, memberEntity.getAddress());
			
			rs=pstm.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn !=null ) conn.close();
				if(pstm !=null) pstm.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return rs;
	}
	public int saveUpdate(MemberEntity memberEntity) {
		Connection conn=null;
		PreparedStatement pstm =null;
		String query="";
		int rs =0;
		try {
			conn=DBConnect.getConnection();
			query="update member1 set email=?, password=?, name=?, address=? where memberId=?";
			pstm=conn.prepareStatement(query);
			
			pstm.setString(1, memberEntity.getEmail());
			pstm.setString(2, memberEntity.getPassword());
			pstm.setString(3, memberEntity.getName());
			pstm.setString(4, memberEntity.getAddress());
			pstm.setLong(5, memberEntity.getMemberId());
			
			rs=pstm.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn !=null ) conn.close();
				if(pstm !=null) pstm.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return rs;
	}
	public int delete(Long memberId) {
		 
//		MemberEntity memberEntity=null;
		
		Connection conn=null;
		PreparedStatement pstm =null;
		String query="";
		int rs=0;
		try {
			conn=DBConnect.getConnection();
			query="delete from member1 where memberId=?";
			pstm=conn.prepareStatement(query);
			
			pstm.setLong(1, memberId);
			
			rs=pstm.executeUpdate();
			
			try {
				
				}catch(Exception e){
				throw new RuntimeException("회원 탈퇴 실패");
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn !=null ) conn.close();
				if(pstm !=null) pstm.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return rs;
	}
	public List<MemberEntity> findAll() {
		List<MemberEntity> memberEntities=new ArrayList<MemberEntity>();
		
		Connection conn=null;
		PreparedStatement pstm =null;
		String query="";
		ResultSet rs=null;
		try {
			conn=DBConnect.getConnection();
			query="select * from member1";
			pstm=conn.prepareStatement(query);

			rs=pstm.executeQuery();
			
			while(rs.next()) {
				memberEntities.add(
						new MemberEntity(
								rs.getLong(1),
								rs.getString(2),
								rs.getString(3),
								rs.getString(4),
								rs.getString(5)));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn !=null ) conn.close();
				if(pstm !=null) pstm.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return memberEntities;
	}
	
	
	
	
	
}