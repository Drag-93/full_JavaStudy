package org.project.controller;

import org.project.connect.DBConnect;

public class FrontController {
	public static void main(String[] args) {
		System.out.println("FrontController");
		DBConnect.getConnection();
	}
}
