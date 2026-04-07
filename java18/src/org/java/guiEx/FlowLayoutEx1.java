package org.java.guiEx;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx1 extends JFrame {	
	public FlowLayoutEx1() {
//		setTitle("FlowLayout"); //this생략가능
		this.setTitle("FlowLayout");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		Container container = this.getContentPane(); //생략가능
//		container.setLayout(new FlowLayout());//생략가능
		
//		this.setLayout(new FlowLayout(FlowLayout.CENTER));
//		this.setLayout(new FlowLayout(FlowLayout.LEFT));
//		this.setLayout(new FlowLayout(FlowLayout.RIGHT));
//		this.setLayout(new FlowLayout(FlowLayout.CENTER,100,20));
		this.setLayout(new FlowLayout(FlowLayout.CENTER,100,50));
		JButton jButton1= new JButton("BTN1");
		this.add(jButton1);
		this.add(new JButton("BTN2"));
		this.add(new JButton("BTN3"));		
		this.setSize(500, 300);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		System.out.println("FlowLayout 배치관리자");
		new FlowLayoutEx1();
		
		
		
	}
}
