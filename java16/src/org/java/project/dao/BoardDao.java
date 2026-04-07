package org.java.project.dao;

public class BoardDao {

	//////////싱글톤 /////////////////
	private BoardDao() {
		System.out.println("싱글톤 ->  BoardDao");
	}

	private static class SingleTon {
		private static final BoardDao INSTANCE = new BoardDao();
	}

	public static BoardDao getInstance() {
		return SingleTon.INSTANCE;
	}
	//////////싱글톤 /////////////////
}
