package org.java.project.entity;

import java.time.LocalDateTime;

import org.java.project.dto.ItemDto;

//@ToString
//@AllArgsConstruct
//@NoArgsConnstruct
//@Getter
//@Setter
//@Entity
//@Table(name="item4")
public class ItemEntity {
	private Long itemId;
	private String title;
	private String content;
	private Long memberId;
	
	private LocalDateTime createTime;
	private LocalDateTime updateTime;
	
	public ItemEntity() {
		// TODO Auto-generated constructor stub
	}

	public ItemEntity(Long itemId, String title, String content, Long memberId, LocalDateTime createTime,
			LocalDateTime updateTime) {
		super();
		this.itemId = itemId;
		this.title = title;
		this.content = content;
		this.memberId = memberId;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
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
		return "ItemEntity [itemId=" + itemId + ", title=" + title + ", content=" + content + ", memberId=" + memberId
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}
	
	//DTO -> Entity
	//상품등록
	public static ItemEntity toInsertItemEntity(ItemDto itemDto) {
		ItemEntity itemEntity = new ItemEntity();
		
		itemEntity.setTitle(itemDto.getTitle());
		itemEntity.setContent(itemDto.getContent());
		itemEntity.setMemberId(itemDto.getMemberId());
		return itemEntity;
	}
	//상품수정
	public static ItemEntity toUpdateItemEntity(ItemDto itemDto) {
		ItemEntity itemEntity = new ItemEntity();
		
		itemEntity.setItemId(itemDto.getItemId());
		itemEntity.setTitle(itemDto.getTitle());
		itemEntity.setContent(itemDto.getContent());
		itemEntity.setMemberId(itemDto.getMemberId());
		itemEntity.setCreateTime(itemDto.getCreateTime());
		
		return itemEntity;
	}
	
	
	
}
