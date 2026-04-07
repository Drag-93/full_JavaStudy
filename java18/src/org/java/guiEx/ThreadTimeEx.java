package org.java.guiEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerTread extends Thread {
	JLabel timJLabel;

	public TimerTread(JLabel timJLabel) {
		this.timJLabel = timJLabel;
	}

	int count = 0;

	@Override
	public void run() {

		while (true) {
			count++;
		
			timJLabel.setText(Integer.toString(count));
			try {
				Thread.sleep(1000);// 1초마다 1++,,,, Label에 추가
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadTimeEx extends JFrame {

	public ThreadTimeEx() {

		this.setTitle("Thread Timer예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// x누르면 닫기
		this.setLayout(new FlowLayout(FlowLayout.CENTER));// 레이이아웃 배치, 기본

		Container container = this.getContentPane(); // 컨테이너 패널추가
		container.setLayout(new FlowLayout());

		JLabel jLabel = new JLabel();// 타이머 값
		// font-family,font-weight,font-size
		jLabel.setFont(new Font("Gothic", Font.BOLD, 120));
		container.add(jLabel);

		setSize(500, 300); // 크기
		setVisible(true);// 보여라

		TimerTread timerTread = new TimerTread(jLabel);
		timerTread.start();
	}

	public static void main(String[] args) {
		new ThreadTimeEx();
	}

}
