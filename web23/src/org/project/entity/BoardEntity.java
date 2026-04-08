package org.project.entity;

import org.project.dto.BoardDto;

public class BoardEntity {
	private Long boardId;
    private String title;
    private String content;
    private String boardPw;
    private String nickName;
    private int hit;
    private Long memberId;
    
    public BoardEntity() {
		// TODO Auto-generated constructor stub
	}

	public BoardEntity(Long boardId, String title, String content, String boardPw, String nickName, int hit,
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
		return "BoardEntity [boardId=" + boardId + ", title=" + title + ", content=" + content + ", boardPw=" + boardPw
				+ ", nickName=" + nickName + ", hit=" + hit + ", memberId=" + memberId + "]";
	}
    //DTO -> Entity
	//insert
	public static BoardEntity toInsertBoardEntity(BoardDto boardDto) {
		BoardEntity boardEntity = new BoardEntity();
		
		boardEntity.setTitle(boardDto.getTitle());
		boardEntity.setContent(boardDto.getContent());
		boardEntity.setBoardPw(boardDto.getBoardPw());
		boardEntity.setNickName(boardDto.getNickName());
		boardEntity.setHit(boardDto.getHit());
		boardEntity.setMemberId(boardDto.getMemberId());
		
		return boardEntity;
	}
	
	//update
	public static BoardEntity toUpdateBoardEntity(BoardDto boardDto) {
		BoardEntity boardEntity = new BoardEntity();
		
		boardEntity.setBoardId(boardDto.getBoardId());
		boardEntity.setTitle(boardDto.getTitle());
		boardEntity.setContent(boardDto.getContent());
		boardEntity.setBoardPw(boardDto.getBoardPw());
		boardEntity.setNickName(boardDto.getNickName());
		boardEntity.setHit(boardDto.getHit());
		boardEntity.setMemberId(boardDto.getMemberId());
		
		return boardEntity;
	}
	
	
}
