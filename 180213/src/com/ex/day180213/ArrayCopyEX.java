package com.ex.day180213;

public class ArrayCopyEX {

	public static void main(String[] args) {
		// 배열 복사
		
		byte[] ar1 = {11,22,33,44,55};
		byte[] ar2 = new byte[10];	// 배열 10개짜리 생성, 초기값 0으로 모든 요소에 채워짐
		System.arraycopy(ar1, 0, ar2, 3, 5);
		// 배열 복사
		// 소스 배열, 소스 배열의 복사 시작 위치, 전송처 배열, 전송처 배열의 복사 시작 위치, 복사되는 배열 요소의 수
		// ar1이라는 배열 요소 index 0부터 복사
		// ar2 배열에 index 3부터 5개 칸에 붙여 넣는다
		
		System.out.println("-----원본 배열-----");
		for(byte n : ar1) {
			System.out.println(n);
		}

		System.out.println("-----복사본 배열-----");
		for(byte n : ar2) {
			System.out.println(n);
		}

	}

}
