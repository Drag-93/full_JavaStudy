package org.java.networkEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlEx1 {
	public static void main(String[] args) {
		BufferedReader in=null;
		
		try {
//			URL  url = new URL("https://www.starbucks.co.kr/index.do");
//			URL  url = new URL("http://192.168.23.211:8095/board/boardList");
//			URL  url = new URL("https://www.naver.com/");
			URL  url = new URL("http://192.168.23.211:8095/member/memberList");
			
			//URL로 부터 읽어 들인다.
			in = new BufferedReader(new InputStreamReader(url.openStream()));
			
			String inputLine;
			while((inputLine=in.readLine())!=null) {
				//한줄씩 읽어들인다.
				System.out.println(inputLine);
			}
		}catch(IOException e) {
			System.out.println("URL에서 데이터를 읽는 중에 오류가 발생했습니다.");
			e.printStackTrace();
		}finally {
			try {
				in.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
