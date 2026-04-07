package org.java.basic.loopEx;

public class CalculatorEx {

	//멤버 -> 필드+생성자+매서드
	//필드
	public int num1; // 숫자1 , 인스턴스 멤버 new
	public int num2; // 숫자2 , 인스턴스 멤버 new
	public String op; // 연산자 , 인스턴스 멤버 new
	
	//생성자 Construct 
	//-> 객체 생성에 도움을 주는 매서드, 클래스명과 이름이 같다
	//-> 반환값(return)이 없다. ->void -> 생략
	public CalculatorEx() {
		System.out.println("기본생성자");
	}
	//다른생성자
	public CalculatorEx(int num1, int num2, String op) {
		this.num1=num1;
		this.num2=num2;
		this.op=op;
	}
	//매서드
	//인스턴스 매서드 new
	//public -> 접근지정자(접근제한자) 반환타입 매서드명(매개변수){}
	//void? -> return 값(변화값)이 없다 
	public void getCalculatorMethod() {
		
		if(op.equals("+")) {
			System.out.println(num1+"+"+num2+"="+(num1+num2));}
		else if(op.equals("-")) {
			System.out.println(num1+"-"+num2+"="+(num1-num2));}
		else if(op.equals("*")) {
			System.out.println(num1+"*"+num2+"="+(num1*num2));}
		else if(op.equals("/")) {
			System.out.println(num1+"/"+num2+"="+String.format("%.1f",(num1/(double)num2)));}
		else if(op.equals("exit")) {
			System.out.println("프로그램 종료");
		}else {
			System.out.println("연산자 입력오류");
		}
			
		}
			
	
	
}
