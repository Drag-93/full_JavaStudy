package org.java.guiEx;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx1 extends JFrame{
	
	public BorderLayoutEx1() {
		//this생략 가능
		this.setTitle("BorderLayout"); // 동서남북
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// BoarderLayout설정
		this.setLayout(new BorderLayout());
		
		this.add(new JButton("NORTH"),BorderLayout.NORTH);  //북
		this.add(new JButton("EAST"),BorderLayout.EAST);     //동
		this.add(new JButton("SOUTH"),BorderLayout.SOUTH);  //남
		this.add(new JButton("WEST"),BorderLayout.WEST);     //서
		this.add(new JButton("CENTER"),BorderLayout.CENTER);  //중앙
		
		this.setSize(500,300);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		
		System.out.println("BorderLayout");
		
		new BorderLayoutEx1();
	}
}
