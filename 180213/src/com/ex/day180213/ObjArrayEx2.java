package com.ex.day180213;

public class ObjArrayEx2 {

	public static void main(String[] args) {
		// 가변적 길이의 배열
		
		int[] t1 = {1,100};
		int[] t2 = {20,200,2000,20000};
		
		int[][] test = new int[2][]; // 다차원 배열 생성
		test[0] = t1;
		test[1] = t2;
		
		for(int i=0; i<test.length; i++) {
			for(int j=0; j<test[i].length; j++) {
				System.out.println("test["+i+"]["+j+"]:"+test[i][j]);
			}
			System.out.println("------------------------");
		}

	}

}
