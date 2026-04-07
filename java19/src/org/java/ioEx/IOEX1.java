package org.java.ioEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOEX1 {
	public static void main(String[] args) {
		System.out.println("IO");
		// 문자 입력 -> Reader(읽기), Writer(작성)
		InputStreamReader inStreamReader =null;
		
		try {
			//while문이영 -> exit 종료 -> 계속 실행
			inStreamReader = new InputStreamReader(System.in);
			//임시 저장소 -> Scanner
			BufferedReader bReader = new BufferedReader(inStreamReader);
			
			while(true) {
				System.out.println("실행? (exit->종료)");
				String q=bReader.readLine();
				if(!q.equals("exit")) {
					System.out.println("이름 입력: ");
					String name=bReader.readLine();//한줄씩
					System.out.println("국어점수 입력: ");
					String kor=bReader.readLine();//한줄씩
					System.out.println("영어점수 입력: ");
					String eng=bReader.readLine();//한줄씩
					System.out.println("수학점수 입력: ");
					String math=bReader.readLine();//한줄씩
					
					int sum=Integer.parseInt(kor)+Integer.parseInt(eng)+Integer.parseInt(math);
					double avg = (double)sum/3;
					System.out.println("이름: "+name);
					System.out.println("총점: "+sum);
					System.out.println("평군: "+avg);
				}else {
					System.out.println("종료");
					break;
				}

			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				inStreamReader.close();
				}catch(IOException e){
					e.printStackTrace();
				}
		}
		
		
		
		
		
		
		
		
		
	}
}
