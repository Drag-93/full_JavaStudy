package org.java.basic.arrayEx;

public class MultiArrayEx {

	public static void main(String[] args) {
		System.out.println("다차원배열");
		System.out.println("===========성적관리프로그램============");

		int[][] arrInt3 = { 
				{ 100, 89, 40, 76 },
				{ 50, 59, 70, 85 }, 
				{ 95, 99, 90, 96 }, 
				{ 60, 89, 80, 86 } };
		int kor = 0;
		int eng = 0;
		int math = 0;
		int sub = 0;
		int sum = 0;
		double avg = 0;
		
		System.out.println("=====================================================");
		System.out.println("번호\t국어\t영어\t수학\t과학\t합계\t평균");
		System.out.println("=====================================================");
		for (int i = 0; i < arrInt3.length; i++) {
//			System.out.println("2차원 배열 행 -> "+i);
			kor += arrInt3[i][0];
			eng += arrInt3[i][1];
			math += arrInt3[i][2];
			sub += arrInt3[i][3];

			int sum2 = 0;
			System.out.print(i + "\t");

			for (int j = 0; j < arrInt3[i].length; j++) {
				sum2 += arrInt3[i][j];
				System.out.print(arrInt3[i][j] + "\t");
			}
			System.out.print(sum2 + "\t");
			System.out.println(String.format("%.2f", sum2 / (double) 4));
			sum += sum2;
		}

//		System.out.println();
		int size = arrInt3.length * arrInt3[0].length;
		String strAvg = String.format(String.format("%.2f", sum / (double) (size)));
		System.out.println("=====================================================");
		System.out.println("과목별\t" + kor + "\t" + eng + "\t" + math + "\t" + sub + "\t" + sum + "\t" + strAvg);
		System.out.println("=====================================================");

	}
}
