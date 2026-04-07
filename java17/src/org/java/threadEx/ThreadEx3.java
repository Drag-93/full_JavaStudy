package org.java.threadEx;

//2. Runnable인터페이스 구현
class ThreadSub3 implements Runnable {
	@Override
	public void run() {
		System.out.println("run() -> 오버라이딩");
	}
}

public class ThreadEx3 {

	public static void main(String[] args) {
		// 다형성
		// 1. Runnable
		Runnable r1 = new ThreadSub3();
		// 2. Thread
		Thread t1 = new Thread(r1);
		t1.run();
		t1.start();
		System.out.println(t1.currentThread());
		System.out.println(t1.getId());
		System.out.println(t1.getName());

	}
}
