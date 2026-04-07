package org.java.basic.arrayEx;

public class LottoEx {
	public static void main(String[] args) {
		System.out.println("Lotto");
		
		int[] arrLotto=new int[45];
		
		for(int i=0; i<arrLotto.length;i++) {
			arrLotto[i]=i+1;
//			System.out.print(arrLotto[i]+" ");
		}
						
		
		int arrTemp=0;
		
		for(int i=0;i<1000;i++) {
			int idx=(int)(Math.random()*arrLotto.length);
			
			arrTemp=arrLotto[idx];
			arrLotto[idx]=arrLotto[0];
			arrLotto[0]=arrTemp;
			
		}
		for(int i=0;i<6;i++) {
			System.out.print(arrLotto[i]+" ");
		}
	}
}
