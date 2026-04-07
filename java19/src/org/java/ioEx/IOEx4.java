package org.java.ioEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOEx4 {
	public static void main(String[] args) {
		
		System.out.println("IO");
		
		String fileName = "C:\\test\\test1.txt"; //->file 읽기(텍스트파일)
//		String fileName = "C:\\test\\test5.txt"; //->file 읽기(텍스트파일)
		
		//file 읽어들인다 -> FileInputStream, FileReader(문자형파일만)
		FileInputStream fileInputStream = null;
		
		try {
				fileInputStream= new FileInputStream(fileName); //파일이 없으면 FilenotFoudException
				int reData=0;//파일 숫자 입력
					//파일을 읽어들인다 -> 끝까지(-1)
				while((reData=fileInputStream.read())!=-1) {
					//하나씩 출력(문자 하나씩 출력) -> 아스키코드
					System.out.print((char)reData);
				}
		}catch(FileNotFoundException e) {
			System.out.println("File->No");
			e.printStackTrace();
		}catch(IOException e) {
			System.out.println("입출력 예외");
			e.printStackTrace();
		}finally {
			try {
				if(fileInputStream !=null) {
					fileInputStream.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
	}
}
