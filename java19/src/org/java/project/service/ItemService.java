package org.java.project.service;

import java.util.List;

import org.java.project.dto.ItemDto;

public interface ItemService {
	//상품등록
	int insertItem(ItemDto itemDto) throws Exception;
	
	//상품조회
	List<ItemDto> itemList() throws Exception;
	
	
}
