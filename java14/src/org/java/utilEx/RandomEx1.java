package org.java.utilEx;

import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {

		System.out.println("===== Random =====");

		// 0<= Math.random() <1
		Random rd = new Random();

		System.out.println(rd);//
		System.out.println(rd.nextDouble());// double
		System.out.println(rd.nextInt()); // int
		// bound -> 범주
		// 0<=(int)(Math.random()*101) <101 -> 0<= 0~100 <101
		System.out.println(rd.nextInt(100));

		System.out.println();
		// 0<= rd.nextInt(45) <45 -> 0<= 0~44 <45
		System.out.println(rd.nextInt(45)); // 0<= X <=44 정수
		System.out.println(Math.random() * 45); // 0<= X <45

	}
}
