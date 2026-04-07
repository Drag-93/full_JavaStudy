package org.java.basic.arrayEx;

public class ArrayEx5 {
	public static void main(String[] args) {
		System.out.println("다차원배열");
		
		int[][] score= {
			   //국어,영어,수학
				{100,50,100},
				{90,80,90},
				{80,80,85},
				{70,90,85}
				
		};
		System.out.println(score.length);//행
		System.out.println(score[0].length);//열
		int kor=0;
		int eng=0;
		int math=0;
		int total=0;
		double totalAvg=0;
		System.out.println("==================중간고사성적==================");
		System.out.println("---------------------------------------------");
		System.out.println("번호\t국어\t영어\t수학\t총점수\t평균");
		System.out.println("---------------------------------------------");
		
		
		//콘솔에출력
		for(int i=0;i<score.length;i++) {
			int sum=0;
			System.out.print(i+1); //번호
			kor+=score[i][0];
			eng+=score[i][1];
			math+=score[i][2];
			for(int j=0;j<score[i].length;j++) {
				
				System.out.print("\t"+score[i][j]); //국어 영어 수학 점수
				sum+=score[i][j];
			}
			double avg=sum/(double)score[0].length;
			total+=sum;
			System.out.print("\t"+sum); // 총 점수
			System.out.print("\t"+String.format("%.1f", avg)); //평균
			System.out.println();
		}
		//배열의 총 요소 개수
		int sumElementCout=score.length*score[0].length;
		
		//총 합계 평균
		totalAvg=total/(double)sumElementCout;
		
		
		System.out.println("---------------------------------------------");
		System.out.println("과목별"+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+String.format("%.1f",totalAvg));
		System.out.println("---------------------------------------------");
		
	}
}
