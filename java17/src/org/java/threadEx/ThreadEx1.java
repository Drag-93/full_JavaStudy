package org.java.threadEx;
//Thread클래스를 상속 받아서 run()오버라이딩 
//1. Thread 구현
class ThreadSub1 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread -> run() ");
	}
}

public class ThreadEx1 {

	public static void main(String[] args) {
		ThreadSub1 t1 = new ThreadSub1();
		System.out.println(t1);
		t1.run(); // Thread 실행
		t1.start();// -> 실제 시작
		System.out.println();
		System.out.println("current -> " + t1.currentThread());
		System.out.println("Name -> " + t1.getName());
		System.out.println("Id -> " + t1.getId());

	}
}
