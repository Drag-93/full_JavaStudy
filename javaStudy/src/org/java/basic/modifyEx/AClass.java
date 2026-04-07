package org.java.basic.modifyEx;

//모든 패키지에서 접근가능
public class AClass {
// class AClass {

	public int a;	//모든 패키지에서 접근 가능
	int b;			//같은패키지에서만 접근 가능
	private int age; // 외부에서 접근 못함, 캡슐화
	protected int d;// 같은패키지+상속관계에서 접근 가능
	
	
	// settters -> private 필드를 외부에서 접근
	public void setAge(int age) {
		this.age=age;
	}	
	
	/// getters -> private 필드를 외부에서 접근
	public int getAge() {
		return age;
	}
	
	
}
