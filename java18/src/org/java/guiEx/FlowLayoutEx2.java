package org.java.guiEx;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx2  {

	public static void main(String[] args) {
		
		System.out.println("FlowLayout 배치관리자");
		
		JFrame jFrame= new JFrame();

//		jFrame.setTitle("FlowLayout"); //this생략가능
		jFrame.setTitle("FlowLayout");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		jFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
//		jFrame.setLayout(new FlowLayout(FlowLayout.LEFT));
		jFrame.setLayout(new FlowLayout(FlowLayout.RIGHT));
//		jFrame.setLayout(new FlowLayout(FlowLayout.CENTER,100,20));
//		jFrame.setLayout(new FlowLayout(FlowLayout.CENTER,100,50));

		jFrame.add(new JButton("BTN1"));
		jFrame.add(new JButton("BTN2"));
		jFrame.add(new JButton("BTN3"));		
		jFrame.setSize(500, 300);
		jFrame.setVisible(true);
		
	}
}
