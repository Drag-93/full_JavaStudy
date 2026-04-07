package org.java.threadEx;

// Thread ,String 매서드등~
class ThreadSub5 extends Thread {	
	int count = 0; // thread횟수
	String javaStr = "java Project2026";
	// 1초 마다 javaStr문자열 한글자씩 콘솔에 출력
	@Override
	public void run() {
		count++;
		System.out.println("Thread : " + count);

		for (int i = 0; i < javaStr.length(); i++) {
			// 문자열에서 인덱스에 해당하는 char(한글자)
			System.out.print(javaStr.charAt(i));
			try {
				Thread.sleep(1000); // 1초 정지
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println();
	}
}

public class ThreadEx5 {

	public static void main(String[] args) {
		System.out.println("Thread");

		Thread t1 = new ThreadSub5();
		t1.run();  //일반매서드  -> run매서드 for문이 모두 종료 -> 동기적
		t1.start();  // 스레드 시작 -> 비동기적
		System.out.println();
		
		System.out.println("1 실행 중인 Thread -> " + Thread.currentThread());
		
		
		
	}
}
