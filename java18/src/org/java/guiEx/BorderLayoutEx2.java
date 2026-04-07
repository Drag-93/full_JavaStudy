package org.java.guiEx;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx2 {
	

	public static void main(String[] args) {
		
		System.out.println("BorderLayout");
		JFrame jFrame=new JFrame();
		
		jFrame.setTitle("BorderLayout"); // 동서남북
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jFrame.setLayout(new BorderLayout());
		
		jFrame.add(new JButton("NORTH"),BorderLayout.NORTH);  //북
		jFrame.add(new JButton("EAST"),BorderLayout.EAST);     //동
		jFrame.add(new JButton("SOUTH"),BorderLayout.SOUTH);  //남
		jFrame.add(new JButton("WEST"),BorderLayout.WEST);     //서
		jFrame.add(new JButton("CENTER"),BorderLayout.CENTER);  //중앙
		
		jFrame.setSize(500,300);
		jFrame.setVisible(true);
	}
}
