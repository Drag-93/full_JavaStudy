package org.java.threadEx;

class ThreadSub2 extends Thread{		
	int[] arrInt=new int[10];
	int i=0;	
	
	@Override
	public void run() {		
		i++;
		for(int j=0;j<arrInt.length;j++) {
			System.out.println("thread 실행 run() ->  j => "+j);
			//1부터 10까지 저장
			arrInt[j]=i;
			
			try {
				Thread.sleep(1000);//잠시 멈춤, 1000-> 1초
			} catch (InterruptedException e) {				
				e.printStackTrace();
			} 
			
			System.out.println("Tread 실행 -> "+ i);
		}
	}	
}

public class ThreadEx2 {
	public static void main(String[] args) {
		ThreadSub2 t2= new ThreadSub2();
		t2.run();  //일반매서드
		t2.start();	//스레드 시작	
		System.out.println("current -> "+t2.currentThread());
		System.out.println(t2.arrInt);
		
	} 

}
