package org.java.project.dto;

import java.awt.event.ItemEvent;
import java.time.LocalDateTime;

import org.java.project.entity.ItemEntity;
import org.java.project.entity.MemberEntity;

//@ToString
//@Builder
//@AllArgsConstruct
//@NoArgsConstruct
public class ItemDto {

	private Long itemId;	//상품아이디(자동) , PK
	private String title;	//상품명
	private String content;	//상세내역
	private Long memberId;	//상품등록자
	
	//필수
	private LocalDateTime createTime; //상품등록시간
	private LocalDateTime updateTime; //상품수정시간
	
	public ItemDto() {
		// TODO Auto-generated constructor stub
	}

	public ItemDto(Long itemId, String title, String content, Long memberId, LocalDateTime createTime,
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
		return "ItemDto [itemId=" + itemId + ", title=" + title + ", content=" + content + ", memberId=" + memberId
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}
	
	//Entity -> DTO
	public static ItemDto toItemDto(ItemEntity itemEntity) {
		
		ItemDto itemDto=new ItemDto();		
		
		itemDto.setItemId(itemEntity.getItemId());
		itemDto.setTitle(itemEntity.getTitle());
		itemDto.setContent(itemEntity.getContent());
		itemDto.setMemberId(itemEntity.getMemberId());
		itemDto.setCreateTime(itemEntity.getCreateTime());
//		if(itemEntity.getUpdateTime()==null) {
//			itemDto.setUpdateTime(null);
//		}else {			
//			itemDto.setUpdateTime(itemEntity.getUpdateTime());
//		}
		
		return itemDto;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
