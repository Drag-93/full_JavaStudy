package org.java.guiEx;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MouseEventEx1 extends JFrame implements MouseListener {
	
	//반드시 오버라이딩 해야된다.
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(e);
		System.out.println("mouseClick!"); // 마우스를 눌렀다 뗐을 때
	}
	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println(e);
		System.out.println("mousePresse!");// 마우스를 눌렀을 때 ,mouseDown
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println(e);
		System.out.println("mouseRelease!"); // 마우스를 뗐을 때,mouseUp
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println(e);
		System.out.println("mouseEnter!"); // 마우스를 범위에 올렸을 때
	}
	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println(e);
		System.out.println("mouseExit!"); // 마우스를 범위에서 제거
	}

	public MouseEventEx1() {
		
		this.setTitle("MouseEvent");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

		JButton btn1 = new JButton("BUTTON");

		this.add(btn1);		
		
		//이벤트를 btn1에 연결
		//현재 클래스(this)를 버튼의 이벤트 리스너로 등록
		btn1.addMouseListener(this);	
		
		
		this.setSize(500, 300);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		System.out.println("MouseEvent");		
		new MouseEventEx1();
		
		
	}
}
