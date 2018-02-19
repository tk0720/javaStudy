package com.ex.day180219;

interface InterTest {
	// 인터페이스는 일반 멤버 메서드 x, 정의하면 자동으로 상수 및 추상 메서드로 정의
	static final int A = 100; // 상수
	abstract int getA(); // abstract 생략 가능
}

public class InterTestEx implements InterTest {
	
	// 오버라이딩
	public int getA() {
		return A;
	}

	public static void main(String[] args) {
		InterTestEx it1 = new InterTestEx();
		System.out.println("getA() : " + it1.getA());
	}


}
