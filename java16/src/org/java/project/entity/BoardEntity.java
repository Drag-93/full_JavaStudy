package org.java.project.entity;

import java.time.LocalDateTime;

import org.java.project.dto.BoardDto;
// lombok
//@Entity  //DB테이블
//@Setter
//@Geter
//@ToString
//@NoArgsConsturc
//@AllArgsConsturct
//@Builder
public class BoardEntity {

	private Long boardId; // 게시글아이디 NOT NULL,자동
	private String title; // 글제목 NOT NULL
	private String content; // 글내용 NOT NULL
	private int hit; 		// 조회수 기본 0, 자동 +1
	private String post; 	// 게시글 구분, "비빌","일반"
	private Long memberId;  //게시글 작성자 아이디 => 로그인후 글작성시

	private LocalDateTime createTiem; // 자동 NULL
	private LocalDateTime updateTiem; // 자동 NULL

	//@NoArgsConsturct
	public BoardEntity() {
		// TODO Auto-generated constructor stub
	}
	//@AllArgsConsturct	
	public BoardEntity(Long boardId, String title, String content, int hit, String post, Long memberId,
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
	// BoardDto -> BoardEntity
	// 게시글 작성
	public static BoardEntity toWriteBoardEntity(BoardDto boardDto) {		
		BoardEntity boardEntity = new BoardEntity();
//		boardEntity.setBoardId(boardDto.getBoardId()); // 자동
		boardEntity.setTitle(boardDto.getTitle());
		boardEntity.setContent(boardDto.getContent());
		boardEntity.setPost(boardDto.getPost());//구분
		boardEntity.setHit(0); // 기본 0
		boardEntity.setMemberId(boardDto.getMemberId()); //작성자 아이디
//		boardEntity.setCreateTiem(LocalDateTime.now()); // 자동
		return boardEntity;
	}

	// 게시글 수정
	public static BoardEntity toUpdateBoardEntity(BoardDto boardDto) {
		BoardEntity boardEntity = new BoardEntity();
		boardEntity.setBoardId(boardDto.getBoardId());//필수 -> 게시글 아이디
		boardEntity.setTitle(boardDto.getTitle());
		boardEntity.setContent(boardDto.getContent());
		boardEntity.setHit(boardDto.getHit());
		boardEntity.setPost(boardDto.getPost());
		boardEntity.setMemberId(boardDto.getMemberId());
		boardEntity.setCreateTiem(boardDto.getCreateTiem());//게시글 작성시간
//		boardEntity.setUpdateTiem(LocalDateTime.now());

		return boardEntity;

	}
	@Override
	public String toString() {
		return "BoardEntity [boardId=" + boardId + ", title=" + title + ", content=" + content + ", hit=" + hit
				+ ", post=" + post + ", memberId=" + memberId + ", createTiem=" + createTiem + ", updateTiem="
				+ updateTiem + "]";
	}

	

}
