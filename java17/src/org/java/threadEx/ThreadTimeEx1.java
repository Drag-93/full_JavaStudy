package org.java.threadEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerThread1 extends Thread {
	JLabel timerlabel; // Swing component

	public TimerThread1(JLabel timerlabel) {
		super();// JLabel생성
		this.timerlabel = timerlabel;
	}

	int count = 0;

	@Override
	public void run() {
		System.out.println("timer Thread -> ");
		while (true) {
			count++; // JLabel에 숫자 추가
			timerlabel.setText(Integer.toString(count));
			try {
				Thread.sleep(1000); // 1초마다 실행
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;// run()종료
			}
		}
	}
}

// Swing Component 상속 -> GUI
public class ThreadTimeEx1 extends JFrame {
	
	public ThreadTimeEx1() {
		// JFrame -> 설정
		// JFrame 시작
		setTitle("Thread Timer 예제");
		// X눌렀을 때 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();// 패널하나
		c.setLayout(new FlowLayout());

		// timerLaber
		JLabel timerLaber = new JLabel();// 타이머 값
		// (글꼴, 굵기, 크기)
		timerLaber.setFont(new Font("Gothic", Font.BOLD, 120));
		c.add(timerLaber);
		// timerLaber
		// width,height
		setSize(500, 300);
		setVisible(true);// 보여라
		// JFrame 종료
		// Thread
		TimerThread1 thread = new TimerThread1(timerLaber);
		thread.start();
	}

	public static void main(String[] args) {
		new ThreadTimeEx1();
	}

}
