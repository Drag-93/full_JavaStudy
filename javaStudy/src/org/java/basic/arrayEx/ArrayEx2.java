package org.java.basic.arrayEx;

public class ArrayEx2 {
	public static void main(String[] args) {
		System.out.println("배열");
		
		int[] arrInt= {1,2,3,4,5};
		byte[] arrByte= {1,2,3,4,5};
		char[] arrCh= {'a','b','c','d','e'};
		String[] arrStr= {"m11","a11","11n","11d","11f"};
		
		for(int i=0; i<5; i++) {
			System.out.println(arrInt[i]+" ");
			System.out.println(arrByte[i]+" ");
			System.out.println(arrCh[i]+" ");
			System.out.println(arrStr[i]+" ");
		}
System.out.println();
	//int형 45숫자 1~45를 저장할 수 있는 배열 lotto를 선언하고
	//for문을 이용해서 1~45를 저장해보세요

		int[] lotto= new int[45];
		
		for(int i=0; i<lotto.length;i++) {
			lotto[i]=i+1;
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		
			System.out.println("0번지~5번지까지 출력");
			for(int i=0; i<6;i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		//0<= x <1 ->랜덤수//0<=x<45
		//0~44까지 랜덤 정수 추출
		 int index=(int)(Math.random()*45);
				 System.out.println(index);
		 
		 //랜덤인덱스에 해당하는 배열의 숫자
		 System.out.println(lotto[index]);

	System.out.println();
	for(int i=0;i<6;i++);{
		int index2=(int)(Math.random()*45);
		System.out.println(index2+" -> "+lotto[index2]+" ");
		
		
		
		char[] arrCh2= {'a','b','c','d','e'};
		
		//for문 이용해서 소문자 -> 대문자
		
		for(int i=0;i<arrCh2.length;i++){
			System.out.println(arrCh2[i]+" ->"+(char)(arrCh2[i]-32));
		}
		
		
		
		
		
		
	}
	
	

}
}
		