package org.java.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.java.project.connect.DBConnect;
import org.java.project.entity.BoardEntity;

public class BoardDao {
	//=============================싱글톤=============================
		private BoardDao() {
			System.out.println("싱글톤 -> BoardDao");
		}
		private static class SingleTon{
			private static final BoardDao INSTANCE = new BoardDao();
		}
		public static BoardDao getInstance() {
			return SingleTon.INSTANCE;
		}
	//=============================싱글톤=============================
		
		//게시글 작성
		public int save(BoardEntity boardEntity) {
			Connection conn=null;
			PreparedStatement pstm=null;
			String query="";
			int rs=0;
			try {
				conn=DBConnect.getConnection();
				query="insert into board_tb3(BOARDID,TITLE,content,memberId) "
						+ "values(sequence_board_tb3.NEXTVAL,?,?,?)";
				pstm=conn.prepareStatement(query);
				
				pstm.setString(1, boardEntity.getTitle());
				pstm.setString(2, boardEntity.getContent());
				pstm.setLong(3, boardEntity.getMemberId());
				
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
		
		//게시글 수정
		public int saveUpdate(BoardEntity boardEntity) {
			Connection conn=null;
			PreparedStatement pstm=null;
			String query="";
			int rs=0;
			try {
				conn=DBConnect.getConnection();
				query="update board_tb3 set TITLE=?,content=? where boardId=?";
				pstm=conn.prepareStatement(query);
				
				
				pstm.setString(1, boardEntity.getTitle());
				pstm.setString(2, boardEntity.getContent());
				pstm.setLong(3, boardEntity.getBoardId());

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
		//게시글 삭제(boardId)
		public int deleteById(Long boardId) {
			Connection conn=null;
			PreparedStatement pstm=null;
			String query="";
			int rs=0;
			try {
				conn=DBConnect.getConnection();
				query="delete board_tb3 where boardId=?";
				pstm=conn.prepareStatement(query);
				
				pstm.setLong(1, boardId);
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
		

		//게시글 조회(boardId)
		public BoardEntity findById(Long boardId) {
			Connection conn=null;
			PreparedStatement pstm=null;
			String query="";
			ResultSet rs=null;
			
			BoardEntity boardEntity=null;
			
			try {
				conn=DBConnect.getConnection();
				query="select * from board_tb3 where boardId=? ";
				pstm=conn.prepareStatement(query);
				
				pstm.setLong(1, boardId);
				rs=pstm.executeQuery();
				
				while(rs.next()) {
					boardEntity=
							new BoardEntity(rs.getLong(1),
									rs.getString(2), 
									rs.getString(3), 
									rs.getLong(4),
									null, null);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(conn !=null) conn.close();
					if(pstm !=null) conn.close();
					if(rs !=null)	rs.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
			return boardEntity;
		}
		
		//게시글 목록 조회
		public List<BoardEntity> findAll(){
			Connection conn=null;
			PreparedStatement pstm=null;
			String query="";
			ResultSet rs=null;
			
			List<BoardEntity> boardEntities=new ArrayList<BoardEntity>();
			try {
				conn=DBConnect.getConnection();
				query="select * from board_tb3";
				pstm=conn.prepareStatement(query);
				
				rs=pstm.executeQuery();
				
				while(rs.next()) {
					boardEntities.add(new BoardEntity(rs.getLong(1),
							rs.getString(2),
							rs.getString(3),
							rs.getLong(4),
							null,null
							));
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
			
			return boardEntities;
		}
		
		//회원별 게시글 목록 조회
		public List<BoardEntity> findListById(Long memberId){
			Connection conn=null;
			PreparedStatement pstm=null;
			String query="";
			ResultSet rs=null;
			
			List<BoardEntity> boardEntities=new ArrayList<BoardEntity>();
			try {
				conn=DBConnect.getConnection();
				query="select * from board_tb3 where memberId=?";
				pstm=conn.prepareStatement(query);
				
				pstm.setLong(1, memberId);
				
				rs=pstm.executeQuery();
				
				while(rs.next()) {
					boardEntities.add(new BoardEntity(rs.getLong(1),
							rs.getString(2),
							rs.getString(3),
							rs.getLong(4),
							null,null
							));
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
			
			return boardEntities;
		}

		public void delete(BoardEntity boardEntity) {
			Connection conn=null;
			PreparedStatement pstm=null;
			String query="";
			int rs=0;
			try {
				conn=DBConnect.getConnection();
				query="delete from board_tb3 where boardId=?";
				pstm=conn.prepareStatement(query);
				
				pstm.setLong(1, boardEntity.getBoardId());
				
				rs=pstm.executeUpdate();
				
			}catch(Exception e) {
				e.printStackTrace();
				throw new RuntimeException("삭제실패");
			}finally {
				try {
					if(conn !=null) conn.close();
					if(pstm !=null) pstm.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
							
		}
		
}
