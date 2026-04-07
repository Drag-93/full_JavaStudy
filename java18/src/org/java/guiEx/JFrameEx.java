package org.java.guiEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Menu;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JFrameEx {

	public static void main(String[] args) {

		System.out.println("JFrame");
		// 1. container 2. component 3. container.add() 4 .view

		// 1. JFrame생성
		JFrame jframe = new JFrame();
		// title생성
		jframe.setTitle("JFrame test");
		// 기본적으로 x 클릭후 JFrame 제거
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 3

		// 기본레이아웃 -> 컴포넌트의 배치 설정
//		jframe.setLayout(new FlowLayout());

		// 2.Container생성 , 선택
		Container container = jframe.getContentPane(); // 생략 가능
		container.setLayout(new FlowLayout(FlowLayout.CENTER)); // 컴포넌트 기본 배치

		// 3. Menu bar
		JMenuBar jMenuBar = new JMenuBar();
		jMenuBar.setSize(500, 50);

		container.add(jMenuBar);

		// 4. Menu ->
		JMenu pl = new JMenu("PL");
		JMenu rdbms = new JMenu("RDBMS");
		JMenu web = new JMenu("WEB");
		JMenu aws = new JMenu("AWS");

		jMenuBar.add(pl);
		jMenuBar.add(rdbms);
		jMenuBar.add(web);
		jMenuBar.add(aws);

		// 5. Menu Item
		JMenuItem java = new JMenuItem("JAVA");
		JMenuItem spring = new JMenuItem("SPRING");
		JMenuItem react = new JMenuItem("REACT");

		pl.add(java);
		pl.add(spring);
		pl.add(react);

		JMenuItem oracle = new JMenuItem("ORACLE");
		JMenuItem mysql = new JMenuItem("MYSQL");
		JMenuItem mriadb = new JMenuItem("MRIADB");
		
		rdbms.add(oracle);
		rdbms.add(mysql);
		rdbms.add(mriadb);
		
		JMenuItem html = new JMenuItem("HTML");
		JMenuItem css = new JMenuItem("CSS");
		JMenuItem js = new JMenuItem("JS");
		
		web.add(html);
		web.add(css);
		web.add(js);		
	
		
		JMenuItem ec2 = new JMenuItem("ec2");
		JMenuItem rds = new JMenuItem("rds");
		JMenuItem rabitmq = new JMenuItem("rabitmq");
		
		aws.add(ec2);
		aws.add(rds);
		aws.add(rabitmq);
		// 6. JButton생성
		JButton jButton1 = new JButton();		
		jButton1.setText("BTN1");
		jButton1.setSize(50, 50);

		JButton jButton2 = new JButton();		
		jButton2.setText("BTN2");
		jButton2.setSize(50, 50);

		JButton jButton3 = new JButton();		
		jButton3.setText("BTN3");
		jButton3.setSize(50, 50);
		
		container.add(jButton1);
		container.add(jButton2);
		container.add(jButton3);
		
		
		//7. Label
 		Label label1=new Label("Label1");
 		Label label2=new Label("Label2");
		
 		container.add(label1);
 		container.add(label2);
 		
		// JFrame크기
		jframe.setSize(500, 300);
		// 보여라~
		jframe.setVisible(true);


	}
}
