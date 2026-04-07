package org.java.guiEx;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class ActionListenerSub implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e);
		System.out.println(e.getSource()); // 이벤트 적용 객체
		System.out.println(e.getID()); //고유아이디
	}	
	
}
public class ActionEventEx1 extends JFrame {

	public ActionEventEx1() {		
		this.setTitle("ActionListener");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

		JButton btn1 = new JButton("BUTTON1");
		JButton btn2 = new JButton("BUTTON2");

		this.add(btn1);		
		this.add(btn2);		
		
		ActionListenerSub a1= new ActionListenerSub();
		
		btn1.addActionListener(a1);// actionPerformed 매서드 구현 
		btn2.addActionListener(a1);// actionPerformed 매서드 구현 
		
		this.setSize(500, 300);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		System.out.println("ActionListener");
		new ActionEventEx1();
	}
	
}
