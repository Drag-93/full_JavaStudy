package org.java.guiEx;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Swing3 {

	public static void main(String[] args) {

		System.out.println("JFrame");
		// 1. container 2. component 3. container.add() 4 .view
		// JFrame 생성
		JFrame jframe = new JFrame();
		jframe.setTitle("Swing 제목");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 2.Container생성 , 선택
		Container container = jframe.getContentPane(); // 생략 가능
		container.setLayout(new FlowLayout(FlowLayout.CENTER)); // 컴포넌트 기본 배치
//		container.setLayout(new FlowLayout(FlowLayout.LEFT)); // 컴포넌트 기본 배치
		// 3. Menu bar
		JMenuBar jMenuBar = new JMenuBar();
		jMenuBar.setSize(1500, 50);
		// 4. Menu ->
		JMenu menu = new JMenu("MENU");
		JMenu pl = new JMenu("PL");
		JMenu rdbms = new JMenu("RDBMS");
		JMenu web = new JMenu("WEB");
		JMenu aws = new JMenu("AWS");

		// Menu -> MenuBar추가
		jMenuBar.add(menu);
		jMenuBar.add(pl);
		jMenuBar.add(rdbms);
		jMenuBar.add(web);
		jMenuBar.add(aws);

		// 5. Menu Item n -> Menu에 추가
		JMenuItem menu1 = new JMenuItem("MENU1");
		JMenuItem menu2 = new JMenuItem("MENU2");
		JMenuItem menu3 = new JMenuItem("MENU3");
		JMenuItem menu4 = new JMenuItem("MENU4");

		menu.add(menu1);
		menu.add(menu2);
		menu.add(menu3);
		menu.add(menu4);

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

		container.add(jMenuBar); // jMenuBar를 container에 추가

		jframe.setSize(600, 400); // JFrame(width,height)
		jframe.setVisible(true); /// 보여라

	}
}
