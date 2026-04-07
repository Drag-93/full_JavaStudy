package org.java.guiEx;

import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing0 extends JFrame {

	JButton jButton1 = null;
	JButton jButton2 = null;
	JButton jButton3 = null;
	JButton jButton4 = null;
	
	JButton jbtn1,jbtn2,jbtn3,jbtn4,jbtn5;
	
	public Swing0() {
		//this생략가능
	//	this.setTitle("Swing");
		setTitle("Swing");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x close
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		jButton1=new JButton("Button1");
		jButton2=new JButton("Button2");
		jButton3=new JButton("Button3");
		jButton4=new JButton("Button4");
		
		this.add(jButton1);
		this.add(jButton2);
		this.add(jButton3);
		this.add(jButton4);
		
		this.setSize(500,200);	//크기
		this.setVisible(true);  // 보여라
		
	}
	
	public static void main(String[] args) {
	
		new Swing0();
	}
	

}
