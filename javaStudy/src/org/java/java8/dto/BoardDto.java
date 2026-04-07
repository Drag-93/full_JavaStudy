package org.java.java8.dto;

import java.time.LocalDateTime;

public class BoardDto {
	private Long boardId; // 게시글아이디
	private String title;	//게시글 제목
	private String content; //게시글 내용
	private int count;	// 조회후
	private Long memberId; // 로그인한 회원아이디-> 회원만 글작성 허용
	private LocalDateTime createTime; //작성시간
	private LocalDateTime updateTime;//수정시간
	
	public BoardDto() {
		// TODO Auto-generated constructor stub
	}

	public BoardDto(Long boardId, String title, String content, int count, Long memberId, LocalDateTime createTime,
			LocalDateTime updateTime) {
		super();
		this.boardId = boardId;
		this.title = title;
		this.content = content;
		this.count = count;
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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
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
		return "BoardDto [boardId=" + boardId + ", title=" + title + ", content=" + content + ", count=" + count
				+ ", memberId=" + memberId + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}
	 
	
	
	
	
	
	
	
	
}
