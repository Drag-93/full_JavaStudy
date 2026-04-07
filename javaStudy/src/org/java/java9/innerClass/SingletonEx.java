package org.java.java9.innerClass;

import java.util.List;

public class SingletonEx {
	// 싱글톤
	/////////////////////////////////////////////////////////////////
	// 3. 기본생성자
	private SingletonEx() {
		System.out.println("SingletonEx -> 싱글톤");
	}
	// 2. 내부클래스
	private static class SingleTonClass {
		// 초기화 -> 1 ->final ->한번만생성
		private static final SingletonEx INSTANCE = new SingletonEx();
	}
	// 1.외부에서 접근
	public static SingletonEx getInstance() {
		return SingleTonClass.INSTANCE;
	}
	/////////////////////////////////////////////////////////////////
	public int insert() {
		//회원가입 성공하면 1 <- DB
		System.out.println("회원가입");
		return 1;
	}
	public int update() {
		//회원수정 성공하면 1 <- DB
		System.out.println("회원수정");
		return 1;
	}
	public int delete() {
		//회원탈퇴 성공하면 1 <- DB
		System.out.println("회원탈퇴");
		return 1;
	}
	public List<String> select() {
		System.out.println("회원조회");
		return null;// 조회할게 없으면 null <- DB
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}