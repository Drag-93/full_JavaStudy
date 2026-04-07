package org.java.threadEx;
//2. Runnable인터페이스 구현
class ThreadSub4 implements Runnable {
	int num = 0;
	
	@Override
	public void run() {
		System.out.println("Thread t4 run() -> ");

		for (int i = 0; i < 3; i++) {
			num++;
			System.out.println("i -> " + i);
			try {
				Thread.sleep(1000); // 1초동안 멈춤
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("t3 run() 실행 -> " + num);
		}
	}
}

public class ThreadEx4 {

	public static void main(String[] args) {

		System.out.println("Thread");
		System.out.println("=======구현클래스(implements)========");
		// 1. Runnable
		Runnable t1 = new ThreadSub4();
		// 2. Thread <-
		Thread t2 = new Thread(t1);
		t2.start();
		
		System.out.println("=======구현클래스(인자)========");
		Thread t3 = new Thread(new ThreadSub4());
		t3.start();
				
		System.out.println("======익명클래스이용=====");
		Thread t4 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread  t4 run() -> ");
				int num = 0;
				for (int i = 0; i < 3; i++) {
					num++;
					System.out.println("i -> " + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("t4  run() 실행 -> " + num);
				}
			}
		});
		t4.start();
		
		System.out.println("======익명클래스이용-> 람다식 =====");
		Thread t5 = new Thread(() -> {			
			System.out.println("Thread  t5 run() -> ");			
			int num = 0;
			for (int i = 0; i < 3; i++) {
				num++;
				System.out.println("i -> " + i);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("t5  run() 실행 -> " + num);
			}

		});
		t5.start();		
		
		System.out.println("실행 중인 Thread -> " + Thread.currentThread());
		System.out.println("main() -> 종료 !! ");

	}
}
