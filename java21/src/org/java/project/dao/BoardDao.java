package org.java.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.java.project.connect.DBConnect;
import org.java.project.entity.BoardEntity;

public class BoardDao {
//------------------------싱글톤------------------------
	private BoardDao() {
		System.out.println("싱글톤 -> BoardDao");
	}
	private static class SingleTon{
		private static final BoardDao INSTANCE=new BoardDao();
	}
	public static BoardDao getInstance() {
		return SingleTon.INSTANCE;
	}
//	------------------------싱글톤------------------------
	
	//게시글 작성
	public int save(BoardEntity boardEntity) {
		
		Connection conn=null;
		PreparedStatement pstm = null;
		String query="";
		
		int rs=0;
		
		try {
			//1. 드라이버로드, 2.DB연결 생서
			conn = DBConnect.getConnection();
			query="insertinsert into board_tb2(BOARDID,TITLE,content,memberId) "
					+ "values(sequence_board_tb2.NEXTVAL,?,?,?);";
			pstm=conn.prepareStatement(query);
			pstm.setString(1, boardEntity.getTitle());
			pstm.setString(2, boardEntity.getContent());
			pstm.setLong(3, boardEntity.getMemberId());
			//4. SQL 실행
			//5. 결과 처리
			//성공? -> 1, 실패? -> 나머비
			rs=pstm.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return rs;
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
