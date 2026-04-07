package org.java.basic.inheritanceEx;

public class MemberDeleteImpl extends MemberService{
	@Override
	public void excuteQueryService() {
		System.out.println("회원탈퇴");
	}
}
