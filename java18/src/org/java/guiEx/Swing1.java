package org.java.guiEx;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing1 extends JFrame{

	public Swing1() {
		///this생략 - this -> JFrame자신

		setTitle("Swing 제목");		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		setLayout(new FlowLayout(FlowLayout.CENTER));// 컴포넌트 배치 관리자
		
		JButton jbutton1= new JButton("BUTTON1");
		JButton jbutton2= new JButton("BUTTON2");
		JButton jbutton3= new JButton("BUTTON3");
		
		add(jbutton1);
		add(jbutton2);
		add(jbutton3);
		
		setSize(400, 200); //JFrame(width,height)
		setVisible(true); /// 보여라	
	}
	
	public static void main(String[] args) {
		new Swing1();
	}
}
