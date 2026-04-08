package org.project.dto;

import org.project.entity.BoardEntity;

public class BoardDto {
	private Long boardId;
    private String title;
    private String content;
    private String boardPw;
    private String nickName;
    private int hit;
    private Long memberId;
    public BoardDto() {
		// TODO Auto-generated constructor stub
	}
	public BoardDto(Long boardId, String title, String content, String boardPw, String nickName, int hit,
			Long memberId) {
		super();
		this.boardId = boardId;
		this.title = title;
		this.content = content;
		this.boardPw = boardPw;
		this.nickName = nickName;
		this.hit = hit;
		this.memberId = memberId;
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
	public String getBoardPw() {
		return boardPw;
	}
	public void setBoardPw(String boardPw) {
		this.boardPw = boardPw;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public Long getMemberId() {
		return memberId;
	}
	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	@Override
	public String toString() {
		return "BoardDto [boardId=" + boardId + ", title=" + title + ", content=" + content + ", boardPw=" + boardPw
				+ ", nickName=" + nickName + ", hit=" + hit + ", memberId=" + memberId + "]";
	}
    
	//Entity -> DTO
	public static BoardDto toBoardDto(BoardEntity boardEntity) {
		BoardDto boardDto = new BoardDto();
		
		boardDto.setBoardId(boardEntity.getBoardId());
		boardDto.setTitle(boardEntity.getTitle());
		boardDto.setContent(boardEntity.getContent());
		boardDto.setBoardPw(boardEntity.getBoardPw());
		boardDto.setNickName(boardEntity.getNickName());
		boardDto.setHit(boardEntity.getHit());
		boardDto.setMemberId(boardEntity.getMemberId());
		
		return boardDto;
	}
	
	
	
}
