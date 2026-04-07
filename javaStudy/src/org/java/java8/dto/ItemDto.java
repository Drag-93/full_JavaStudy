package org.java.java8.dto;

import java.time.LocalDateTime;

public class ItemDto {
	private int itemId; 				//제품 id
	private String itemTitle;			//제품 이름
	private String itmeDetail;			//제품 상세내역
	private int price;					//제품 가격
	private int inventory;				//재고량
	private String registrator;			//제품 등록자
	private LocalDateTime createTime;	//등록시간
	private LocalDateTime updateTime;	//수정시간

	public ItemDto() {
		// TODO Auto-generated constructor stub
	}

	public ItemDto(int itemId, String itemTitle, String itmeDetail, int price, int inventory, String registrator,
			LocalDateTime createTime, LocalDateTime updateTime) {
		super();
		this.itemId = itemId;
		this.itemTitle = itemTitle;
		this.itmeDetail = itmeDetail;
		this.price = price;
		this.inventory = inventory;
		this.registrator = registrator;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemTitle() {
		return itemTitle;
	}

	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}

	public String getItmeDetail() {
		return itmeDetail;
	}

	public void setItmeDetail(String itmeDetail) {
		this.itmeDetail = itmeDetail;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getInventory() {
		return inventory;
	}

	public void setInventory(int inventory) {
		this.inventory = inventory;
	}

	public String getRegistrator() {
		return registrator;
	}

	public void setRegistrator(String registrator) {
		this.registrator = registrator;
	}

	public LocalDateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}

	public LocalDateTime getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(LocalDateTime updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "ItemDto [itemId=" + itemId + ", itemTitle=" + itemTitle + ", itmeDetail=" + itmeDetail + ", price="
				+ price + ", inventory=" + inventory + ", registrator=" + registrator + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + "]";
	}
	
	
	
}
