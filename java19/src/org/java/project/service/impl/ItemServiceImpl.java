package org.java.project.service.impl;

import java.util.List;

import org.java.project.dao.ItemDao;
import org.java.project.dto.ItemDto;
import org.java.project.entity.ItemEntity;
import org.java.project.service.ItemService;

public class ItemServiceImpl implements ItemService{

	@Override
	public int insertItem(ItemDto itemDto) throws Exception {

		ItemDao dao = ItemDao.getInstance();
		ItemEntity itemEntity=ItemEntity.toInsertItmeEntity(itemDto);
		
		int rs =dao.save(itemEntity);
		if(rs!=1) {
			System.out.println("상품등록 실패");
			throw new RuntimeException();
		}
		return rs;
	}

	@Override
	public List<ItemDto> itemList() throws Exception {

		ItemDao dao=ItemDao.getInstance();
		
		List<ItemEntity> itemEntities = dao.findAll();
		
		
		return null;
	}

}
