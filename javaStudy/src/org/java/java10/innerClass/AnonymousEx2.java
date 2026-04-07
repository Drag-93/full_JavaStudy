package org.java.java10.innerClass;

interface I1{
	void ab1();
}
interface I2 extends I1{
	void ab2();
}

interface I3 extends I2{
	void ab3();
}

public class AnonymousEx2 {

	public static void main(String[] args) {
		I1 i1=new I1() {
			
			@Override
			public void ab1() {
				System.out.println("ab1");				
			}
		};
		i1.ab1();
		new I2() {
			
			@Override
			public void ab1() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void ab2() {
				// TODO Auto-generated method stub
				
			}
		};
		new I3() {
			
			@Override
			public void ab1() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void ab2() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void ab3() {
				// TODO Auto-generated method stub
				
			}
		};
	}
}