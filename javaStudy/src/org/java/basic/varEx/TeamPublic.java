package org.java.basic.varEx;

public class TeamPublic {
	public int num1; //맴버, 
	// 클래스 맴버(공유) ->static
	// 클래스명.맴버(변수,매서드) -> new 없이 접근가능
	// TeamPublic.MAX_NUMBER <-다른클래스에서 접근
	public static final int MAX_NUMBER=10000;
	public static final int MIN_NUMBER=10;
	public static final String PRJECTNAME="FULL_PROJECT2026";
	
	public static void round2() {
		System.out.println("round2 -> static매서드");
	}
}
