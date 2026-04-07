package org.java.basic.oopEx;

public class Class2 {
	//맴버 -> 필드+매서드+생성자	
	//필드
	public int num1;//인스턴스맴버
	public int num2;//인스턴스맴버
	public int sum;//인스턴스맴버
	public double avg;//인스턴스맴버
	public String op;//인스턴스맴버
	public static final int MAX=100;// 클래스맴버(static)

	// @NoArgsConstruct
	public Class2() {
		System.out.println("기본생성자");
	}

	public Class2(int num1,int num2,String op) {
		System.out.println("다른 생성자");
		this.num1=num1;
		this.num2=num2;
		this.op=op;
	}

	public int getSum() {
		return num1+num2;
	}
	public String calMethod() {		
//		this.sum=this.getSum();
		sum=this.getSum();//합계
		avg=sum/2.0;
		
		String rs="";
		
		if(op.equals("+")) {
//			rs=num1+"+"+num2+"="+(num1+num2);
			rs=num1+"+"+num2+"="+sum;
		}else if(op.equals("-")) {
			rs=num1+"-"+num2+"="+(num1-num2);
		}else if(op.equals("*")) {
			rs=num1+"*"+num2+"="+(num1*num2);
		}else if(op.equals("/")) {
			rs=num1+"/"+num2+"="+(num1/num2);
		}else if(op.equals("평균")) {
			rs=num1+", "+num2+", 평균 -> "+avg;
		}else if(op.equals("exit")) {
			rs="종료";
		}else {
			rs="입력값 오류! 다시 입력하세요";
		}		
		
		
		return rs;	
		
	}
}
