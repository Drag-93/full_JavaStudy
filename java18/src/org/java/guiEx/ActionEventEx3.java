package org.java.guiEx;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionEventEx3 extends JFrame implements ActionListener {

	JButton jButton1, jButton2, jButton3;

	public ActionEventEx3() {
		setTitle("Swing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.CENTER, 30, 30));
		jButton1 = new JButton("BUTTON1");
		jButton2 = new JButton("BUTTON2");
		jButton3 = new JButton("BUTTON3");
		add(jButton1);
		add(jButton2);
		add(jButton3);

		setSize(500, 300);
		setVisible(true);
		// 버튼을 ActionEventEx3 리스너에 연결
		jButton1.addActionListener(this);
		jButton2.addActionListener(this);
		jButton3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// e.getSource() → 어떤 버튼인지 구분
		System.out.println(e.getSource() + " <<");
		if (e.getSource() == jButton1) {
			System.out.println("jButton1");
		} else if (e.getSource() == jButton2) {
			System.out.println("jButton2");
		} else if (e.getSource() == jButton3) {
			System.out.println("jButton3");
		}
	}

	public static void main(String[] args) {
		System.out.println("ActionListener");
		new ActionEventEx3();
	}

}
