package org.java.basic.operatorEx;


public class OperatorEx3 {
	public static void main(String[] args) {
		System.out.println("논리연산자(&&,||,^,!)");
		
		int num1=10;
		int num2=5;
		
		//&&
		System.out.println(num1>=10 && num2>=5);
		System.out.println(num1>=20 && num2>=5);
		System.out.println(num1>=10 && num2>=50);
		System.out.println(num1>=20 && num2>=50);
		
		String id="m111";
		String pw="1111";
		
		System.out.println("&&");// 둘 다 true 이면 true
		System.out.println(id.equals("m111")&& pw.equals("1111"));
		System.out.println(id.equals("m111")&& pw.equals("1112"));
		System.out.println(id.equals("m112")&& pw.equals("1111"));
		System.out.println(id.equals("m112")&& pw.equals("1112"));
		
		System.out.println("||"); //하나라도 true 면 true
		System.out.println(id.equals("m111")|| pw.equals("1111"));
		System.out.println(id.equals("m111")|| pw.equals("1112"));
		System.out.println(id.equals("m112")|| pw.equals("1111"));
		System.out.println(id.equals("m112")|| pw.equals("1112"));
		
		System.out.println("^"); //조건이 서로 다르면 false
		System.out.println(id.equals("m111")^ pw.equals("1111"));
		System.out.println(id.equals("m111")^ pw.equals("1112"));
		System.out.println(id.equals("m112")^ pw.equals("1111"));
		System.out.println(id.equals("m112")^ pw.equals("1112"));
		
		System.out.println("!");//부정연산자
		System.out.println(!id.equals("m111")); //false
		System.out.println(!pw.equals("1111")); //false
		System.out.println();
		
		
		System.out.println(!id.equals("m111")&& !pw.equals("1111"));
		System.out.println(!id.equals("m111")&& !pw.equals("1112"));
		System.out.println(!id.equals("m112")&& !pw.equals("1111"));
		System.out.println(!id.equals("m112")&& !pw.equals("1112"));
		
		
		System.out.println();
		
		int i=0;
		boolean bool=true;
		
		while(bool) {
			System.out.println("while");
//			if(i==0) {break;}
			if(i==0) {
//				break;
				bool=false;
			}
		}
				
			
	}
}
