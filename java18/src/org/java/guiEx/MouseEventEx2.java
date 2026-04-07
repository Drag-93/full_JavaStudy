package org.java.guiEx;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MouseEventEx2 extends JFrame {

	public MouseEventEx2() {
		this.setTitle("MouseEvent");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("BUTTON");
		this.add(btn1);
						//익명클래스 
		btn1.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("mouseReleas!");
			}

			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("mousePresse!");
				int x = e.getX();
				int y = e.getY();
				System.out.println("좌표 -> x:" + x + ", y:" + y);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("mouseExit!");
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("mouseEnter!");
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("mouseClick!"); // 마우스를 눌렀다 뗐을 때
			}
		});
		this.setLocation(300, 200);
		this.setSize(500, 300);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		System.out.println("MouseEvent");
		new MouseEventEx2();
	}

}
