package org.java.guiEx;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionEventEx2 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e);
		System.out.println(e.getSource()); // 이벤트 적용 객체
		System.out.println(e.getID());

	}

	public static void main(String[] args) {
		System.out.println("ActionListener");
		JFrame jFrame = new JFrame();

		jFrame.setTitle("ActionListener");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setLayout(new FlowLayout());

		JButton btn1 = new JButton("BUTTON");

		jFrame.add(btn1);

//		ActionListenerSub a1= new ActionListenerSub();		 
		ActionEventEx2 a1 = new ActionEventEx2();
		btn1.addActionListener(a1);// actionPerformed 매서드 구현

		jFrame.setSize(500, 300);
		jFrame.setVisible(true);
	}

}
