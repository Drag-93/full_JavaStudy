package org.java.utilEx;

import java.util.Random;

public class RandomEx2 {

	public static void main(String[] args) {

		System.out.println("=== Random ===");
		System.out.println("=== 로또 프로그램 만들기(Random)이용 ===");

		//배열,for, if,조회,nextInt(45),1000번 섞어준다.
						
		int[] lotto = new int[45];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}

		int temp = 0;

		Random rd = new Random();		
		for (int i = 0; i < 1000; i++) {
			int idx = rd.nextInt(45); // 0<= 0~44 < 45
			temp = lotto[idx];
			lotto[idx] = lotto[0];
			lotto[0] = temp;
		}
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}

	}
}
