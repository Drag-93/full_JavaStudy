package org.java.threadEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerThread2 extends Thread {	
	
	JLabel timerlabel; // Label 생성
	public TimerThread2(JLabel timerlabel) {
		super();
		this.timerlabel = timerlabel;
	}
	int count = 0;
	@Override
	public void run() {

		System.out.println("timer Thread -> ");
		while (true) {
			// int -> String
			timerlabel.setText(Integer.toString(count));
			try {
				Thread.sleep(1000); // 1초마다 실행
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;// run()종료
			}
			count++;
		}
	}
}

public class ThreadTimeEx2 {

	public static void main(String[] args) {
		
		System.out.println("Thread실습");

		// 1. JFrame 생성
		JFrame jFrame = new JFrame("Thread Test");
//		jFrame.setTitle("Thread Test");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 3
		// 2. Container 생성 -> 컴포넌트의 모아둔~
		Container container = jFrame.getContentPane();
		container.setLayout(new FlowLayout());
		// 3.Label 생성
		JLabel jLabel = new JLabel();
		jLabel.setFont(new Font("Arial", Font.ITALIC, 100));
		// 4.Label -> 패널(컨테이너)에 추가
		container.add(jLabel);
		// 5.JFrame 크기 설정
		jFrame.setSize(500,300);
		// 6.JFrame 보여라~
		jFrame.setVisible(true);
		// 7. Thread 연동
		TimerThread2 timer = new TimerThread2(jLabel);
		timer.start(); // Thread 시작
		
		
		
	}
}
