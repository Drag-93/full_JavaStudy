package org.java.ioEx;

import java.util.UUID;

public class PasswordEncodingEx {
	public static void main(String[] args) {
		System.out.println("비밀번호 암호화, 이미지 이름 암호화(원본과 별도로)");
		
		String oldFileName="shop_01.jpg";
		
//		UUID(범용 고유 식별자(Universally Unique Identifier)
//				네트워크 상에서 중복되지 않는 고유한 식별자를 만들기 위한 표준 규약
//				비밀번호, 이미지 암호화 등에 사용
//				UUID uuid = UUU.randomUUID();
		
		UUID uuid = UUID.randomUUID();	//random id -> 랜덤한 값을 추출하는 클래스
		System.out.println(uuid);
		String newFileName=uuid+ "_" + oldFileName; //원본이름+랜덤이름 저장파일이름(보안)
		
		System.out.println(oldFileName);
		System.out.println(newFileName);
		
//		DB파일 테이블
//		newFileName, oldFileName-> 필드값으로 저장
//		실제 저장되는 이미지는 DB가 아니라 서버(로컬)의 특정 경로
//		-> 반드시 접근 권한을 허용해야된다.
//		-> Spring 에서는 별도의 Config파일을 이용해서 설정
//		-> 리눅스(AWS) -> chmod - R  ~이용해서 설정
		
	}
}
