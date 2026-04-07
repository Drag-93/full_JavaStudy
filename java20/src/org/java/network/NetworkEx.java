package org.java.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

	public class NetworkEx {
		public static void main(String[] args) {
			BufferedReader bufferedReader=null;
			try {
				URL url = new URL("https://www.apple.com/");
				bufferedReader=new BufferedReader(new InputStreamReader(url.openStream()));
				String input;
				//끝까지 읽어서 콘솔에 출력
				while((input=bufferedReader.readLine())!=null) {
					System.out.println(input);
				}
			}catch(MalformedURLException e) {
				e.printStackTrace();
				System.out.println("데이터 처리 예외");
			}catch(IOException e) {
				e.printStackTrace();
			}finally {
				try {
					bufferedReader.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

