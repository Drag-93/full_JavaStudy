package org.java.threadEx;

//1. Thread클래스를 상속 받아서 run()오버라이딩
class ThreadSub0 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread -> run()");
	}
}

public class ThreadEx0 {

	public static void main(String[] args) {

		ThreadSub0 t1 = new ThreadSub0();
		System.out.println(t1);
		t1.run(); // thread
		t1.start(); // thread -> start, 시작

		System.out.println();

		ThreadSub0 t2 = new ThreadSub0();
		t2.run();
		t2.start();

		System.out.println(t1.currentThread());// 실행중인 thread
		System.out.println(t2.currentThread());// 실행중인 thread

	}

}
