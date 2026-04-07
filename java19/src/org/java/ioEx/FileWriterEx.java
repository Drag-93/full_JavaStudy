package org.java.ioEx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterEx {
	public static void main(String[] args) {
		//입력 종료
		System.out.println("FileWriter -종료시 Ctrl+Z(Windows) or Ctrl+D(Mac)");
		
		//저장 파일 이름
		String fileName1 = "C:\\test\\test4.txt"; //test폴더에 test4.txt 파일로 저장
		File file = new File(fileName1);
		//파일 저장
		FileWriter fileWriter =null;
		//시스템출력(콘솔) 입력
		InputStreamReader iReader = new InputStreamReader(System.in);
		
		try {
			fileWriter= new FileWriter(file);
			int reData;
										//-1 -> Ctrl + Z
			while((reData= iReader.read())!=-1) {
				fileWriter.write(reData);//저장
			}											//파일 경로
			System.out.println("\n File 저장 성공: "+file.getAbsolutePath());
		}catch(IOException e) {
			System.out.println("입출력오류");
			e.printStackTrace();
		}finally {
			try {
				if(fileWriter !=null) fileWriter.close();
				if(iReader !=null) iReader.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
