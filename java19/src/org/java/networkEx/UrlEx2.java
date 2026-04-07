package org.java.networkEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class UrlEx2 {

	public static void main(String[] args) {
		try {
//			URL aurl = new URL("https://www.naver.com/");
			URL aurl = new URL("https://192.168.23.211:8095/member/join");
			
			URLConnection uc=aurl.openConnection();
			uc.setDoOutput(true);
			
			OutputStreamWriter out = new OutputStreamWriter(uc.getOutputStream());
			//
			out.write("userEmail=test@test.com&userPw=11&userAddress=11");
			out.close();
			
			BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
			
			String inputLine;
			while((inputLine=in.readLine())!=null) {
				System.out.println(inputLine);
			}
			in.close();
		}catch(IOException e) {
			System.out.println("URL에서 데이터를 읽는 중에 오류가 발생했습니다.");
			e.printStackTrace();
		}
	}
}
