package com.ex.day180213;

public class ObjArrayEx1 {

	public static void main(String[] args) {
		// 고정적 길이의 배열
		
		int[][] test;	// 다차원 배열 선언
		test = new int[2][3]; // 2행 3열
		
		test[0][0] = 100;
		test[0][1] = 200;
		test[0][2] = 300;
		// 1행 초기화 끝
		
		test[1][0] = 500;
		test[1][1] = 600;
		test[1][2] = 700;
		// 2행 초기화 끝
		
		for(int i=0; i<test.length; i++) {
			for(int j=0; j<test[i].length; j++) {
				// test라는 다차원 배열의 i번째 요소가 참조하는 1차원 배열의 길이
				System.out.println("test["+i+"]["+j+"]:"+test[i][j]);
			}
		}
		

	}

}
