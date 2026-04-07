package org.java.basic.arrayEx;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		
		int[][] score= {
				{100,89,40,76},
				{50,59,70,85},
				{95,99,90,96},
				{60,89,80,86}
			};
		Scanner input = new Scanner(System.in);
		
		System.out.println("=====================성적관리프로그램=====================");
		System.out.println("------------------------------------------------------");
		System.out.println("번호\t국어\t영어\t수학\t과학\t합계\t평균");
		System.out.println("------------------------------------------------------");
		
		int kor=0;
		int eng=0;
		int math=0;
		int sci=0;
		double avg=0;
		int total=0;
		double totalAvg=0;
		
		
		for(int i=0;i<score.length;i++) {
			System.out.print(i+1);
			int sum=0;
			for(int j=0;j<score[i].length;j++) {
				System.out.print("\t"+score[i][j]);
				sum+=score[i][j];
			}
			avg=sum/(double)score[i].length;
			System.out.print("\t"+sum);
			System.out.print("\t"+String.format("%.1f",avg));
			System.out.println();
			kor+=score[i][0];
			eng+=score[i][1];
			math+=score[i][2];
			sci+=score[i][3];
			total+=sum;
		}
		int sumElementCount=score[0].length*score.length;
		totalAvg=total/(double)sumElementCount;
		
		System.out.println("------------------------------------------------------");
		System.out.println("과목별"+"\t"+kor+"\t"+eng+"\t"+math+"\t"+sci+"\t"+total+"\t"+String.format("%.1f",totalAvg));
		System.out.println("------------------------------------------------------");
		
		
		
		
		
		input.close();
	}
}
