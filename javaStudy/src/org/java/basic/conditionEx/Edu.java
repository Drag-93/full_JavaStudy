package org.java.basic.conditionEx;

public class Edu {
	//멤버
	//필드(속성,프로퍼티)
	public int kor; //인스턴스 멤버
	public int eng; //인스턴스 멤버
	public int math; //인스턴스 멤버
	public int sum; //인스턴스 멤버
	public double avg; //인스턴스 멤버
	
	//생성자
	//기본생성자
	public Edu() {
		System.out.println("기본생성자");
	}
	//다른생성자
	public Edu(int kor, int eng,int math) {
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		
	}
	//매서드
	//인스턴스 매서드
	public String gradeMethod() {
		sum=kor+eng+math;
		avg=sum/3.0;
		
		String grade = "";
		
		if(avg>=90) {
			grade="A";
		}else if(avg>=80) {
			grade="B";
		}else if(avg>=70) {
			grade="C";
		}else if(avg>=60) {
			grade="D";
		}else {
			grade="F";
		}
		return "학점: "+grade+"입니다";
	}
}
