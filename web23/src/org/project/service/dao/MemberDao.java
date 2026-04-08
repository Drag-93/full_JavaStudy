package org.project.service.dao;

public class MemberDao {
//=========================싱글톤=========================
	private MemberDao() {
		System.out.println("싱글톤 -> MemberDao");
	}
	private static class SingleTon{
		private static final MemberDao INSTANCE =new MemberDao();
	}
	public static MemberDao getInstance() {
		return SingleTon.INSTANCE;
	}
//=========================싱글톤=========================
	
	
	
	
	
	
	
	
}
