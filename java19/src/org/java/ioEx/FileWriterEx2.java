package org.java.ioEx;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterEx2 {
	public static void main(String[] args) {
		System.out.println("FileWriter - 종료시 Ctrl+Z");
		
		InputStreamReader iReader = new InputStreamReader(System.in);
		
		FileWriter fWriter =null;  //파일로 저장
		FileReader fReader =null;  //파일 불러오기
			//test 폴더에 파일 생성
		String fileName ="C:\\test\\test3.txt";
		
		try {
			fWriter = new FileWriter(fileName);//파일생성
			int inData;
			while((inData=iReader.read())!=-1) {
				fWriter.write(inData);
			}
			fWriter.close();//반드시 close
			System.out.println("\n ===파일내용===");
			fReader=new FileReader(fileName);
			int reData;
			while ((reData=fReader.read())!=-1) {
				System.out.print((char)reData);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(iReader !=null) iReader.close();
				if(fReader != null) fReader.close();
				if(fWriter != null) fWriter.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		
			
		}
		
	}
}
