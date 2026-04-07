package org.java.basic.oopEx;

import org.java.basic.common.CommonClass;

public class ClassMethodeExMain {
	
	
	int n1;
	static int n2;
	
	
		public static void main(String[] args) {

//		n1=10;
				
		System.out.println(CommonClass.PROJEC_NAME);
		
		System.out.println("매서드");

		ClassMethodeEx c1 = new ClassMethodeEx();

		String rs1 = c1.toString();//
		System.out.println(rs1);		
		c1.num1 = 100;
		c1.num2 = 200;
		System.out.println(rs1);

		String rs2 = c1.toString();//
		System.out.println(rs2);
		//return값이 없이 매서드 호출 (call)
		//매서드 오버로딩 -> 다형성(PolyMorPhism)
		c1.m1();
		c1.m1(100);
		c1.m1(100,"문자열");
		c1.m1("문자열",100);
		
		//매서드 호출곳에 return값이 반환	
		int cm12Return = c1.m12();//call
		String cm13Return = c1.m13();//call

		System.out.println(cm12Return + " << m12() return");
		System.out.println(cm13Return + " << m13() return");

		String op = c1.m2("/"); // 호출(반환값 반환) 하고 메모리에서 제거
		System.out.println(op);
		System.out.println(c1.m2("+"));

		int sum = c1.m3(100, 200);//call
		System.out.println(sum);
		System.out.println(c1.m3(100, 200));

		int rsM4 = c1.m4(500, 200, "+");
		System.out.println(rsM4);
		
		MemberDto memberDto= c1.members();
		
		System.out.println(memberDto);
		
	
	}

}
