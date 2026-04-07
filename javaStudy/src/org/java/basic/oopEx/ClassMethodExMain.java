package org.java.basic.oopEx;

public class ClassMethodExMain {

	int n1;
	static int n2;
	
	public static void main(String[] args) {
		
//		n1=10; < 에러 static만 받을 수 있음
		
		System.out.println("메서드");
		
		ClassMethodEx c1 = new ClassMethodEx();
		
		String rs1=c1.toString();
		System.out.println(rs1);
		
		c1.num1=100;
		c1.num2=200;
		System.out.println(rs1);
		
		String rs2 = c1.toString();
		System.out.println(rs2);
		//return값이 없이 메서드 호출 (call)
		//메서드  오버로딩 -> 다형성(PolyMorPhism)
		c1.m1();
		c1.m1(100);
		c1.m1(100,"문자열");
		c1.m1("문자열",100);
		
		
		int cm12Return=c1.m12();
		String cm13Return=c1.m13();
		
		System.out.println(cm12Return+" << m12() return");
		System.out.println(cm13Return+" << m13() return");
		
		String op = c1.m2("/");
		System.out.println(op);
		System.out.println(c1.m2("+"));
		
		int sum = c1.m3(100, 200);//calss
		System.out.println(sum);
		System.out.println(c1.m3(100,200));
		
		int rsM4=c1.m4(500, 200, "+");
		System.out.println(rsM4);
		
		MemberDto memberDto=c1.members();
		
		System.out.println(memberDto);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
