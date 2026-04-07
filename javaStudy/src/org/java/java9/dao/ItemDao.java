package org.java.java9.dao;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.java.java9.dto.ItemDto;

public class ItemDao {
	//-------------------SingleTon-------------------//
	private ItemDao() {
		
	}
	private static class SingleTon{
		private static final ItemDao ISNTANCE=new ItemDao();
	}
	public static ItemDao getInstance() {
		return SingleTon.ISNTANCE;
	}
	//-----------------------------------------------//
	ItemDto dto=new ItemDto();
	//1. 상품등록
	public int save(ItemDto dto) {
		System.out.println("상품 등록");
		System.out.println(dto.getItemId());
		System.out.println(dto.getItemTitle());
		System.out.println(dto.getItmeDetail());
		System.out.println(dto.getPrice());
		System.out.println(dto.getInventory());
		System.out.println(dto.getRegistrator());
		System.out.println(dto.getCreateTime());
		System.out.println(dto.getUpdateTime());

		return 1;
	}
	
	//2. 상품수정
		public int saveUpdate(ItemDto dto) {
			System.out.println("상품 수정");
			System.out.println(dto.getItemId());
			System.out.println(dto.getItemTitle());
			System.out.println(dto.getItmeDetail());
			System.out.println(dto.getPrice());
			System.out.println(dto.getInventory());
			System.out.println(dto.getRegistrator());
			System.out.println(dto.getCreateTime());
			System.out.println(dto.getUpdateTime());

			return 1;
		}
	
		//3. 상품삭제
		public int deleteById(int itemId) {
			System.out.println("상품삭제");
			
			System.out.println(itemId+"삭제");
			
			return 1;
		}
		//4. 회원조회(목록)
		public List<ItemDto> findAll(){
			System.out.println("상품조회(목록)");
			//컬렉션 -> List<E>
			List<ItemDto> list=new ArrayList<ItemDto>();
			list.add(new ItemDto(1, "상품1", "상품1상세", 5000, 1000, "m1", null, null));
			list.add(new ItemDto(2, "상품2", "상품2상세", 15000, 1000, "m2", null, null));
			list.add(new ItemDto(3, "상품3", "상품3상세", 25000, 1000, "m3", null, null));
			
	

			return list;
		}
		
		
		
		
		
		
		
		
		
		
		
		
	

	
	
	
	
}
