package org.java.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.java.project.connect.DBConnect;
import org.java.project.entity.ItemEntity;

public class ItemDao {
	// =====================싱글톤=====================
		private ItemDao() {
			System.out.println("싱글톤 -> ItemDao");
		}
		private static class SingleTon{
			private static final ItemDao INSTANCE = new ItemDao();
		}
		public static ItemDao getInstance() {
			return SingleTon.INSTANCE;
		}
		
//		=====================싱글톤=====================
		
	//상품등록
	public int save(ItemEntity itemEntity) {
		
		Connection conn=null;
		PreparedStatement pstm = null;
		String query = "";
		int rs = 0;
		
		try {
			conn=DBConnect.getConnection();
			query= "insert into item3(itemId,title,content,memberId)"
			+ "values(seq_item_id.NEXTVAL,?,?,?)";
			pstm = conn.prepareStatement(query);
			
			pstm.setString(1,itemEntity.getTitle());
			pstm.setString(2,itemEntity.getContent());
			pstm.setLong(3,itemEntity.getMemberId());
			
			//상품등록 성공 1, 나머지 실패
			rs=pstm.executeUpdate();//상품등록,상품수정,상품삭제,insert,update,delete
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				if(conn!= null) conn.close();
				if(pstm!=null) pstm.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return rs;
		
	}
		
	//상품조회
	public List<ItemEntity>findAll(){
		
		Connection conn=null; //DB연동
		PreparedStatement pstm = null; //쿼리문 처리
		ResultSet rs=null; //select 결과 return
		String query = ""; //쿼리문

		List<ItemEntity> itemEntities = new ArrayList<ItemEntity>();
		
		try {
			conn= DBConnect.getConnection();
			query="select * from item3";
			pstm=conn.prepareStatement(query);
			
			rs=pstm.executeQuery(); // select 
			
			//DB에 레코드가 있으면
			while(rs.next()) {
				itemEntities.add(new ItemEntity(rs.getLong(1),rs.getString(2),rs.getString(3),rs.getLong(4), rs.getTimestamp(5).toLocalDateTime(), null));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) conn.close();
				if(pstm!=null) pstm.close();
				if(rs!=null)rs.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return itemEntities;
		
		
		
	}
		
		
		
		
		
		
		
		
		
}
