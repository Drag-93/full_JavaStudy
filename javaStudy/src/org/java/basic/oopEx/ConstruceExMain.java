package org.java.basic.oopEx;

public class ConstruceExMain {

	public static void main(String[] args) {
		System.out.println("생성자 정리");

		ConstructEx c1 = new ConstructEx();
		c1.setNum1(100);
		c1.setNum2(200);
		c1.setOp("+");
		String rs1 = c1.toString();
		System.out.println(rs1);

		ConstructEx c2 = new ConstructEx(100);
		c2.setNum2(250);
		c2.setOp("-");
		String rs2 = c2.toString();
		System.out.println(rs2);

		ConstructEx c3 = new ConstructEx(100, 200);
		c3.setOp("*");
		String rs3 = c3.toString();
		System.out.println(rs3);

		ConstructEx c4 = new ConstructEx(200, 300, "/");

		String rs4 = c4.toString();
		System.out.println(rs4);

	}
}
