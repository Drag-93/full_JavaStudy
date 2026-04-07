package org.java.guiEx;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AbsoluteLayoutEx extends JFrame {

	public AbsoluteLayoutEx() {
		this.setTitle("AbsoluteLayout");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 프레임 윈도우를 닫으면 프로그램 종료
		Container container = this.getContentPane();
		container.setLayout(null); // 기본값을 X -> 수동으로 재배치

		JLabel jLabel = new JLabel("Lable");
		JTextField jTextField = new JTextField("ID");
		JButton jButton1 = new JButton("BUTTON1");
		JButton jButton2 = new JButton("BUTTON1");

		jLabel.setOpaque(true); // 배경색 설정 기본 체크
		jLabel.setBackground(Color.CYAN);

		jLabel.setBounds(0, 0, 100, 100);  // 좌표(x,y) ,크기
		jTextField.setBounds(0, 0, 120, 80);
		jButton1.setBounds(0, 0, 150, 60);
		jButton2.setBounds(100, 150, 200, 40);

		container.add(jLabel);
		container.add(jTextField);
		container.add(jButton1);
		container.add(jButton2);

		this.setSize(500, 300);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		System.out.println("AbsoluteLayout");

		new AbsoluteLayoutEx();
	}
}
