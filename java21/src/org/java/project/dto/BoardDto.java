package org.java.project.dto;

import java.time.LocalDateTime;

import org.java.project.entity.BoardEntity;

public class BoardDto {
	private Long boardId;
	private String title;
	private String content;
	private Long memberId;
	
	private LocalDateTime createTime;
	private LocalDateTime updateTime;
	public BoardDto() {
		// TODO Auto-generated constructor stub
	}
	public BoardDto(Long boardId, String title, String content, Long memberId, LocalDateTime createTime,
			LocalDateTime updateTime) {
		super();
		this.boardId = boardId;
		this.title = title;
		this.content = content;
		this.memberId = memberId;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}
	public Long getBoardId() {
		return boardId;
	}
	public void setBoardId(Long boardId) {
		this.boardId = boardId;
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
		return "BoardDto [boardId=" + boardId + ", title=" + title + ", content=" + content + ", memberId=" + memberId
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}
	
	
	//Entity -> DTO
	
	public static BoardDto toBoardDto(BoardEntity boardEntity) {
		BoardDto boardDto = new BoardDto();
		
		boardDto.setBoardId(boardEntity.getBoardId());
		boardDto.setTitle(boardEntity.getTitle());
		boardDto.setContent(boardEntity.getContent());
		boardDto.setMemberId(boardEntity.getMemberId());
		boardDto.setCreateTime(boardEntity.getCreateTime());
		if(boardEntity.getUpdateTime()==null) {
			boardDto.setUpdateTime(null);
		}else {
		boardDto.setUpdateTime(boardEntity.getUpdateTime());
		}
		
		return boardDto;
	}
	
	
	
	
	
	
	
	
}
