package org.java.guiEx;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GridLayoutEx extends JFrame {
	public GridLayoutEx() {
		this.setTitle("GridLayout");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
									//행, 열,가로간격,세로간격
//		this.setLayout(new GridLayout(4, 2, 100, 20));
//		GridLayout grid1= new GridLayout(4, 2, 100, 20);
//		this.setLayout(grid1);		
		GridLayout grid2 = new GridLayout();
		// 4행 2열
		grid2.setRows(4);	//행
		grid2.setColumns(2);//열
		grid2.setHgap(5);  // 격자 사이의 수평 간격
		grid2.setVgap(5);  // 격자 사이의 수작 간격
		this.setLayout(grid2);		
		
		this.add(new Label("USERID")); // 수정불가 -> 보이기만
		this.add(new JTextField("id")); // 입력가능 -> input 
		this.add(new Label("USERPW"));
		this.add(new JPasswordField("Pw"));// 비빏ㄴ호 ****
		this.add(new Label("USERNAME"));
		this.add(new JTextField("name"));
		this.add(new Label("ADDRESS"));
		this.add(new JTextField("address"));
		
		this.setSize(500, 300);
		this.setVisible(true);
	}

	public static void main(String[] args) {

		System.out.println("GridLayout");

		new GridLayoutEx();

	}
}
