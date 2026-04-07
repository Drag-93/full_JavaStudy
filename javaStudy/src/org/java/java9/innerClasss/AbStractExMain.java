package org.java.java9.innerClasss;

public class AbStractExMain {

	public static void main(String[] args) {
		AbStractExSub ab1=new AbStractExSub();
		ab1.ab1();
		//부모타입의 객체참조변수로 자식객체를 참조할수 있다 <-다형성
		AbStractEx ab2=new AbStractExSub();
		ab2.ab1();
	}
}
