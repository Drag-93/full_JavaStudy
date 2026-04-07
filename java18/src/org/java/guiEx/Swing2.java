package org.java.guiEx;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing2 extends JFrame {

	public static void main(String[] args) {
	
		//JFrame 생성
		JFrame jframe = new JFrame();

		jframe.setTitle("Swing 제목");

		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jframe.setLayout(new FlowLayout(FlowLayout.CENTER));// 컴포넌트 배치 관리자

		JButton jbutton1 = new JButton("BUTTON1");
		JButton jbutton2 = new JButton("BUTTON2");
		JButton jbutton3 = new JButton("BUTTON3");

		jframe.add(jbutton1);
		jframe.add(jbutton2);
		jframe.add(jbutton3);

		jframe.setSize(400, 200); // JFrame(width,height)
		jframe.setVisible(true); /// 보여라

	}
}
