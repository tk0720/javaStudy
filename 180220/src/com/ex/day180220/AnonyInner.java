package com.ex.day180220;

interface TestInter {
	int data = 10000;
	public void printData();
}

public class AnonyInner {
	
	public void test() {
		new TestInter() {
			public void printData() {
				System.out.println("data : " + data);
			}
		}.printData(); // 익명 내부 클래스가 끝나기 전에 메서드 호출
	}
	
	public static void main(String[] args) {
		AnonyInner ai = new AnonyInner();
		ai.test();
//		new AnonyInner().test(); // 익명으로 객체 생성
	}

}
