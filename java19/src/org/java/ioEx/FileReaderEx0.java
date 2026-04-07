package org.java.ioEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx0 {
	public static void main(String[] args) {
		
		FileReader fileReader = null;
//			String fileName="C:\\test1.txt";
		String fileName="C:\\test\\test5.txt";
		System.out.println(fileName);
		
		File file = new File(fileName); //파일을 File 객체에 ㅈ장
		try {
				
							//문자열 파일
			fileReader = new FileReader(file);
			int reData = 0;
			//파일이 끝이 아니면
			while((reData=fileReader.read())!=-1) {
				System.out.print((char)reData);
			}
		}catch(FileNotFoundException e) {
			System.out.println("File Fail");
			e.printStackTrace();
		}catch(IOException e) {
			System.out.println("입출력 Fail");
			e.printStackTrace();
		}finally {
			try {
				if(fileReader !=null) {
					fileReader.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
				}
			}
		
		
		
		
		
		
		
	}
}
