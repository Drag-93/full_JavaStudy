package org.java.basic.loopEx;

public class Quiz2 {

	public static void main(String[] args) {
		
		//  1~ 6 증가
		for (int i = 1; i <= 6; i++) {
		    for (int j = 1; j <= i; j++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		//  5~ 1 감소 
		for (int i = 5; i >= 1; i--) {
		    for (int j = 1; j <= i; j++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}		

		System.out.println();
		//
		
		System.out.println();
		
		
		
		int starNum = 0; 

        // 6+5 -> 11  별갯수
        for (int i = 1; i <= 11; i++) {
            
            if (i <= 6) {
            	// ~6 별갯수 증가
            	starNum++; // 1, 2, 3, 4, 5, 6
            } else {
            	// 별갯수 감소 7~
            	starNum--; // 5, 4, 3, 2, 1
            }

            // 결정된 starNum만큼 별 출력
            for (int j = 1; j <= starNum; j++) {
            	//1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1
                System.out.print("*");
            }
            System.out.println();
        }
		
		
	}
	
}
