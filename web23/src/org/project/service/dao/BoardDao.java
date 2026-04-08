package org.project.service.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.project.connect.DBConnect;
import org.project.entity.BoardEntity;

public class BoardDao {
	//=========================싱글톤=========================
		private BoardDao() {
			System.out.println("싱글톤 -> BoardDao");
		}
		private static class SingleTon{
			private static final BoardDao INSTANCE =new BoardDao();
		}
		public static BoardDao getInstance() {
			return SingleTon.INSTANCE;
		}
	//=========================싱글톤=========================
		
		public BoardEntity findById(Long boardId) {
			BoardEntity boardEntity=null;
			
			Connection conn=null;
			PreparedStatement pstm=null;
			String query="";
			ResultSet rs=null;
			
			try {
				conn=DBConnect.getConnection();
				query="select * from board1 where boardId=?";
				
				pstm=conn.prepareStatement(query);
				pstm.setLong(1, boardId);
				
				rs=pstm.executeQuery();
				while(rs.next()) {
					boardEntity=new BoardEntity(
							rs.getLong(1), 
							rs.getString(2), 
							rs.getString(3), 
							rs.getString(4), 
							rs.getString(5), 
							rs.getInt(6), 
							rs.getLong(7));
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
			return boardEntity;
		}
		public int save(BoardEntity boardEntity) {
			Connection conn=null;
			PreparedStatement pstm=null;
			String query="";
			int rs=0;
			try {
				conn=DBConnect.getConnection();
				query="insert into board1(content,title,boardPw,nickName,hit, memberId) "
						+ "values(?,?,?,?,?,?)";
				pstm=conn.prepareStatement(query);
				
				pstm.setString(1, boardEntity.getContent());
				pstm.setString(2, boardEntity.getTitle());
				pstm.setString(3, boardEntity.getBoardPw());
				pstm.setString(4, boardEntity.getNickName());
				pstm.setInt(5, 0);
				pstm.setLong(6, boardEntity.getMemberId());
				
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

		public int saveUpdate(BoardEntity boardEntity) {
			Connection conn=null;
			PreparedStatement pstm=null;
			String query="";
			int rs=0;
			try {
				conn=DBConnect.getConnection();
				query="update board1 set content=?,title=?,boardPw=?,nickName=?, memberId=? where boardId=?";
				pstm=conn.prepareStatement(query);
				
				pstm.setString(1, boardEntity.getContent());
				pstm.setString(2, boardEntity.getTitle());
				pstm.setString(3, boardEntity.getBoardPw());
				pstm.setString(4, boardEntity.getNickName());
				pstm.setLong(5, boardEntity.getMemberId());
				pstm.setLong(6, boardEntity.getBoardId());
				
				
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
		
		public int delete(Long boardId) {
			Connection conn=null;
			PreparedStatement pstm=null;
			String query="";
			int rs=0;
			try {
				conn=DBConnect.getConnection();
				query="delete from board1 where boardId=?";
				pstm=conn.prepareStatement(query);
				
				pstm.setLong(1, boardId);
				
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
		
		
		
		
		
		
}
