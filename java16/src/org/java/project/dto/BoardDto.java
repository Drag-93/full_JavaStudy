package org.java.project.dto;

import java.time.LocalDateTime;

import org.java.project.entity.BoardEntity;

//@NoArgsConstruct
//@AllArgsConstruct
//@Bulder
//@ToString
public class BoardDto {
	
	private Long boardId; // 게시글아이디 NOT NULL,자동
	private String title; // 글제목 NOT NULL
	private String content; // 글내용 NOT NULL
	private int hit; 		// 조회수 기본 0, 자동 +1
	private String post; 	// 게시글 구분, "비빌","일반"
	private Long memberId;  //게시글 작성자 아이디 => 로그인후 글작성시

	private LocalDateTime createTiem; // 자동 NULL
	private LocalDateTime updateTiem; // 자동 NULL
	
	public BoardDto() {
		// TODO Auto-generated constructor stub
	}

	public BoardDto(Long boardId, String title, String content, int hit, String post, Long memberId,
			LocalDateTime createTiem, LocalDateTime updateTiem) {
		super();
		this.boardId = boardId;
		this.title = title;
		this.content = content;
		this.hit = hit;
		this.post = post;
		this.memberId = memberId;
		this.createTiem = createTiem;
		this.updateTiem = updateTiem;
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

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public LocalDateTime getCreateTiem() {
		return createTiem;
	}

	public void setCreateTiem(LocalDateTime createTiem) {
		this.createTiem = createTiem;
	}

	public LocalDateTime getUpdateTiem() {
		return updateTiem;
	}

	public void setUpdateTiem(LocalDateTime updateTiem) {
		this.updateTiem = updateTiem;
	}
	//Entity -> Dto
	public static BoardDto toBoardDto(BoardEntity boardEntity) {
		
		BoardDto boardDto=new BoardDto();
		
		boardDto.setBoardId(boardEntity.getBoardId());
		boardDto.setTitle(boardEntity.getTitle());
		boardDto.setContent(boardEntity.getContent());
		boardDto.setPost(boardEntity.getPost());
		boardDto.setHit(boardEntity.getHit());
		boardDto.setMemberId(boardEntity.getMemberId());
		boardDto.setCreateTiem(boardEntity.getCreateTiem());
		boardDto.setUpdateTiem(boardEntity.getUpdateTiem());
		
		return boardDto;
	}
	
	@Override
	public String toString() {
		return "BoardDto [boardId=" + boardId + ", title=" + title + ", content=" + content + ", hit=" + hit + ", post="
				+ post + ", memberId=" + memberId + ", createTiem=" + createTiem + ", updateTiem=" + updateTiem + "]";
	}
	
	
	
}