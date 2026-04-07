package org.java.basic.arrayEx;

public class ArrayEx3 {
	public static void main(String[] args) {
		System.out.println("배열-> 대문자->소문자");
		
		//대문자를 담을 배열 생성
		char[] arrAlpha=new char[26];
		
		for(int i=0; i<arrAlpha.length;i++) {
			
			//65 -> 'A'
			arrAlpha[i]=(char)(i+65);
									
			if((i+1)%5==0) {
				System.out.print(arrAlpha[i]+"-> "+(char)(arrAlpha[i]+32)+"\n");
			}else {
				System.out.print(arrAlpha[i]+"-> "+(char)(arrAlpha[i]+32)+" ");
			}
		}
		System.out.println();
		
		for(int i=0; i<arrAlpha.length;i++) {
			System.out.print(arrAlpha[i]+" ");
		}
		System.out.println();
		
		char arrTemp=' ';
		//1000번 섞어준다
		for(int i=0;i<=1000;i++) {
			int idx=(int)(Math.random()*arrAlpha.length);
			
			//***랜덤번지 문자를 0번지에, 
			//0번지의 문자를 랜덤번지에,
			//랜덤번지 문자를 0번지에
			//빈 배열?(문자)에 arrAlpha의 랜덤번지 문자를 담아두고,
			//0번지 문자를 랜덤번지에 넣고,
			//랜덤번지 문자를 0번지에 넣는다.(like 야바위)
			arrTemp=arrAlpha[idx];
			arrAlpha[idx]=arrAlpha[0];
			arrAlpha[0]=arrTemp;
		}
		System.out.println();
		for(int i=0; i<arrAlpha.length;i++) {
			System.out.print(arrAlpha[i]+" ");
		}
		System.out.println();
		
		
		
		
		
		
		
	}
}
