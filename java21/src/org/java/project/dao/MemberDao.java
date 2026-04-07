package org.java.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.java.project.connect.DBConnect;
import org.java.project.constraint.Role;
import org.java.project.entity.MemberEntity;

public class MemberDao {
	//------------------------싱글톤------------------------
		private MemberDao() {
			System.out.println("싱글톤 -> MemberDao");
		}
		private static class SingleTon{
			private static final MemberDao INSTANCE=new MemberDao();
		}
		public static MemberDao getInstance() {
			return SingleTon.INSTANCE;
		}
//		------------------------싱글톤------------------------
	
	//이메일 체크
	public MemberEntity findById(Long memberId) {
		MemberEntity memberEntity=null;
		Connection conn =null;
		PreparedStatement pstm=null;
		String query="";
		ResultSet rs =null;
		
		System.out.println(memberId);
		
		try {
			conn = DBConnect.getConnection();
			query = "select * from member_tb2 where memberId=? ";
			pstm = conn.prepareStatement(query);

			pstm.setLong(1,memberId); // 쿼리문 실행 객체

			rs = pstm.executeQuery(); // select -> 실제 실행
			
			while(rs.next()) {
				memberEntity = new MemberEntity(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getInt(4),
									rs.getString(5), Role.valueOf(rs.getString(6)), rs.getTimestamp(7).toLocalDateTime(), null);
						}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return memberEntity;
	}
		
		
		
		
		
		
		
	//회원가입
	public int save(MemberEntity memberEntity) {
		Connection conn =null;
		PreparedStatement pstm=null;
		String query="";
		int rs =0;
		
		try {
			conn= DBConnect.getConnection();
			query="INSERT INTO member_tb2(memberId, userEmail, userPw,age,address,role) "
					+ "values(sequence_member_tb2.NEXTVAL,?,?,?,?,?);";
			pstm = conn.prepareStatement(query);
			
			pstm.setString(1, memberEntity.getUserEmail());
			pstm.setString(2, memberEntity.getUserPw());
			pstm.setInt(3, memberEntity.getAge());
			pstm.setString(4, memberEntity.getAddress());
			pstm.setString(5, memberEntity.getRole().toString());
			
			rs=pstm.executeUpdate();
			
		}catch (Exception e) {
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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
